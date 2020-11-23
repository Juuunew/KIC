import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 자료 arraylist
		ArrayList<String> al1 = new ArrayList<String>();
		// Integer
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al1.add( "이몽룡" );
		al1.add( "박문수" );
//		al1.add( 1 );		String 엔 문자열만	숫자가 들어가면 Error
		
		al2.add(1);
		al2.add(2);
//		al2.add( "박문수" );
		
		for( String str : al1 ) {
			System.out.println( str );
		}
		
		al1.set(0, "월매");
		
		for( String str : al1 ) {
			System.out.println( str );
		}
		
		// remove, removeAll, clear
		al1.remove(0);
		
		for( String str : al1 ) {
			System.out.println( str );
		}
	}

}
