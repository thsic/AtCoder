package abc288.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		
		String names[] = new String[n];
		String ranks[] = new String[n];
		List<String> nameList = new ArrayList<String>();
		
		for(int i=0; i<k; i++) {
			nameList.add(sc.nextLine());
		}

		nameList.sort(null);
		for(int i=0; i<k; i++) {
			System.out.println(nameList.get(i));
		}
		
	}
}
