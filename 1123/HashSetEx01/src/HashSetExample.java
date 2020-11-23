import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// 향상된 for 문으로 다시 만들어보기
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> i = set.iterator();
		
		
		while(i.hasNext()) {
			String element = i.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " + set.size());
		
		i = set.iterator();
		while(i.hasNext()) {
			String element = i.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어 있음");
	}

	}
}
