a.m(x: 1, y: 2) {
    println('named arguments');
}

a.m(x: 1, y: 2, z: 3) {
    println('named arguments');
} {
    println('named arguments');
}


a.m(x: 1, y: 2, z: 3)

{
    println('named arguments');
}

{
    println('named arguments');
}



a.m(1, 2) {
    println('normal arguments');
}

a.m(1, 2, 3) {
    println('normal arguments');
} {
    println('normal arguments');
}

a.m(1, 2, 3)

{
    println('normal arguments');
}


{
    println('normal arguments');
}




m {
    println('closure arguments');
}

m {
    println('closure arguments');
} {
    println('closure arguments');
}

m {
    println('closure arguments');
} {
    println('closure arguments');
} {
    println('closure arguments');
}


m

{
    println('closure arguments');
}

{
    println('closure arguments');
}

{
    println('closure arguments');
}

'm' {
    println('closure arguments');
}
