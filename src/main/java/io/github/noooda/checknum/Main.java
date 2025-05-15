package io.github.noooda.checknum;

import io.github.noooda.checknum.number.Number;

public class Main {
    public static void main(String[] args) {
        Number num = new Number(0);

        System.out.println(num.getNumber());

        if (num.isEven()) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        if (num.isPrime()) {
            System.out.println("素数です");
        } else {
            System.out.println("素数ではありません");
        }

        num.updateNumber(1);

        System.out.println(num.getNumber());

        if (num.isEven()) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        if (num.isPrime()) {
            System.out.println("素数です");
        } else {
            System.out.println("素数ではありません");
        }

        num.updateNumber(2);

        System.out.println(num.getNumber());

        if (num.isEven()) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        if (num.isPrime()) {
            System.out.println("素数です");
        } else {
            System.out.println("素数ではありません");
        }

        num.updateNumber(1000000001);

        System.out.println(num.getNumber());

        if (num.isEven()) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        if (num.isPrime()) {
            System.out.println("素数です");
        } else {
            System.out.println("素数ではありません");
        }
    } 
}
