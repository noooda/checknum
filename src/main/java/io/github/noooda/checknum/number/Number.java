package io.github.noooda.checknum.number;

public class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void updateNumber(int number) {
        this.number = number;
    }

    // 偶奇判定
    public boolean isEven() {
        return this.number % 2 == 0;
    }

    // 素数判定
    public boolean isPrime() {
        if (this.number < 2) return false;

        if (this.number == 2) return true;

        for (int i = 2; i < this.number; i++) {
            if (this.number % i == 0) return false;
        }

        return true;
    }
}
