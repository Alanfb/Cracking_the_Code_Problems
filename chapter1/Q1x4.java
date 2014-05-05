package chapter1;

public class Q1x4 {
	char[] str = new char[100];
	
	public Q1x4(String a){
		for (int i=0;i<a.length();i++){
			str[i] = a.charAt(i);
		}
	}
	
	void refaz(){
		char[] aux = new char[100];
		int j=0;
		for(int i =0; i< str.length;i++){
			aux[j] = str[i];
			if(str[i] == ' ' && str[i+1] != ' '){
				aux[j] = '%';
				aux[j+1] = '2';
				aux[j+2] = '0';
				//System.out.println(aux[j]);
				j=j+2;
			}
			j++;
			if(str[i] == ' ' && str[i+1] == ' '){
				str=aux;
				break;
			}
			if(j==str.length){
				str=aux;
				break;
			}
		}
	}
	
	public String toString(){
			refaz();
		String a = new String(str);
	
		return a;
	}
}
