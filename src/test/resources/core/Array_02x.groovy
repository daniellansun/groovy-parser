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

    int[] a3 = { 1 }
    assert 1 == a3[0]

    int[][] a4 = { {1} }
    assert 1 == a4[0][0]

    int[][] a5 = { {1} }
    assert 1 == a5[0][0]

    Closure[] a6 = {{-> 1}}
    assert 1 == a6[0]()

    int[][] a7 = { new int[] {1} }
    assert 1 == a7[0][0]

    int[][] a8 = { {1}, new int[] {2, 3} }
    assert 2 == a8.length
    assert 1 == a8[0][0]
    assert 2 == a8[1][0]
    assert 3 == a8[1][1]

    int[][] a9 = {{}}
    assert 0 == a9[0].length

    int[][] a10 = {{}, {1}}
    assert 2 == a10.length
    assert 0 == a10[0].length
    assert 1 == a10[1].length
    assert 1 == a10[1][0]


    def c = { 1 }
    assert 1 == c()
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

    int[] a3 = { 1 }
    assert 1 == a3[0]

    int[][] a4 = { {1} }
    assert 1 == a4[0][0]

    int[][] a5 = { {1} }
    assert 1 == a5[0][0]

    Closure[] a6 = {{-> 1}}
    assert 1 == a6[0]()

    int[][] a7 = { new int[] {1} }
    assert 1 == a7[0][0]

    int[][] a8 = { {1}, new int[] {2, 3} }
    assert 2 == a8.length
    assert 1 == a8[0][0]
    assert 2 == a8[1][0]
    assert 3 == a8[1][1]

    int[][] a9 = {{}}
    assert 0 == a9[0].length

    int[][] a10 = {{}, {1}}
    assert 2 == a10.length
    assert 0 == a10[0].length
    assert 1 == a10[1].length
    assert 1 == a10[1][0]

    def c = { 1 }
    assert 1 == c()
}
testArrayLiteralCS()
