interface InterA {
    String STR1 = "홍길동";
    void methodA();
}
// 인터페이스 상속
interface InterB extends InterA {
    String STR2 = "박문수";
    void methodB();
}

class Parent {
    Parent() {
        System.out.println( "Parent 생성자" );
    }
}

class Child extends Parent implements InterB {
    Child() {
        System.out.println( "Child 생성자" );
    }

    public void methodA() {
        System.out.println( "methodA() 호출" );
    }

    public void methodB() {
        System.out.println( "methodB() 호출" );
    }
}

public class InterFaceEx02 {
    public static void main(String[] args) {
        Child c = new Child();
        c.methodA();
        c.methodB();
    }
}