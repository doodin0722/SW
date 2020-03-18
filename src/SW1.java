import java.util.Scanner;

public class SW1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr [][]= new int [n][m];
	
		for(int i =0; i<n;i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int d[][] = new int [n+1][m+1];
		for(int i = 0; i<n; i++) {
			d[i][0] = arr[i][0];
		}
		for(int i = 0; i<m; i++) {
			d[0][i] = arr[0][i];
		}
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				d[i][j] = Math.max(d[i-1][j],d[i][j-1]);
				d[i][j] = Math.max(d[i][j], d[i-1][j-1]);
				d[i][j] = d[i][j] +arr[i-1][j-1];
				System.out.println("n= "+i+" m= "+j+" dp= "+d[i][j]);
			}
		}
	System.out.println(d[n][m]);
	}
	
}
