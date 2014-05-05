package chapter1;
import java.util.*;
public class Q1x7 {
	int n;
	int[][] a;
	boolean[] row;
	boolean[] col;
	
	
	public Q1x7(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Tamanho da matrz:");
		n= entrada.nextInt();
		a = new int[n][n];
		row = new boolean[n];
		col = new boolean[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("Elemento a" +i+j+": ");
				a[i][j] = entrada.nextInt();
				if(a[i][j]==0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
	}

	public void zera(){
		
		for(int i=0;i<n;i++){
			if(col[i] == true){
				for(int j=0;j<n;j++){
					a[j][i] = 0;
				}
			}
			if(row[i] == true){
				for(int j=0;j<n;j++){
					a[i][j] = 0;
				}
			}
		
		}
		
	}
	
	public void print(){
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        System.out.print(a[i][j] + " ");
		    }
		    System.out.print("\n");
		}
	}
}
