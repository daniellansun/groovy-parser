outer:
for (def i in [1, 2]) {
    for (def j in [1, 2, 3, 4, 5]) {
        if (j == 1) {
            break outer;
        } else if (j == 2) {
            continue outer;
        }

        if (j == 3) {
            continue;
        }

        if (j == 4) {
            break;
        }
    }
}