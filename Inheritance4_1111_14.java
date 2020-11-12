class Parent {
    // 디폴트 생성자
    
    Parent(String data ) {
        System.out.println( "Parent 생성자 : " + this );
    }

    void viewParent() {
        System.out.println( "viewParent() 호출");
    }
}

class Child extends Parent {
    Child(String data ) {
        super( "데이터" );
        System.out.println( "Child 생성자 : " + this );
    }
}

public class Inheritance4_1111_14 {
    public static void main(String[] args) {
      //  Child c = new Child();
        Child c = new Child( "데이터" );
        c.viewParent();
    }
}