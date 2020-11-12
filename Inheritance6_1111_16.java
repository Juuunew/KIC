class Parent {
    void viewParent() {
        System.out.println( "Parent viewParent() 호출" );
    }
}

class Child extends Parent {
    // 오버라이드
    void viewParent() {
        System.out.println( "Child viewParent() 호출" );
    }
}

public class Inheritance6_1111_16 {
    public static void main(String[] args) {   
        Child c = new Child();
        c.viewParent();

    }
}