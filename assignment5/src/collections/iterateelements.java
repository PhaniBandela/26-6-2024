package collections;
import java.util.*;
public class iterateelements {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(14);
		ll.add(26);
		
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
