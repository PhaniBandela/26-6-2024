package assignment3;

public class CollegeBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stream="cse";
		int year=1;
		switch(year) {
		case 1:
			System.out.println("1st year");
			switch(stream) {
			case "cse":
				System.out.println("maths,physics,chemistry");
				break;
			case "ece":
				System.out.println("maths,physics,chemistry");
				break;
			case "eee":
				System.out.println("maths,physics,chemistry");
				break;
			default :
				System.out.println("enter correct stream");
			}
			break;
		case 2:
			System.out.println("2nd year");
			switch(stream) {
			case "cse":
				System.out.println("c language");
				break;
			case "ece":
				System.out.println("electronics");
				break;
			case "eee":
				System.out.println("electrical");
				break;
			default :
				System.out.println("enter correct stream");
			}
			break;
		case 3:
			System.out.println("3rd year");
			switch(stream) {
			case "cse":
				System.out.println("python language");
				break;
			case "ece":
				System.out.println("communication");
				break;
			case "eee":
				System.out.println("transformers");
				break;
			default :
				System.out.println("enter correct stream");
			}
			break;
		case 4:
			System.out.println("4th year");
			switch(stream) {
			case "cse":
				System.out.println("python language");
				break;
			case "ece":
				System.out.println("vlsi");
				break;
			case "eee":
				System.out.println("networking");
				break;
			default :
				System.out.println("enter correct stream");
			}
			break;
		default:
				System.out.println("enter correct year");
		}

	}

}
