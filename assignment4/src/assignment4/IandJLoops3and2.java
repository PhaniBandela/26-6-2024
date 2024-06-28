package assignment4;

public class IandJLoops3and2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			if(i!=2) {
				for(int j=1;j<=n;j++) {
					if(j!=3) {
						System.out.println(i+","+j);
					}
				}
			}
		}
		
	}
}
