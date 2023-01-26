package abc286.a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strAry[] = str.split(" ");
		//int inputAry[] = Integer.parseInt(str[]);

		int n = Integer.parseInt(strAry[0]);
		int p = Integer.parseInt(strAry[1]);
		int q = Integer.parseInt(strAry[2]);
		int r = Integer.parseInt(strAry[3]);
		int s = Integer.parseInt(strAry[4]);
		String a[] = new String[n];
		String b[] = new String[n];

		String str2 = sc.nextLine();
		String strAry2[] = str2.split(" ");
		for(int i=0; i<n; i++) {
			a[i] = strAry2[i];
			b[i] = strAry2[i];

		}
		
		int num = q-p+1;
		for(int i=0; i<num; i++) {
			b[r+i-1] = a[p+i-1];
			b[p+i-1] = a[r+i-1];
		}

		for(int i=0; i<n; i++) {
			System.out.print(b[i] + " ");
		}
	}
}