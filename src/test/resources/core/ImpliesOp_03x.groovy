import groovy.transform.CompileStatic

@CompileStatic
class Weather {
    def name

    public Object implies(Object obj) {
        return this.toString() + " => " + obj.toString()
    }

    @Override
    public String toString() {
        return name
    }
}

@CompileStatic
def test() {
    assert 'Rain => Under an umbrella' == (new Weather(name: "Rain") => 'Under an umbrella')
}

test();
