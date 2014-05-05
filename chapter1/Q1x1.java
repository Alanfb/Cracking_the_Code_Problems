package chapter1;
import java.lang.String;

public class Q1x1 {
	
	int[] a = new int[256];
	String str;
	
	public Q1x1(String str){
		this.str = str;
	}
	
	void compara(){
		int aux;
		for(int i=0;i<str.length();i++){
			if (str.charAt(i) == ' '){
				continue;
			}
			aux = str.charAt(i);
			a[aux]++;
			if(a[aux] > 1){
				break;
			}
		}
	}
	
	
	boolean verifica(){
		compara();
		for(int i=0;i<a.length;i++){
			if(a[i]>1){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		if(verifica()){
			return "Tem repetido!!";
		}
		return "Nao tem Repetido!!";
	}
	
	
}
