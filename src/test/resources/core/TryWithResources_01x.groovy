import java.io.*


class Resource implements Closeable {
    int resourceId;
    static closedResourceIds = [];
    static exMsg = "failed to close";

    public Resource(int resourceId) {
        this.resourceId = resourceId;
    }

    public void close() {
        if (3 == resourceId) throw new IOException(exMsg);

        closedResourceIds << resourceId
    }
}

// test case 1
def a = 1;
try (Resource r1 = new Resource(1)) {
    a = 2;
}
assert Resource.closedResourceIds == [1]
assert 2 == a

// test case 2
Resource.closedResourceIds = []
final exMsg = "resource not found";
try {
    // try { ... } should throw the IOException, while the resource should be closed
    try (Resource r1 = new Resource(2)) {
        throw new FileNotFoundException(exMsg)
    }
} catch(FileNotFoundException e) {
    assert exMsg == e.getMessage()
}
assert Resource.closedResourceIds == [2]

// test case 3
Resource.closedResourceIds = []
a = 1;
try {
    try (Resource r1 = new Resource(3)) {
        a = 2;
    }
} catch (IOException e) {
    assert Resource.exMsg == e.getMessage()
}
assert 2 == a;
assert Resource.closedResourceIds == []

// test case 4
Resource.closedResourceIds = []
try {
    // try { ... } should throw the IOException, while the resource should be closed
    try (Resource r1 = new Resource(3)) {
        throw new FileNotFoundException(exMsg)
    }
} catch(FileNotFoundException e) {
    assert exMsg == e.getMessage()

    def suppressedExceptions = e.getSuppressed();
    assert suppressedExceptions.length == 1
    assert suppressedExceptions[0] instanceof IOException
    assert suppressedExceptions[0].getMessage() == Resource.exMsg
}
assert Resource.closedResourceIds == []
