import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("a", "박문수");
		hm.put("b", "이몽룡");
		hm.put("c", "홍길동");
		
		hm.put("d", "월매");

		hm.put("c", "이순신");
		
		System.out.println( hm.size() );
		System.out.println( hm.toString() );

		System.out.println( hm.get("a") );
		System.out.println( hm.get("b") );
		System.out.println( hm.get("c") );
		System.out.println( hm.get("d") );
		
		// key -> value
		Set<String> keys = hm.keySet();
		System.out.println( keys.toString());
//		for( String key : keys ) {
//			System.out.println( key + ":" + hm.get(key));
//		}
		
		Iterator<String> i = keys.iterator();
		while( i.hasNext() ) {
			String key = i.next();
			System.out.println( key + ":" + hm.get(key));
		}
		
		Collection<String> values = hm.values();
		for( String value : values) {
			System.out.println( value );
		}
		
		hm.remove("a");
		
		System.out.println(hm.toString());
	}

}
