import groovy.transform.CompileStatic

def testArrayLiteral() {
    int[] a = {1, 2, 3}
    assert 3 == a.length
    assert 1 == a[0]
    assert 2 == a[1]
    assert 3 == a[2]

    int[][] a2 = {
        {1, 2, 3},
        {1, 2, 3, 4}
    }
    assert 2 == a2.length
    assert 3 == a2[0].length
    assert 1 == a2[0][0]
    assert 2 == a2[0][1]
    assert 3 == a2[0][2]
    assert 4 == a2[1].length
    assert 1 == a2[1][0]
    assert 2 == a2[1][1]
    assert 3 == a2[1][2]
    assert 4 == a2[1][3]
}
testArrayLiteral()

@CompileStatic
def testArrayLiteralCS() {
    int[] a = {1, 2, 3}
    assert 3 == a.length
    assert 1 == a[0]
    assert 2 == a[1]
    assert 3 == a[2]

    int[][] a2 = {
        {1, 2, 3},
        {1, 2, 3, 4}
    }
    assert 2 == a2.length
    assert 3 == a2[0].length
    assert 1 == a2[0][0]
    assert 2 == a2[0][1]
    assert 3 == a2[0][2]
    assert 4 == a2[1].length
    assert 1 == a2[1][0]
    assert 2 == a2[1][1]
    assert 3 == a2[1][2]
    assert 4 == a2[1][3]
}
testArrayLiteralCS()
