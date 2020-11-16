import java.util.Date;

public class DateEx01 {
    public static void main(String[] args) throws Exception {
       //java.util.Date d = new java.util.Date();
       Date d = new Date();
       System.out.println( d.toString() );
       System.out.println( d.toLocaleString() );

       System.out.println( d.getYear() );
       System.out.println( d.getMonth() );
       System.out.println( d.getDate() );
    }
}