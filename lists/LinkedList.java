package lists;

public class LinkedList {
	
	private No first;
	private No last;
	private static int total;
	
	public void add(Object elem){
		No aux = first;
		if(aux==null){
			first = (No)elem;
			last = first;
		}
		else{
			while(aux.getNext()!=null){
				aux = aux.getNext(); 
			}
			aux.setNext((No)elem);
			last = (No)elem;
		}
	}
	
	public void add(int pos,Object elem){
		
	}
	
	public void addFirst(Object elem){
		
	}
	
	public void remove(){
		
	}
	
	public void removeLast(){
		
	}
	
	public void removeFirst(){
		
	}
	
	public Object get(int pos){
		
		return null;
	}
	
	public void remove(int pos){
		
	}
	
	public int lenght(){
		return 0;
	}
	
	public boolean check(Object elem){
		
		return false;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder(); 
		No aux = first;
		while(aux.getNext()!=null){
			s.append(aux.toString());
			s.append("\n");
			aux = aux.getNext();
		}
		String a = new String(s.toString());
	return a;
}
	
}

