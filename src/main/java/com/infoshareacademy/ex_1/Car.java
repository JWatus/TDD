package com.infoshareacademy.ex_1;

public class Car {

    public String showType(Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Age is: ");
        stringBuilder.append(type.getAge());
        stringBuilder.append(", ");
        stringBuilder.append("Model is: ");
        stringBuilder.append(type.getModel());

        return stringBuilder.toString();
    }

    public Type getTyp() {
        return typ;
    }

    private Type typ;

}
