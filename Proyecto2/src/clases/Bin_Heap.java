
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
    
     public int size() {
        return getSize(root);
    }
    
    
    public boolean isEmpty(){
        return getRoot() == null;
    }
    
    public Nodo_Documento checkPrio(Nodo_Documento nodo, Usuario usuario){
        if(nodo.isPrio()){
            if(usuario.getTipo()==1){
                nodo.setSegundos(nodo.getSegundos()/10);
                return nodo;
            }else if (usuario.getTipo()==2){
                nodo.setSegundos(nodo.getSegundos()/5);
                return nodo;
            }else{
                nodo.setSegundos(nodo.getSegundos()/2);
                return nodo;
            }

        }
        else{
            return nodo;
        }
    }
    
    public void insertNodo(String nombre, String tipo, int size, boolean prio, Timer ti, Usuario usuario){
        int segundos = ti.getSegundos();
        Nodo_Documento nodo = new Nodo_Documento(nombre, tipo, size, segundos, prio);
        
        checkPrio(nodo, usuario);
        
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
                    else if(pointer.getRightSon() == null){
                        pointer.setRightSon(nodo);
                        heapifyUp(nodo);
                        break;
                    }
                    else{
                        Nodo_Documento pointer2 = pointer.getRightSon();
                        pointer = pointer.getLeftSon();
                        
                        if(pointer.getLeftSon() != null && pointer.getRightSon() != null){
                            pointer = pointer2;
                        }
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
            pointer2.setLeftSon(pointer.getLeftSon());
            pointer2.setRightSon(pointer.getRightSon());
            heapifyDown(getRoot());
            
            return pointer;
        }
    }
    
    public Nodo_Documento getLastNode(){
        Nodo_Documento pointer = getRoot();
        Nodo_Documento pointer2 = null;
        
        if(pointer.getRightSon() == null){
            pointer2 = pointer.getLeftSon();
            pointer.setLeftSon(null);
            return pointer2;
        }
        
        while(pointer.getRightSon() != null){
            pointer2 = pointer;
            pointer = pointer.getRightSon();
        }
        
        if(pointer2 != null){
            pointer2.setRightSon(null);
        }
        else{
            pointer2 = pointer;
            pointer = null;
        }
        
        return pointer;
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
        try{
        
        if(pointer.getLeftSon() == pointer2 || pointer.getRightSon() == pointer2){
            return pointer;
                }
            
        }catch(Exception e){
            try{
                Nodo_Documento leftSubRoot = searchSubRoot(pointer.getLeftSon(), pointer2);
                if(leftSubRoot != null){
                return leftSubRoot;
                    }
                
            }catch(Exception w){

            Nodo_Documento rightSubRoot = searchSubRoot(pointer.getRightSon(), pointer2);
            return rightSubRoot;
            }  
        }   
       return pointer;   
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
    
    public int getSize(Nodo_Documento node) {
        if (node == null) {
            return 0;
        }
        int size = 1;
        size += getSize(node.getLeftSon());
        size += getSize(node.getRightSon());
        return size;
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



    
