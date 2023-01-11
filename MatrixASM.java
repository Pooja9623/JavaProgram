package javaTutorial;

import java.util.Scanner;

public class MatrixASM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int m,n;
		System.out.print("Enter size of matrix(m x n):");
		m=in.nextInt();
		n=in.nextInt();
		int[][] a = new int[m][n];
		System.out.print("Matrix a:\n");
		for(int i=0; i<m;i++) 
		{	for(int j=0; j<n; j++) { 
				System.out.printf("[%d][%d]:",i+1,j+1);
				a[i][j]=in.nextInt();	
				
			}
		}
	
		int[][] b = new int[m][n];
		System.out.print("\nMatrix b:\n");
		for(int i=0; i<m;i++) 
			for(int j=0; j<n;j++ ) { 
				System.out.printf("[%d][%d]:",i+1,j+1);
				b[i][j]=in.nextInt();
				
			}
	
		int[][] c = new int[m][n];
		
		System.out.println("Addition:");
		for(int i=0;i<m;i++) 
		{	for(int j=0;j<n;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("%d\t",c[i][j]);
			}
		System.out.println();
		}
		
		System.out.println("\nSubtraction:");
		
		for(int i=0;i<m;i++) 
		{	for(int j=0;j<n;j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.printf("%d\t",c[i][j]);
			}
		System.out.println();
		}

     System.out.println("\nMultiplication:");
		
		for(int i=0;i<m;i++) 
		{	for(int j=0;j<n;j++) {
			c[i][j]=0;
			for(int k=0;k<n;k++) {
				c[i][j] += a[i][k] * b[k][j]  ;
			}
			System.out.printf("%d\t",c[i][j]);
			}
		System.out.println();
		}
	}

}
