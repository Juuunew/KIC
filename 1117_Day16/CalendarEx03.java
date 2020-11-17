import java.util.Calendar;

public class CalendarEx03 {
    public static void main(String[] args) {
        int year = 2020;
        int month = 11;

        int startDayofWeek = 0;       
        int endDay = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set( year , month-1, 1 );
        eDay.set( year , month, 1-1 );


        // 0 - 일요일 ( Date )
        // 1 - 일요일 ( Calendar )
        startDayofWeek = sDay.get( Calendar.DAY_OF_WEEK );
        endDay = eDay.get( Calendar.DATE );

        System.out.println( startDayofWeek );
        System.out.println( endDay );

        System.out.println( " SU MO TU WE TH FR SA");

        // 1일 이전의 공백
        for( int i=1; i<startDayofWeek ; i++ ) {
            System.out.print( "   " );
        }

        // 달력 출력
        for( int i=1, n=startDayofWeek ; i <= endDay ; i++, n++ ) {
            System.out.print( (i<10) ?  "  " + i : " " + i );
            if( n % 7 == 0 ) {
                System.out.println();
            }
        }
    }
}