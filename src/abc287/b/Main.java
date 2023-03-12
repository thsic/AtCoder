package abc287.b;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		String strAry[] = inputStr.split(" ");
		
		int n = Integer.parseInt(strAry[0]);
		int m = Integer.parseInt(strAry[1]);

		int sAry[] = new int[n];
		boolean tAry[] = new boolean[1000];
		int ans = 0;

		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			String str2 = str.substring(3, str.length());

			sAry[i] = Integer.parseInt(str2);

		}
		for(int i=0; i<tAry.length; i++) {
			tAry[i] = false;
		}
		for(int i=0; i<m; i++) {
			String str = sc.nextLine();
			int num = Integer.parseInt(str);
			tAry[num] = true;
		}
		for(int i=0; i<n; i++) {
			if(tAry[sAry[i]] == true) {
				ans++;
			}
		}
		System.out.println(ans);

	}
}
