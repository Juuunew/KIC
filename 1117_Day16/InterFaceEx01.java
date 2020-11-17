// 인터페이스 선언
// interface 는 구현을 위해 만듦
interface InterA {
    // 상수
    public static final String STR1 = "홍길동";
    String STR2 = "박문수";
    // 추상메서드
    public abstract void methodA();
    void methodB();
}

interface InterB {
    String STR3 = "이몽룡";
    void methodC();
}

// 다중 구현
class ClassA implements InterA {
    public void methodA() {
        System.out.println( "methodA 호출" );
    }
    public void methodB() {
        System.out.println( "methodB 호출" );
    }
    public void methodC() {
        System.out.println( "methodC 호출" );
    }
}
public class InterFaceEx01 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
        a.methodC();
        System.out.println( InterA.STR1 );
        System.out.println( InterA.STR2 );
        System.out.println( InterB.STR3 );
    }
}