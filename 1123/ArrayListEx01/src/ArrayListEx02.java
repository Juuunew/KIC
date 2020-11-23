import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이터의 안정성
		// 자료구조 내부에 동일한 자료를 넣을 것
		
		ArrayList al1 = new ArrayList();
		ArrayList<String> al2 = new ArrayList<String>();
		
		// Object
		al1.add( "박문수" );		// String -> Object
		al1.add( "이몽룡" );		// String -> Object
		//al1.add( 1 );			// int -> Integer -> Object
		
		// 데이터를 가져올 때
		for( int i=0 ; i<al1.size(); i++ ) {
			// 형변환
			String str = (String)al1.get(i);
			System.out.println( str );
		}
		
		al2.add( "이몽룡" );
		//al2.add( 1 );			다른 자료형태라 Error
		al2.add( "박문수" );
		for(String str : al2) {
			System.out.println( str );
		}
		
	}

}
