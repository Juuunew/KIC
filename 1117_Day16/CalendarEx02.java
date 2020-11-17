import java.util.Calendar;

public class CalendarEx02 {
    public static void main(String[] args) {
        // 날짜 전 / 후
        // add

        Calendar c = Calendar.getInstance();
        System.out.println( c.getTime() );

        c.add( Calendar.DATE, 1 );
        System.out.println( c.getTime() );

        c.add( Calendar.MONTH, -6 );
        System.out.println( c.getTime() );
    }
}