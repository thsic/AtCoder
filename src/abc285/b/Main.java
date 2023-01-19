package abc285.b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int num = 1;

		for(int i=0; i<n-1; i++) {


			for(int j=0; j<n-num; j++) {

				String s1 = s.substring(j, j+1);
				String s2 = s.substring(j+num, j+num+1);

				//System.out.println(s1 + " " + s2);
				if(s1.equals(s2)) {
					System.out.println(j);
					break;
				}
				else if(j == n-num-1){
					System.out.println(j+1);
					break;
				}

			}
			num++;
		}

	}
}