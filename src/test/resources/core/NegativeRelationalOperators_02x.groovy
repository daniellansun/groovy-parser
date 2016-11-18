import groovy.transform.CompileStatic

@CompileStatic
def cs() {
    assert 'a' instanceof String
    assert 'a' !instanceof Integer
    assert 1 <= 2
    assert 2 !<= 1
    assert 2 >= 1
    assert 1 !>= 2
    assert 1 < 2
    assert 2 !< 1
    assert 2 > 1
    assert 1 !> 2
    assert 1 in [1, 2]
    assert 3 !in [1, 2]
}

cs();