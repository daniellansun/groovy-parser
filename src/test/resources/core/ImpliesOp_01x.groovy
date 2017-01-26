assert !(true => false)
assert true => true
assert false => true
assert false => false

assert !(1 == 1 => 2 == 3)
assert 1 == 1 => 1 == 1
assert 2 == 3 => 1 == 1
assert 2 == 3 => 2 == 3
