package abc286.b;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String ans = s.replace("na", "nya");
		System.out.println(ans);

	}
}
