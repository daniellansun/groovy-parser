package test

// Custom operators should be declared first, then use.
// It can be declared in the class or script, but it must be declared static.
class A {
    static "`>?`"(int a, int b) {
        return Math.max(a, b);
    }
}

static "`<?`"(int a, int b) {
    return Math.min(a, b);
}

// Notice: the custom operator has lower priority,
// so if it is used with other operator and it is expected to be evaluated first,
// parentheses is required.
assert 2 == (1 `>?` 2)
assert 1 == (1 `<?` 2)
assert 7 == (1 + 3 `>?` 2 + 5)
assert 9 == 1 + (3 `>?` 2) + 5
