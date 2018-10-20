import groovy.transform.CompileStatic

class SpecialSafeIndex {
    String name
    String location
}

@CompileStatic
def csSpecialSafeIndex() {
    SpecialSafeIndex ssi = SpecialSafeIndex?[name: 'Daniel.Sun', location: 'Shanghai']
    assert 'Daniel.Sun' == ssi.name
    assert 'Shanghai' == ssi.location
}
csSpecialSafeIndex()

def specialSafeIndex() {
    SpecialSafeIndex ssi = SpecialSafeIndex?[name: 'Daniel.Sun', location: 'Shanghai']
    assert 'Daniel.Sun' == ssi.name
    assert 'Shanghai' == ssi.location
}
specialSafeIndex()
