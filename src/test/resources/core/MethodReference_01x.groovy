import java.util.stream.Collectors

// class::staticMethod
assert ['1', '2', '3'] == [1, 2, 3].stream().map(Integer::toString).collect(Collectors.toList())

// class::instanceMethod
assert ['A', 'B', 'C'] == ['a', 'b', 'c'].stream().map(String::toUpperCase).collect(Collectors.toList())



def robot = new Robot();

// instance::instanceMethod
assert ['Hi, Jochen', 'Hi, Paul', 'Hi, Daniel'] == [new Person('Jochen'), new Person('Paul'), new Person('Daniel')].stream().map(robot::greet).collect(Collectors.toList())

// class::staticMethod
assert ['Jochen', 'Paul', 'Daniel'] == [new Person('Jochen'), new Person('Paul'), new Person('Daniel')].stream().map(Person::getText).collect(Collectors.toList())

// instance::staticMethod
assert ['J', 'P', 'D'] == [new Person('Jochen'), new Person('Paul'), new Person('Daniel')].stream().map(robot::firstCharOfName).collect(Collectors.toList())

// class::instanceMethod
assert ['Jochen', 'Paul', 'Daniel'] == [new Person('Jochen'), new Person('Paul'), new Person('Daniel')].stream().map(Person::getName).collect(Collectors.toList())


// ----------------------------------
class Person {
    private String name;

    public Person(String name) {
        this.name = name
    }

    public String getName() {
        return this.name;
    }

    public static String getText(Person p) {
        return p.name;
    }
}
class Robot {
    public String greet(Person p) {
        return "Hi, ${p.name}"
    }

    public static char firstCharOfName(Person p) {
        return p.getName().charAt(0);
    }
}
