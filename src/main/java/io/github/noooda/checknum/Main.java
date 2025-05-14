package io.github.noooda.checknum;

import io.github.noooda.checknum.number.Number;

public class Main {
    public static void main(String[] args) {
        Number num = new Number(19);
        
        if (num.isEven()) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
    } 
}
