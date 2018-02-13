package questions;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hope you are doing well";
		System.out.println(reverseEverything(str));
	}
	
	public static String reverseEverything(String s) {
		
		StringBuilder sb = new StringBuilder();
		char[] a = s.toCharArray();
		
		for(int i = s.length()-1; i >=0; i--) {
			sb.append(a[i]);
		}
		
		return sb.toString();
	}
}
