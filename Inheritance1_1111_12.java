class Parent {
    String p;
    void viewParent() {
        System.out.println( "viewParent() 호출" );
    }
}

class Child1 {
    String c1;
    void viewChild1() {
        System.out.println( "viewChild1() 호출" );
}

public class Inheritance1_1111_12 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild1();
    }
}