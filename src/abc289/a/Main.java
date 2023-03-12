package abc289.a;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		String ans = "";
		
		for(int i=0; i<str.length(); i++) {
			
			String a = str.substring(i, i+1);
			
			if(a.equals("0")) {
				a = "1";
			}
			else {
				a = "0";
			}
			ans += a;	
		}
		System.out.println(ans);
		
	}
}
