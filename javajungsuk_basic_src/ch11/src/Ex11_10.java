import java.util.*;

class Ex11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list);          // Collections.sort(List list)
		System.out.println(list);
	}
}
