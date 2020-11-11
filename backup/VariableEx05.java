public class VariableEx05 {
    public static void main(String[] args) {
        int i = 1;   // 가장 기본, 범용적으로 사용됨
        byte b = 1;
        short s = 1;
        
        long l1 = 1;
        long l2 = 1L;
        System.out.println( i );
        System.out.println( l1 );
        System.out.println( l2 );

        int i2 = 0b1011;
        int i8 = 030;
        int i16 = 0xA4;

        System.out.println( i2 );
        System.out.println( i8 );
        System.out.println( i16 );

        // 10 -> 2, 8, 16\
        int i10 = 100;
        System.out.printf( "8진수 : %o\n", i10 );
        System.out.printf( "16진수 : %x\n", i10 );
    }
}