package chapter1;

public class Q1x2 {
	
	String str;
	String rstr;
	
	public Q1x2(String str){
		this.str = str;
	}
	
	void inverte(){
		StringBuilder stringBuilder = new StringBuilder();
		int l = str.length();
		for(int i=l-1;i>-1;i--){
			stringBuilder.append(str.charAt(i));
			//rstr = rstr + str.charAt(i);
		}
		rstr = stringBuilder.toString();
	}
	
	public String toString(){
		inverte();
		return "-->" + rstr;
	}

}
