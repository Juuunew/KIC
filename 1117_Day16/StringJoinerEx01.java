import java.util.StringJoiner;

public class StringJoinerEx01 { 
    public static void main( String[] args ) {
        // 문자열 연결
        String str1 = "apple"+ ",banana" + ",pineapple";
        System.out.println( str1 );

        String str2 = String.format( "%s,%s,%s", "apple", "banana", "pineapple" );
        System.out.println( str2 );

        String[] arr = { "apple", "banana", "pineapple" };
        String str3 = String.join( ",", arr );
        System.out.println( str3 );

        // StringBuffer
        StringJoiner sj = new StringJoiner( "," );
        //sj.add( "apple" );
        //sj.add( "banana" );
        //sj.add( "pineapple" );
        sj.add( "apple" ).sj.add( "banana" ).sj.add( "pineapple" );
        System.out.println( sj );
    }
}