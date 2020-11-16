public class StringBufferEx1_1116_2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer( 100 );
        StringBuffer sb3 = new StringBuffer( "Hello World" );

        System.out.println( sb1.capacity() ); // 내부저장공간 16
        System.out.println( sb2.capacity() );
        System.out.println( sb3.capacity() ); // 11글자 + 16 = 27

        // 문자단위조작 ( 문자열 = 문자열로 데이터 유지하는게 편함 )
        // charAt / setCharAt / deleteCharAt
        // substring

        // append / insert / delete
        System.out.println( sb3 );
        sb3.append( " 안녕" );
        System.out.println( sb3 );
        sb3.insert( 3, " 추가 " );      // 3번째 글자뒤에 삽입
        System.out.println( sb3 );
        sb3.delete( 0, 4 );             // 글자 삭제 
        System.out.println( sb3 );

        sb3.reverse();                  // 글자 역순만들기
        System.out.println( sb3 );
    }
}