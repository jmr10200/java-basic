package org.example.basic.statics;

public class MyMathStaticBasic {

    public static final String DESCRIPTION = "static 변수";

    /**
     * 매개변수로 가능
     * @param a
     * @param b
     */
    public static long add(long a, long b) {
        return a + b;
    }

    public static long subtract(long a, long b) {
        return a - b;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }

    public static double divide(long a, long b) {
        return a / b;
    }

}
