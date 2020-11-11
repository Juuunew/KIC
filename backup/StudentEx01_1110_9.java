/*
    학생
        학번
        이름
        나이
        키
*/

// 클래스의 선언 (클래스를 선언하면 자동적으로 파일 분리)
// 원칙적으로는 하나의 파일 당 하나의 클래스
class Student {
    String hakbun;
    String name;
    int age;
    double height;
}
// public 이 붙은 곳이 파일명
public class StudentEx01_1110_9 {
    public static void main(String[] args) {
        // 객체 생성
        // s1 인스턴스
        Student s1;             //선언
        s1 = new Student();     //생성

        //new = 메모리 생성 연산자
        Student s2 = new Student();     //선언과 동시에 생성

        System.out.println( s1 );
        // . = 객체 참조 연산자
        s1.hakbun = "10";
        s1.name = "홍길동";
        s1.age = 10;
        s1.height = 170.6;

        System.out.println( s1.hakbun );
        System.out.println( s1.name );

        // 값을 복사 -> 주소(참조)를 복사
        Student s3 = s1;
        System.out.println( s1.name );
        System.out.println( s3.name );

        s3.name = "박문수";
        System.out.println( s1.name );
        System.out.println( s3.name );

    }
}