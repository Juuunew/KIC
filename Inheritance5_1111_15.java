class Parent {
     void viewParent() {
        System.out.println( "viewParent() 호출");
    }
}

// 부모가 나를 부를 땐 this 내가 부모를 부를 땐 super
class Child extends Parent {
    // 재정의
    void viewParent() {
        System.out.println( "child viewParent() 호출");
    }
    void viewChild() {
        super.viewParent();
        System.out.println( " viewChild() 호출" );
    }
}

public class Inheritance5_1111_15 {
    public static void main(String[] args) {   
        Child c = new Child();
        c.viewChild();
       // c.viewParent();
    }
}