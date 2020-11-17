import java.util.StringTokenizer;

// String.split()
public class StringTokenizerEx01 {
    public static void main( String[] args ) {
        
        //String data1 = "사과&배&복숭아";
        //StringTokenizer st1 = new StringTokenizer( data1, "&" );
        String data1 = "x=100*(200+300)/2";
        StringTokenizer st1 = new StringTokenizer( data1, "=*+/()" );

        System.out.println( st1.countTokens() );

        //String data1 = "사과 배 복숭아";
        //StringTokenizer st1 = new StringTokenizer( data1 );
        
        /*
        System.out.println( st1.countTokens() );

        System.out.println( st1.nextToken() );
        System.out.println( st1.nextToken() );

        System.out.println( st1.hasMoreTokens() );
        System.out.println( st1.nextToken() );

        System.out.println( st1.hasMoreTokens() );
        System.out.println( st1.nextToken() );
      //  System.out.println( st1.nextToken() ); -> 갯수에 맞지않으면 Error 발생
      */
      while( st1.hasMoreTokens() ) {
          System.out.println( st1.nextToken() );
      }
    }
}