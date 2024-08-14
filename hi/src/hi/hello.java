package hi;
/*
 * 
		int arr[]= {1,1,2,2,2,3};// output 3,1,1,2,2,2
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
 */
import java.util.*;

public class hello {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
        System.out.println( findNthPrime(n));
    }

    public static int findNthPrime(int n) {

    	int count = 0;
        int number = 1;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        return number;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true; // 2 is the only even prime number
        }

        if (number % 2 == 0) {
            return false; // Eliminate even numbers greater than 2
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
