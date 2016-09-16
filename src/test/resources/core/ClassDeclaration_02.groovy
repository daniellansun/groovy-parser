class AA {
    {
        println 123
    }
}

class BB {
    static {
        println '123'
    }
}

class CC {
    static
    {
        println '123'
    }
}

class DD {
    static {
        println '123'
    }

    {
        println 'abc'
    }
}

class EE {{}}
class FF {static {}}
class GG {static {};{}}