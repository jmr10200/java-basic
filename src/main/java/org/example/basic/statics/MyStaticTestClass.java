package org.example.basic.statics;

public class MyStaticTestClass {

    /** 인스턴스 메소드 */
    void instanceMethod() {
        System.out.println("MyStaticTestClass.instanceMethod() 실행");
    }

    /** static 메소드 */
    static void staticMethod() {
        System.out.println("MyStaticTestClass.staticMethod() 실행");
    }

    /** 인스턴스 메소드에서의 호출 */
    void callMethod() {
        instanceMethod(); // OK
        staticMethod(); // OK
    }

    /** static 메소드에서의 호출 */
    static void callMethod2() {
//        instanceMethod(); // NG , 같은 클래스의 static 메소드에서 인스턴스 메소드를 호출할 수 없다.
        // 호출하기 위해서는 인스턴스를 생성해야 한다.
        MyStaticTestClass myStaticTestClass = new MyStaticTestClass();
        myStaticTestClass.instanceMethod();
        staticMethod(); // OK
    }
}
