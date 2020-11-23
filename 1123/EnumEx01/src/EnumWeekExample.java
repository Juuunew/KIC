// 상수값이 아니라 이름에 의한 접근
// 목록 중심
public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week week1 = Week.SATURDAY;
		Week week2 = Week.SATURDAY;
		
		System.out.println( week1 == week2 );
		
		// return값이 String
		System.out.println( week1.name() );
		// return값이 Week
		System.out.println( week1.SATURDAY );
		
		System.out.println( week1.ordinal() );
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println( day );
		}
	}
}
