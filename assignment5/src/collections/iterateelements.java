package collections;
import java.util.*;
public class iterateelements {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(14);
		ll.add(26);
		
		Iterator<Integer> i=ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		ListIterator j=ll.listIterator(1);
		while(j.hasNext()) {
			System.out.print(j.next()+" ");
		}
		System.out.println();
		
		Collections.sort(ll);
		System.out.println(ll);
		
		Collections.swap(ll, 0, 2);
		System.out.println(ll);
		
		HashSet<Integer> hs=new LinkedHashSet<>();
		hs.add(12);
		hs.add(14);
		hs.add(16);
		hs.add(26);
		hs.add(16);
		
		System.out.println(hs);
		HashSet<Integer> hs1=new LinkedHashSet<>();
//		Iterator ii=hs.iterator();
		for(int ii:hs) {
			hs1.add(ii);
		}
		System.out.println(hs1);
	}

}
