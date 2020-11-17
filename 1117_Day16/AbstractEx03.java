abstract class Parent1 {
    Parent1() {
        System.out.println( "Parent1 생성자" );
    }
    abstract void viewParent1();
}

class Child extends Parent1 {
    Child() {
        System.out.println( "Child 생성자" );
    }
    void viewParent1() {
        System.out.println( "viewParent1() 호출" );
    }
}


abstract class Child2 extends Parent1 {
    Child2() {
        System.out.println( "Child2 생성자" );
    }
}

class GrandChild2 extends Child2 {
    GrandChild2() {
        System.out.println( "GrandChild2 생성자" );
    }
    void viewParent1() {
        System.out.println( "viewParent1() 호출" );
    }
}
   

public class AbstractEx03 {
    public static void main(String[] args ) {
        Child c = new Child();
        GrandChild2 gc2 = new GrandChild2();
    }
}