import java.util.Scanner;

public class ScannerEx04 {
    public static void main( String[] args ) {
        Scanner scan= new Scanner( System.in );
        
        String msg = "";
        do {
            System.out.print( "단수 입력 : " );
            msg = scan.nextLine();
            
            for(int i = 1; i<=9; i++) {
            System.out.println( "입력 단수 : " + msg );
            }
            
        } while( !msg.equals( "q" ) );


        scan.close();
    }
}
