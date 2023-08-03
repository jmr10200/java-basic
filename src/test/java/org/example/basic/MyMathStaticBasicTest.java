package org.example.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathStaticBasicTest {


    @Test
    @DisplayName("인스턴스 메소드")
    public void mathBasic() {
        MyMathBasic mathBasic = new MyMathBasic();
        mathBasic.a = 200L;
        mathBasic.b = 10L;

        System.out.println("add() = " + mathBasic.add());
        System.out.println("subtract() = " + mathBasic.subtract());
        System.out.println("multiply() = " + mathBasic.multiply());
        System.out.println("divide() = " + mathBasic.divide());

        assertEquals(210L, mathBasic.add());
        assertEquals(190L, mathBasic.subtract());
        assertEquals(2000L, mathBasic.multiply());
        assertEquals(20.0, mathBasic.divide());
    }

    @Test
    @DisplayName("static 메소드")
    public void mathStatic() {
        long num1 = 100L;
        long num2 = 10L;

        System.out.println("add(num1, num2) = " + MyMathStaticBasic.add(num1, num2));
        System.out.println("subtract(num1, num2) = " + MyMathStaticBasic.subtract(num1, num2));
        System.out.println("multiply(num1, num2) = " + MyMathStaticBasic.multiply(num1, num2));
        System.out.println("divide(num1, num2) = " + MyMathStaticBasic.divide(num1, num2));

        assertEquals(110L, MyMathStaticBasic.add(num1, num2));
        assertEquals(90L, MyMathStaticBasic.subtract(num1, num2));
        assertEquals(1000L, MyMathStaticBasic.multiply(num1, num2));
        assertEquals(10.0, MyMathStaticBasic.divide(num1, num2));
    }

    @Test
    @DisplayName("static 변수, 인스턴스 변수")
    public void staticStr() {
        System.out.println("static 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.");
        System.out.println("static 변수 출력 = " + MyMathStaticBasic.DESCRIPTION);

        System.out.println("인스턴스 변수는 인스턴스를 생성해야 사용할 수 있다.");
        MyMathBasic mathBasic = new MyMathBasic();
        System.out.println("인스턴스 변수 출력 = " + mathBasic.description);
    }

}