assert 9 == [1, 2, 3].stream().map(e -> e + 1).reduce(0, (r, e) -> r + e)
assert 9 == [1, 2, 3].stream().map(e -> {e + 1}).reduce(0, (r, e) -> r + e)
assert 9 == [1, 2, 3].stream().map((e) -> e + 1).reduce(0, (r, e) -> r + e)
assert 9 == [1, 2, 3].stream().map((e) -> e + 1).reduce(0, (r, e) -> {r + e})
assert 32 == ((e) -> e + 1)(2) + ((e, f) -> e + f)(2, 3) + ((e, f, g) -> e * f * g)(2, 3, 4)

assert 24 == ((e, f, g) -> {e * f * g})(2, 3, 4)
assert 24 == ((int e, int f, int g) -> {
    int tmpE = e;
    int tmpF = f;
    int tmpG = g;
    return tmpE * tmpF * tmpG;
})(2, 3, 4)
assert 24 == ((int e, int f, int g=4) -> {
    int tmpE = e;
    int tmpF = f;
    int tmpG = g;
    return tmpE * tmpF * tmpG;
})(2, 3)

def list = [2, 3, 1]
Collections.sort(list, (n1, n2) -> n1 <=> n2)
assert [1, 2, 3] == list

assert 1 == (e -> e)(1)
assert 2 == (() -> 2)()

def lambda = e -> e;
assert 1 == lambda(1)

lambda = e -> e + 1;
assert 2 == lambda(1)

int sum = 0;
[1, 2, 3].forEach(e -> {
    sum += e
})
assert 6 == sum;

def c = { (e) -> e * 2 }
assert 6 == c()(3)

c = { (e) -> { e * 2 } }
assert 6 == c()(3)

assert ['1', '2', '3'] == [0, 1, 2].collect(e -> String.valueOf e + 1)
assert [3, 4, 5] == ['0', '1', '2'].collect(e -> Integer.parseInt e plus 1 plus 2)
assert [4] == ['0'].collect(e -> e.length() plus 1 plus 2)