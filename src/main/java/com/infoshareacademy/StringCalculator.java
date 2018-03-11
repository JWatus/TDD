package com.infoshareacademy;

public class StringCalculator {

    public Integer add(String numbers, String delimiter) throws Exception {

        String[] tab = numbers.split(delimiter);

        Integer sum = 0;

        for (int i = 0; i < tab.length; i++) {
            if (Integer.parseInt(tab[i]) < 0)
                throw  new Exception();
            if (Integer.parseInt(tab[i]) <= 1000) {

                sum += Integer.parseInt(tab[i]);
            }
        }

        return sum;
    }
}
