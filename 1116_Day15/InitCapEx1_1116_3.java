public class InitCapEx1_1116_3 {
    // 구조적 프로그래밍
    public static String capitalizeName(String strName ) {
        String[] Names = strName.split( " " );
               
        String result = "";
        for( String name : Names ) {
            result += name.substring(0, 1).toUpperCase()
                        + name.substring( 1 )+ " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        // 입력값 검사
        if( args.length != 1 ) {
            System.out.println( "1개를 입력하셔야 합니다." );
        }   else {
                System.out.println( "정상" );

                String result = InitCapEx1_1116_3.capitalizeName( args[0] );
               
                System.out.println( "결과 : " + result.trim() );
        }
    }
}