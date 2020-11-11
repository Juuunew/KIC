public class Ex01 {
    public static void main(String[] args) {
        // ln = 엔터키 효과
        System.out.println( "Hello Java" );
        System.out.println( "안녕 자바" );

        System.out.print( "안녕 자바" );
        System.out.print( "안녕 자바" );

        System.out.println( "안녕" + "자바" );
        System.out.println( "안녕" + " 자바" );

        // 형식대로 출력 / %s = 문자열을 상징
        System.out.printf( "%s %s %s", "안녕", "자바", "hello" );
    }
}

// 주석을 달아놓아도 에러 뜸!
// 한글을 컴파일 할 땐 javac -encoding utf-8 Ex01.java
