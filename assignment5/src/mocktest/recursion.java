package mocktest;
import java.util.*;
public class recursion {
	static int ob(int n) {
		
		LinkedList l=new LinkedList();
		if(n<=0) {
			return 0;
		}

		l.add(n);
		System.out.println(l);
		ob(n-1);
		return -1;
		
		
	}

	public static void main(String[] args) {
		ob(99);

	}

}
