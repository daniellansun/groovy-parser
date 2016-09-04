person.@name
person.child.@name
person.@name.count
person.&sayHello
person.child.&sayHello
person?.child
person?.@child
person*.child
person*.@child
person.'name'
person.@'name'
person?.'name'
person?.@'name'
person*.'child'
person*.@'child'
person.&'sayHello'
person.new
person.@new
person?.new
person?.@new
person*.new
person*.@new
person.&new
person."$name"
person.@"$name"
person?."$name"
person?.@"$name"
person*."$name"
person*.@"$name"
person.&"$methodName"
person.("$firstname" + "$lastname")
person.@("$firstname" + "$lastname")
person?.("$firstname" + "$lastname")
person?.@("$firstname" + "$lastname")
person*.("$firstname" + "$lastname")
person*.@("$firstname" + "$lastname")
person.&("$method" + "$name")

a.b?.c[1, 2, 3]*.d
a[1, *[2, 3]]*.b
a[*[2, 3]]*.b

person
*.
child
*.
@child
?.
child
?.
@child
.
child
        .
@name
.&
length

a.b()
a.'b'()
a."$b"()
a?.b()
a*.b()
a()
'a'()
"$a"()

obj.a
    .b()
    ?.c()
    *.d()

person*.child[1, 2 + 6, *[3, 4]]*.@child?.child?.@child.child.getChild().'child'."$child".('chi' + 'ld').@name.class.&equals


