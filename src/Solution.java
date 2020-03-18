import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1; test <=t; test ++) {
			int n = sc.nextInt();
			int a[] = new int [10001];
			for(int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			int arr[][]= new int [10001][10001];
			for(int i = 0; i<1000; i++) {
				for(int j = 0; j<=a[i]; j++) {
					arr[i][j] =1;
					
				}
			}
			int result = 0;
			for(int i = 2; i<998; i++) {
				for(int j = 0; j<255; j++) {
					if(arr[i][j]==1) {
						if(arr[i-2][j] ==0 && arr[i-1][j] ==0 && arr[i+2][j] ==0 && arr[i+1][j] ==0) {
							result ++;
						}
					}

					
				}
			}
			System.out.println(result);
		}

	}

}
