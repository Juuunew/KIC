import java.util.Calendar;
//import java.util.Date;

public class CalendarEx02 {
    public static void main( String[] args) {
        Calendar c = Calendar.getInstance();

        // c.get
        c.set( 2020, 11-1, 1 );
        System.out.println( c.toString() );
        System.out.println( c.getTime() );

        //Date d = c.getTime();
        //System.out.println( c.toLocaleString() );

        // 2020년 12월 31일의 요일
        // 2021년 1월 1일의 전날
        c.set( 2021, 1-1, 1-1 );
        System.out.println( c.get(Calendar.DAY_OF_WEEK) ); // -> 요일

        String[] weeks = { "일", "월", "화", "수", "목", "금", "토" };
        System.out.println( weeks[c.get(Calendar.DAY_OF_WEEK) - 1] ); // -> 요일
    }

}