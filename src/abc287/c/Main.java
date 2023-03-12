package abc287.c;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputStr = sc.nextLine();
		String strAry[] = inputStr.split(" ");

		int n = Integer.parseInt(strAry[0]);
		int m = Integer.parseInt(strAry[1]);
		
		boolean ansCheck = true;

		int vertexCounts[] = new int[n];
		
		if(m != n-1)ansCheck = false;
		
		for(int i=0; i<n; i++) {
			vertexCounts[i] = 0;
 		}

		for(int i=0; i<m; i++) {
			inputStr = sc.nextLine();
			String uAry[] = inputStr.split(" ");

			int u1 = Integer.parseInt(uAry[0]);
			int u2 = Integer.parseInt(uAry[1]);

			vertexCounts[u1-1]++;
			vertexCounts[u2-1]++;
			
			
			
		}
		
		
		int oneEdgeVertex = 0;
		int twoEdgeVertex = 0;
		for(int i=0; i<n; i++) {
			switch (vertexCounts[i]){
			case 1:
				oneEdgeVertex++;
				break;
			case 2:
				twoEdgeVertex++;
				break;
			default:
				ansCheck = false;
				break;
			}
		}

		if(oneEdgeVertex == 2 && twoEdgeVertex == n-2 && ansCheck == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}