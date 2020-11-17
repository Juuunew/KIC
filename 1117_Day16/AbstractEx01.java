class Parent1 {
    Parent1() {
        System.out.println( "Parent1 생성자" );
    }
}

// 미완성 = instance
// 상속을 통해서 완성
// abstract - 추상메서드

abstract class Parent2 {
    Parent2() {
        System.out.println( "Parent2 생성자");
    }
}

class Child extends Parent2 {
    Child() {
        System.out.println( "Child 생성자");
    }
}

public class AbstractEx01 {
    public static void main(String[] args ) {
        Parent1 p1 = new Parent1();
     //   Parent1 p2 = new Parent2();
        Child c = new Child();
    }
}