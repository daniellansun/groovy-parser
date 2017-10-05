import groovy.transform.CompileStatic

def testConditionalStatementAsExpression() {
    def a = 1
    def b = 2
    def max = if (a > b) a else b
    assert 2 == max

    def c = 1
    def result = switch (c) {
        case 1:
            2; break
        default:
            0
    }
    assert 2 == result

    def d = 6
    d = if (d > 0) 1 else if (d == 0) 0 else -1
    assert 1 == d

    def e = 7
    e = switch (e) {
        case 5:
            6; break
        case 6:
            7; break
        case 7:
            8; break
        default:
            0
    }
    assert 8 == e
}

testConditionalStatementAsExpression()

@CompileStatic
def testCsConditionalStatementAsExpression() {
    def a = 1
    def b = 2
    def max = if (a > b) a else b
    assert 2 == max

    def c = 1
    def result = switch (c) {
        case 1:
            2; break
        default:
            0
    }
    assert 2 == result

    def d = 6
    d = if (d > 0) 1 else if (d == 0) 0 else -1
    assert 1 == d

    def e = 7
    e = switch (e) {
        case 5:
            6; break
        case 6:
            7; break
        case 7:
            8; break
        default:
            0
    }
    assert 8 == e
}

testCsConditionalStatementAsExpression()
