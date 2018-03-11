package com.infoshareacademy.interview;

public class Swaper {

    public void swapNumbers(int a, int b) {
        print(a, b);
        // 5, 9
        a = a + b;      // a = 5 + 9
        b = a - b;      // b = 14 - 9
        a = a - b;      // a = 14 - 5

        print(a, b);
    }

    private void print(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}
