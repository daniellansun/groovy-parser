assert !(true => false)
assert true => true
assert false => true
assert false => false

assert !(1 == 1 => 2 == 3)
assert 1 == 1 => 1 == 1
assert 2 == 3 => 1 == 1
assert 2 == 3 => 2 == 3

assert true => true => true
assert !(true => true => false)
assert true => false => true
assert true => false => false
assert false => true => true
assert !(false => true => false)
assert false => false => true
assert !(false => false => false)
