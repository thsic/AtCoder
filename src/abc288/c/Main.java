package abc288.c;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int vertexs[] = new int[n+1];
		int sides[] = new int[m+1];
		int ans = 0;
		
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			vertexs[v1]++;
			vertexs[v2]++;
		}
		
		for(int i=0; i<n+1; i++) {
			sides[vertexs[i]]++;
		}
		
		//if(sides[1] > 2)ans += sides[1]-2;
			
		switch(sides[1]) {
		case 0:
			if(m%2 == 0) {
				ans += 1;
			}
			break;
		default:
			ans += sides[1]-2;
		}
		
		for(int i=0; i<m+1; i++) {
			if(i>2) {
				ans += sides[i]* (i-2);
			}
		}
		System.out.println(ans);
		
	}
}
