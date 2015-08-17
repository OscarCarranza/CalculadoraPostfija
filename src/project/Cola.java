
package project;

public class Cola {
    private int size;
    private Nodo head;
    private Nodo tail;
    
    public Cola(){
        size = 0;
        head = null;
        tail = null;
    }
    
    public Cola(String dato){
        size = 1;
        head = new Nodo(dato,null);
        tail = head;
    }
    
    public void queue(String dato){
        tail = new Nodo(dato,tail);
        if(head == null){
            head = tail;
        }else{
            Nodo temp = head;
            for (int i = 1; i < size; i++) {
            temp = temp.getNext();
        }
            temp.setNext(tail);
            tail.setPrevious(temp);
        }
        size++;
    }
    
    public void queue(Nodo nodo){
        tail = nodo;
        Nodo temp = head;
        for (int i = 1; i < size; i++) {
            temp = temp.getNext();
        }
        temp.setNext(tail);
        tail.setPrevious(temp);
        size++;
    }
    
    public Nodo getTail(){
        return tail;
    }
    
    public Nodo unqueue(){
        Nodo temp = head;
        head = head.getNext();
        size--;
        return temp;
    }
    
    public void Delete(int posicion){
        Nodo temp = head;
	for (int i = 1; i < posicion-1; i++){
		temp = temp.getNext();
	}
	Nodo del = temp.getNext();
	temp.setNext(del.getNext());
	size--;
    }
    
    public Nodo peek(){
        return head;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    @Override
    public String toString(){
	Nodo temp = head;
        String output = "";
	for (int i = 0; i < size; i++){
		if(i == 0)
			output += "(H) ";
		if(i != size-1)
			output += temp.getDato() + " , ";
		else
			output += temp.getDato() + " (T)";
		temp = temp.getNext();
	}
	return output;
    }   

}
