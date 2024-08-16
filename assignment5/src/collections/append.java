package collections;
import java.util.*;
public class append {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(scan.nextInt());
		ll.add(10);
		ll.add(23);
		ll.add(25);
		ll.add(12);
		
		System.out.println(ll);
		ll.addLast(35);
		System.out.println(ll);

	}

}
