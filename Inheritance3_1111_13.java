class Parent {
    // 디폴트 생성자
    
    Parent() {
        System.out.println( "Parent 생성자 : " + this );
    }
}




class Child extends Parent {
    Child() {
        
        System.out.println( "Child 생성자 : " + this );
    }
}

public class Inheritance3_1111_13 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println( "c : " + c );
    }
}