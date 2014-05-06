package lists;

public class No {
	
	private No next;
	private Object element;
	
	public No(No next,Object element){
		this.next = next;
		this.element = element;
	}
	
	public No(Object element){
		this.element = element;
	}
	
	public Object getElement(){
		return this.element;
	}
	
	public No getNext(){
		return this.next;
	}
	
	public void setNext(No next){
		this.next = next;
	}
	
	public String toString(){
		return element.toString();
	}

}
