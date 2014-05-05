package chapter1;

public class Q1x3 {
	
	String s1;
	String s2;
	
	public Q1x3(String s1,String s2){
		this.s1 =s1;
		this.s2 = s2;
	}
	
	boolean compara(){
		if(s1.length() != s2.length()){
			return false;
		}
		int aux,i;
		int[] a = new int[256];
		for(i=0;i<s1.length();i++){
			aux = s1.charAt(i);
			a[aux]++;
			aux = s2.charAt(i);
			a[aux]--;
		}
		for(i=0;i<a.length;i++){
			if(a[i] != 0){
				return false;
			}
		}
		
		return true;
	}
	
	public String toString(){
		if(compara()){
			return "Eh permutacao!";
		}
		return "Nao eh permutacao!";
	}
	
	
	
	
	

}
