package abc285.a;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if(num1 * 2 == num2 || num1 * 2 + 1 == num2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}