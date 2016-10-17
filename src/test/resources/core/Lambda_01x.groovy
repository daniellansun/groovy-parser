assert 9 == [1, 2, 3].stream().map((e) -> e + 1).reduce(0, (r, e) -> r + e)
assert 32 == ((e) -> e + 1)(2) + ((e, f) -> e + f)(2, 3) + ((e, f, g) -> e * f * g)(2, 3, 4)