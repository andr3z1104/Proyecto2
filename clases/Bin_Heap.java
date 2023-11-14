
package clases;

/**
 *
 * @author andre
 */
public class Bin_Heap {
 
    private Nodo_Documento root;

    public Bin_Heap() {
        this.root = null;
    }

    public Nodo_Documento getRoot() {
        return root;
    }

    public void setRoot(Nodo_Documento root) {
        this.root = root;
    }
    
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public void insertNodo(String Nombre, String tipo, int size, int segundos){
        Nodo_Documento nodo = new Nodo_Documento(Nombre, tipo, size, segundos);
        
        if(isEmpty()){
            setRoot(nodo);
        }
        else{
            Nodo_Documento pointer = getRoot();
            while(true){
                if(segundos > pointer.getSegundos()){
                    if(pointer.getLeftSon() == null){
                        pointer.setLeftSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        pointer = pointer.getLeftSon();
                    }
                }
                else{
                    if(pointer.getRightSon() == null){
                        pointer.setRightSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        pointer = pointer.getRightSon();
                    }
                }
            }
        }
    }
    
    
    public Nodo_Documento deleteMin(){
        if(isEmpty()){
            System.out.println("El arbol esta vacio");
            return null;
        }else{
            Nodo_Documento pointer = getRoot();

            
            Nodo_Documento pointer2 = getLastNode();
            setRoot(pointer2);
            heapifyDown(getRoot());
            return pointer;
        }
    }
    
    public Nodo_Documento getLastNode(){
        Nodo_Documento pointer = getRoot();
        Nodo_Documento pointer2 = null;
        
        while(pointer.getRightSon() != null){
            pointer = pointer.getRightSon();
        }
        
        if(pointer.getLeftSon() != null){
            pointer2 = pointer.getLeftSon();
            pointer.setLeftSon(null);
        }
        else{
            pointer2 = pointer;
        }
        
        return pointer2;
    }
    
    public void heapifyUp(Nodo_Documento nodo){
        if(nodo == getRoot()){
            return;
        }
        
        Nodo_Documento subRoot = searchSubRoot(getRoot(), nodo);
        
        if(nodo.getSegundos() < subRoot.getSegundos()){
            swapNodes(nodo, subRoot);
            heapifyUp(nodo);
        }
    }
    
    public Nodo_Documento searchSubRoot(Nodo_Documento pointer, Nodo_Documento pointer2){
        if(pointer.getLeftSon() == pointer2 || pointer.getRightSon() == pointer2){
            return pointer;
        }
        
        Nodo_Documento leftSubRoot = searchSubRoot(pointer.getLeftSon(), pointer2);
        if(leftSubRoot != null){
            return leftSubRoot;
        }
        
        Nodo_Documento rightSubRoot = searchSubRoot(pointer.getRightSon(), pointer2);
        return rightSubRoot;
    }
    
    
    public void heapifyDown(Nodo_Documento nodo){
       Nodo_Documento pointer = nodo;
       if(pointer.getLeftSon() != null && pointer.getLeftSon().getSegundos() > pointer.getSegundos()){
            pointer.setLeftSon(pointer.getLeftSon());
        }
       else if(pointer.getRightSon() != null && pointer.getRightSon().getSegundos() > pointer.getSegundos()){
           pointer.setRightSon(pointer.getRightSon());
       }
       if(pointer != nodo){
           swapNodes(nodo, pointer);
           heapifyDown(pointer);
       }
    }
    
    public void swapNodes(Nodo_Documento n1, Nodo_Documento n2){
        Nodo_Documento temp = n1;
        n1 = n2;
        n2 = temp;
    }
    
    
    public void print(){
        printRecur(getRoot());
    }
    
    public void printRecur(Nodo_Documento pointer){
        if(pointer == null){
            return;
        }
            System.out.println("Nombre: " + pointer.getNombre());
            System.out.println("Tipo: " + pointer.getTipo());
            System.out.println("Size: " + pointer.getSize());
            System.out.println("Tiempo: " + pointer.getSegundos());
            System.out.println();

            printRecur(pointer.getLeftSon());
            printRecur(pointer.getRightSon());
        
    }
    
    
}



    
