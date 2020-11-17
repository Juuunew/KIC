import java.util.Scanner;

public class ScannerEx02 {
    public static void main( String[] args ) {
        
        Scanner sc = new Scanner( System.in );
        System.out.print( "입력 : ");
        //String msg = sc.nextLine();
        int msg = sc.nextInt();
        System.out.println( "입력된 메세지 : " + msg );
        
        sc.close();
    }
}