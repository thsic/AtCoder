package acb287.a;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sansei = 0;

		for(int i=0; i<n+1; i++) {
			String str = sc.nextLine();
			if(str.equals("For")) {
				sansei++;
			}
		}

		if(sansei > n/2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}
