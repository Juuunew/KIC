public class StringEx3_1116_1 {
    public static void main(String[] args) {
        String str = "ABC";
        str += "BCD";

        System.out.println( str );

        String pstr = str.replaceAll( "ABC", "CDE" );
        // 불변성
        System.out.println( str );
        System.out.println( pstr );

        String str11 = "Hello World";
        String str12 = "Hello World";

        String str21 = new String( "Hello World" );
        String str22 = new String( "Hello World" );

        if( str21 == str22 ) {
            System.out.println( "참조값이 같음" );
        } else {
            System.out.println( "참조값이 다름" );
        }

        if( str21.equals(str22) ) {
            System.out.println( "내용값이 같음" );
        } else {
            System.out.println( "내용값이 다름" );
        }

        if( str11 == str12 ) {
            System.out.println( "참조값이 같음" );
        } else {
            System.out.println( "참조값이 다름" );
        }

        if( str11.equals(str12) ) {
            System.out.println( "내용값이 같음" );
        } else {
            System.out.println( "내용값이 다름" );
        }

        System.out.println( str11.hashCode() );
        System.out.println( str12.hashCode() );
    }
}