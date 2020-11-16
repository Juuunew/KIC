import java.util.Calendar;

public class CalendarEx01 {
    public static void main( String[] args) {
        // 현재 시간
        Calendar c = Calendar.getInstance();

        System.out.println( c.toString() );
        
        System.out.println( c.get(Calendar.YEAR) );
        System.out.println( c.get(Calendar.MONTH) );
        System.out.println( c.get(Calendar.DAY_OF_MONTH) );
    }

}