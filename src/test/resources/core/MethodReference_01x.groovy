import java.util.stream.Collectors

assert ['1', '2', '3'] == [1, 2, 3].stream().map(Integer::toString).collect(Collectors.toList())

def robot = new Robot();
assert ['Hi, Jochen', 'Hi, Paul', 'Hi, Daniel'] == [new Person('Jochen'), new Person('Paul'), new Person('Daniel')].stream().map(robot::greet).collect(Collectors.toList())
//TODO assert ['Jochen', 'Paul', 'Daniel'] == [new Person('Jochen'), new Person('Paul'), new Person('Daniel')].stream().map(Person::getName).collect(Collectors.toList())
// ----------------------------------
class Person {
    private String name;

    public Person(String name) {
        this.name = name
    }

    public String getName() {
        return this.name;
    }
}
class Robot {
    public String greet(Person p) {
        return "Hi, ${p.name}"
    }
}