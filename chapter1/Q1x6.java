package chapter1;

public class Q1x6 {
	
	int[][] a;
	int n;
	
	public Q1x6(int n){
		int i=1;
		this.n=n;
		a = new int[n][n];
		for (int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				a[j][k]=i;
				i++;
			}
		}
	}
	
	public void rotaciona(){
		
		//Transpoe
		int i,j;
		int aux;
		for(i=0;i<n;i++){
			for(j=i;j<n;j++){
				aux = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = aux;
			}
		}
		//Espelha
		for(i=0;i<n;i++){
			for(j=0;j<n/2;j++){
				aux = a[i][n-j-1];
				a[i][n-j-1] = a[i][j];
				a[i][j] = aux;
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
