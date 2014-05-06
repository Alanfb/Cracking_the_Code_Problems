package lists;

public class LinkedList2 {
	Object o;
	public LinkedList2 next;
	static LinkedList2 first;
	
	public void add(Object o){
		LinkedList2 aux = this;
		if(aux.first==null){
			this.o=o;
			this.next = null;
			first=this;
		}
		else{
			while(aux.next!=null){
				aux = aux.next;
			}
			LinkedList2 novo = new LinkedList2();
			novo.o = o;
			novo.next = null;
			aux.next = novo;
		}
	}
	
	public void remove(Object a){
		LinkedList2 aux = this;
		if(aux.o == a){
			this.o = aux.next.o;
			this.next = aux.next.next;
			first = aux.next;
		}
		else{
			while(aux.next!=null){
				if(aux.next.o == a){
					if(aux.next.next==null){
						aux.next=null;
						break;
					}
					else{
						aux.next.o = aux.next.next.o;
						aux.next = aux.next.next;
					}
				}
				aux = aux.next;
			}
		}
		
	}
	
	public boolean check(Object a){
		LinkedList2 aux = this;
		if(aux.o == a) return true;
		else{
			while(aux.next!=null){
				if(aux.next.o == a) return true;
				aux = aux.next;
			}
		}
		return false;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder(); 
		LinkedList2 aux = new LinkedList2();
		aux =this;
		s.append(aux.o.toString());
		while(aux.next!=null){
			s.append("\n\n");
			s.append(aux.next.o.toString());
			aux = aux.next;
		}
		return s.toString();
}

}
