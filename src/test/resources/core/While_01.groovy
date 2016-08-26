while(true) assert true
while(true)
    assert true

while(true) {
    break;
}

out:
while(true) {
    break out;
}


while(true) {
    continue
}

out:
while(true) {
    continue out;
}

out1:
while(true) {
    continue out1;
    out2: while (true) {
        continue out2;
    }
}
