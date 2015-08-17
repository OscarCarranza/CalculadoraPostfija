
package project;

public class Pila {
    
    private int size;
    private Nodo tos;
    
    public Pila(){
        this.size = 0;
        this.tos = null;
    }
    
    public Pila(String dato){
        this.size = 1;
        this.tos = new Nodo(dato,null);
    }
    
    public Nodo pop(){
        Nodo ult = tos;
        tos = tos.getPrevious();
        size--;
        return ult;
    }
    
    public void push(String dato){
        Nodo nuevo = new Nodo(dato,tos);
        if(tos == null){
            tos = nuevo;
        }else{
           tos.setNext(nuevo);
            tos = nuevo; 
        }
        size++;
    }
    
    public void push(Nodo nodo){
        Nodo nuevo = nodo;
        if(tos == null){
            tos = nodo;
        }else{
            tos.setNext(nodo);
            nodo.setPrevious(tos);
            tos = nodo; 
        }
        size++;
    }
    
    public Nodo peek(){
        return tos;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    @Override
    public String toString(){
        Nodo temp = tos;
        String output = "";
        if(size > 0){
            output = " (ToS)";
        }
        for (int i = 0; i < size; i++){
            if(i != size-1)
                output = " , " + temp.getDato() + output;
            else
		output = temp.getDato() + output;
            temp = temp.getPrevious();
	}
        return output;
    }

}
