import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList( 100 );
		
		// Object
		al1.add( "박문수" );
		String str = "이몽룡";
		al1.add((Object)str);
		// al1.add(str)
		
		// 데이터의 갯구
		System.out.println(al1.size());
		
		al1.add("성춘향" );
		System.out.println(al1.size());
		
		al1.add( 1 );				// int -> Integer
		al1.add( 3 );
		
		System.out.println(al1.size());
		
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
	}

}
