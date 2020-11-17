class Parent1 {
    Parent1() {
        System.out.println( "Parent1 생성자" );
    }
    // 추상메서드 : {} -> 내용에 대한 구현
    //abstract void viewParent1();
    //abstract void viewParent1() {}
}


abstract class Parent2 {
    Parent2() {
        System.out.println( "Parent2 생성자");
    }
}

public class AbstractEx02 {
    public static void main(String[] args ) {
        Parent1 p1 = new Parent1();
    }
}