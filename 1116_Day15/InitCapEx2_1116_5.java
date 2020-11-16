public class InitCapEx2_1116_5 {
    
    public static void main(String[] args) {
        // 입력값 검사
        if( args.length != 1 ) {
            System.out.println( "1개를 입력하셔야 합니다." );
        }   else {
                System.out.println( "정상" );

                UtilEx1_1116_4 u = new UtilEx1_1116_4 ();
                String result = u.capitalizeName( args[0] );               
                System.out.println( "결과 : " + result.trim() );
        }
    }
}