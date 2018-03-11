package com.infoshareacademy.interview;

public class StringPalindrom {

    public boolean isPalindrom(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() < 2) {
            return true;
        }

        return checkArrayIsPalindrom(s);
    }

    private boolean checkArrayIsPalindrom(String s) {
        char[] tab = s.toCharArray();
        int first = 0;
        int last = tab.length - 1;
        while (last > first) {
            if (tab[first] != tab[last]) {
                return false;
            }
            ++first;
            --last;
        }
        return true;
    }

//moje
    public static boolean checkPalindrom(String s) {

        char[] tab = s.toCharArray();

        boolean isPal = true;

        outerloop:
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == tab[tab.length-i-1]) {
                isPal = true;
            } else {
                isPal = false;
                break outerloop;
            }
        }

        return isPal;
    }


}
