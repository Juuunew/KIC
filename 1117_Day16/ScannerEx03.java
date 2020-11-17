import java.util.Scanner;

public class ScannerEx03 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.print( "출력할 구구단 : " );
        int msg = sc.nextInt();
        System.out.println( "사용자가 입력한 값 : " + msg );
               
        for( int i=1; i<=9; i++ ) {
        System.out.println( msg * i );

        sc.close();
        }
    }
}