package abc289.b;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int reAry[] = new int[m+1];
		int ansAry[] = new int[n+1];
		int numAry[] = new int[n+1];
		boolean numReAry[] = new boolean[n+1];
		
		for(int i=0; i<m; i++) {
			reAry[i] = sc.nextInt();
		}
		
		//配列にレとレじゃないやつらいれてく
		int nowReIndex = 0;
		for(int i=1; i<n+1; i++) {
			
			if(reAry[nowReIndex] == i) {
				nowReIndex++;
				numReAry[i] = true;
				
			}
			else numReAry[i] = false;
		}
		
		
		nowReIndex = 0;
		int nextReIndex = 0;
		int nowNoReNum = 0;
		int nextNoReNum = 0;
		for(int i=0; i<n; i++) {
			
				
			//次のレじゃない数値みつける
			for(int j=0; j<n-nowNoReNum; j++) {
				
				if(numReAry[j+nowNoReNum] == false) {
					nextNoReNum = j;
					break;
				}
			}
			
			for(int j=nextNoReNum; j>=nowNoReNum+1;j--) {
				ansAry[j] = Math.abs(j-nextNoReNum)+nowNoReNum;
			}
			
		}
			
		
//		int nextReIndex = 0;
//		int nowGroup = 0;
//		int nowGroupIndexCount = 0;
//		
//		for(int i=1; i<n+1; i++) {
//			numAry[nowGroup][nowGroupIndexCount] = i;
//			
//			if(numAry[nowGroup][nowGroupIndexCount] > reAry[i]) {
//				nowGroup++;
//				nextReIndex++;
//				nowGroupIndexCount = 0;
//			}
//			else nowGroupIndexCount++;
//			
//		}
		
		
		System.out.println("aa");
	}
}
