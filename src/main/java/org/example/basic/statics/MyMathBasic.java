package org.example.basic.statics;

public class MyMathBasic {

    public long a;
    public long b;

    public String description = "인스턴스 변수";

    /**
     * 인스턴스 변수 a, b 만 이용하므로 매개변수가 필요없다.
     * @return
     */
    public long add() {
        return a + b;
    }

    public long subtract() {
        return a - b;
    }

    public long multiply() {
        return a * b;
    }

    public double divide() {
        return a / b;
    }

}
