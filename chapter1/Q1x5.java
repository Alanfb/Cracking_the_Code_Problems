package chapter1;

public class Q1x5 {
	String str;
	
	public Q1x5(String str){
		this.str = str;
	}
	void compress(){
		int cont=1;
		int l = str.length();
		StringBuilder ptr = new StringBuilder();
		for(int i =0 ; i<l ;i++){
			ptr.append(str.charAt(i));
			if(i+1 != l){
			while(str.charAt(i) == str.charAt(i+1)){
				cont++;
				i++;
				if(i+1==l) {break;}
			}
			}
			ptr.append(cont);
			cont=1;
		}
		if(l >= ptr.length()){
			str = ptr.toString();
		}
	}
	
	public String toString(){
		compress();
		return str;
	}
}
