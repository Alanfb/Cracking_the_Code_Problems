package lists;

public class Aluno {
	String name;
	int nota;
	
	public Aluno(String nome,int nota){
		this.name =nome;
		this.nota = nota;
	}
	
	public String toString(){
		String str = "Name: " + name + "\nNota: " + nota;
		String a = new String(str);
	return a;
}
}
