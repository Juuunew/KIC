public class WrapperEx02 {
    public static void main(String[] args) {
        Integer i1 = new Integer( 123 );

        byte b = i1.byteValue();
        float f = i1.floatValue();

        System.out.println( b );
        System.out.println( f );

        // 문자 형변환
        String str1 = i1.toString();
        String str2 = Integer.toString( 123 );

        System.out.println( str1 );
        System.out.println( str2 );

        // 진법
        System.out.println( Integer.toBinaryString( 123 ) );

        // 문자열 -> 정수/실수 (*)
        int i2 = Integer.parseInt( "123" );
        float f2 = Float.parseFloat( "1.23f" );
        System.out.println( i2 );
        System.out.println( f2 );
    }
}