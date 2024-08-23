package Strings;

public class maxrepeatingcharacters {

	
	public static void main(String[] args) {
		String s="naabcdefhedef";
		int arr[]=new int[125];
		
		for(char i:s.toCharArray()) {
			arr[i]++;
//			System.out.println(arr[i]);
		}
		
		int count=0;
		char ch1=' ';
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>count) {
				count=arr[j];
				ch1=(char)j;
			}
		}
		System.out.println(ch1);
	}

}
