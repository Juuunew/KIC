import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 두개는 같음
		HashSet<String> hs1 = new HashSet<String>();
		Set<String> hs2 = new HashSet<String>();
		
		// 중복은 제외됨
		hs1.add( "아메리카노" );
		hs1.add( "에스프레소" );
		hs1.add( "카푸치노" );
		
		hs1.add( "아메리카노" );
		hs1.add( "에스프레소" );
		hs1.add( "카푸치노" );
		hs1.add( "모카" );
		
		System.out.println( hs1.size() );
		
		System.out.println( hs1.toString() );
		for(String str : hs1) {
			System.out.println( str );
		}
//		전통적인 방법		
//		Iterator<String> i = hs1.iterator();
//		while( i.hasNext() ) {
//			System.out.println( i.next() );
		}
		
	}


