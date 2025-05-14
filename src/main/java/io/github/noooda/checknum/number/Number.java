package io.github.noooda.checknum.number;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    // 偶奇判定
    public boolean isEven() {
        return this.number % 2 == 0;
    }

    // 素数判定
    public boolean isPrime() {
        // 処理
        return true;
    }
}
