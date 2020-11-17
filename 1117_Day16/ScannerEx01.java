import java.util.Scanner;

public class ScannerEx01 {
    public static void main( String[] args ) {
        // System.in
        Scanner sc = new Scanner( System.in );
        System.out.print( "입력 : ");
        String msg1 = sc.next();             // 실제 입력
        String msg2 = sc.next();             // 실제 입력
        System.out.println( "입력된 메세지 : " + msg1 );
        System.out.println( "입력된 메세지 : " + msg2 );
        sc.close();
    }
}