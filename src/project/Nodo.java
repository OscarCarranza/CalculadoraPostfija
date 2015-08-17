
package project;

public class Nodo {
    protected String dato;
    protected Nodo next;
    protected Nodo previous;
    
    public Nodo(){
        
    }
    
    public Nodo(String dato, Nodo previous){
        this.dato = dato;
        this.next = null;
        this.previous = previous;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }

}
