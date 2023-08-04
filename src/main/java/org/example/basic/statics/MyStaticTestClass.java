package org.example.basic.statics;

public class MyStaticTestClass {

    /** 인스턴스 메소드 */
    public void instanceMethod() {
        System.out.println("MyStaticTestClass.instanceMethod() 실행");
    }

    /** static 메소드 */
    public static void staticMethod() {
        System.out.println("MyStaticTestClass.staticMethod() 실행");
    }

    /**
     * 인스턴스 메소드에서의 호출
     * 인스턴스 멤버간의 호출에는 문제가 없다.
     * 인스턴스가 존재한다는 것은 인스턴스가 이미 생성되었다는 의미이므로 다른 인스턴스멤버들도 존재하기 때문이다.
     */
    public void callMethod() {
        instanceMethod(); // OK
        staticMethod(); // OK
    }

    /**
     *  static 메소드에서의 호출
     *  인스턴스가 존재하는 시점에 static 은 항상 존재하지만,
     *  static 이 존재하는 시점에 인스턴스가 존재하지 않을 수도 있다.
     *  따라서, static 메소드가 인스턴스 메소드를 참조 또는 호출하기 위해서는 인스턴스를 생성해야한다.
     *
     *  즉! 정리하면
     *  클래스멤버(static)가 인스턴스멤버를 참조, 호출해야하는 일은 거의 없다.
     *  만약 그런 경우가 발생하면, 인스턴스멤버로 해야할 것을 클래스멤버(static)으로 하지 않았나 검토해야한다.
     */
    public static void callMethod2() {
//        instanceMethod(); // NG , 같은 클래스의 static 메소드에서 인스턴스 메소드를 호출할 수 없다.
        // 호출하기 위해서는 인스턴스를 생성해야 한다.
        MyStaticTestClass myStaticTestClass = new MyStaticTestClass();
        myStaticTestClass.instanceMethod();
        staticMethod(); // OK
    }
}
