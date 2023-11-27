 
package clases;

/**
 *
 * @author andre
 */
public class Bin_Heap {
 
    private Nodo_Documento root;
    private Queue_Bin q;
   

    public Bin_Heap() {
        this.root = null;
        this.q = new Queue_Bin();
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

    public Queue_Bin getQ() {
        return q;
    }

    public void setQ(Queue_Bin q) {
        this.q = q;
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
    
    public void insertNodo(String nombre, String tipo, int size, boolean prio, double ti, Usuario usuario){

        Nodo_Documento nodo = new Nodo_Documento(nombre, tipo, size, ti, prio);
        
        checkPrio(nodo, usuario);
        
        if(isEmpty()){
            setRoot(nodo);
        }
        else{
            Nodo_Documento pointer = getRoot();
            while(true){
                if(ti > pointer.getSegundos()){
                    
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
                        heapifyUp(nodo);
                        break;
                    } 
                }
                else{
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
                            pointer = pointer2;}
                            heapifyUp(nodo);
                            break;
                        
                    }
                }
            }
        }
    }
    
    
    public Nodo_Documento deleteMin(){
        if(isEmpty()){
            System.out.println("El arbol esta vacio");
            return null;
        }else if(getRoot().getLeftSon()==null && getRoot().getRightSon()==null ){
            Nodo_Documento d = new Nodo_Documento(getRoot().getNombre(),getRoot().getTipo(),getRoot().getSize(),getRoot().getSegundos(),getRoot().isPrio());
            setRoot(null);
            System.out.println("d"+d);
            return d;
        }else {
            
            
            Nodo_Documento pointer = getRoot();
            Nodo_Documento pointer2 = getLastNode();
            
          
            setRoot(pointer2);
            pointer2.setLeftSon(pointer.getLeftSon());
            pointer2.setRightSon(pointer.getRightSon());
            heapifyDown(getRoot(), true);
            System.out.println("hola"+getRoot());
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
            
            if(subRoot.getLeftSon() == nodo){
                System.out.println("hola");
                Nodo_Documento temp = new Nodo_Documento(nodo.getNombre(),nodo.getTipo(),nodo.getSize(),nodo.getSegundos(),nodo.isPrio());

                Nodo_Documento temp2;
                        temp2 = new Nodo_Documento( subRoot.getNombre(), nodo.getTipo(), nodo.getSize(), nodo.getSegundos(), nodo.isPrio());
                temp2.setLeftSon(null);
                temp2.setRightSon(subRoot.getRightSon());


                subRoot.setLeftSon(null);

                Nodo_Documento node = swapNodes(subRoot, nodo);

                node.setRightSon(temp2.getRightSon());
                node.setLeftSon(subRoot);

                nodo.setLeftSon(temp.getLeftSon());
                nodo.setRightSon(temp.getRightSon());
                
                if(subRoot == getRoot()){
                    setRoot(node);
                    heapifyUp(node);
                }
                else{
                    heapifyUp(node);
                }
            }
            
            else if(subRoot.getRightSon() == nodo){
                System.out.println("dio");
                        Nodo_Documento temp = new Nodo_Documento(nodo.getNombre(),nodo.getTipo(),nodo.getSize(),nodo.getSegundos(),nodo.isPrio());

                Nodo_Documento temp2;
                           temp2 = new Nodo_Documento( subRoot.getNombre(), nodo.getTipo(), nodo.getSize(), nodo.getSegundos(), nodo.isPrio());
                temp2.setLeftSon(subRoot.getLeftSon());
                temp2.setRightSon(null);


                subRoot.setRightSon(null);

                Nodo_Documento node = swapNodes(subRoot, nodo);

                node.setRightSon(subRoot);
                    node.setLeftSon(temp2.getLeftSon());

                subRoot.setLeftSon(temp.getLeftSon());
                subRoot.setRightSon(temp.getRightSon());
                
                if(subRoot == getRoot()){
                    setRoot(node);
                    heapifyUp(node);
                }
                else{
                    heapifyUp(node);
                }
            }
            else{
                System.out.println("ultima");
                heapifyUp(nodo);
            }
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
    
    
    public void heapifyDown(Nodo_Documento nodo, boolean isFirstTime){
       
       if(nodo.getLeftSon() != null && nodo.getLeftSon().getSegundos() < nodo.getSegundos()){
           Nodo_Documento leftSon = nodo.getLeftSon();
           
           Nodo_Documento temp = new Nodo_Documento(leftSon.getNombre(),leftSon.getTipo(),leftSon.getSize(),leftSon.getSegundos(),leftSon.isPrio());
           temp.setLeftSon(leftSon.getLeftSon());
           temp.setRightSon(leftSon.getRightSon());
           
           Nodo_Documento temp2;
            temp2 = new Nodo_Documento(nodo.getNombre(), nodo.getTipo(), nodo.getSize(), nodo.getSegundos(), nodo.isPrio());
           temp2.setLeftSon(leftSon);
           temp2.setRightSon(nodo.getRightSon());
           
           leftSon.setLeftSon(null);
           leftSon.setRightSon(null);
           
           
           nodo.setRightSon(null);
           nodo.setLeftSon(null);
           
           
           
           Nodo_Documento node = swapNodes(nodo, leftSon);
           
           node.setRightSon(temp2.getRightSon());
           node.setLeftSon(nodo);
           
           nodo.setLeftSon(temp.getLeftSon());
           nodo.setRightSon(temp.getRightSon());
           
              if(isFirstTime){
           setRoot(node);
           heapifyDown(nodo, false);
            }else{
             getRoot().setLeftSon(node);
             heapifyDown(nodo, false);
            }
           
       }
       else if(nodo.getRightSon() != null && nodo.getRightSon().getSegundos() < nodo.getSegundos()){
           Nodo_Documento temp = new Nodo_Documento(nodo.getRightSon().getNombre(), nodo.getRightSon().getTipo(), nodo.getRightSon().getSize(), nodo.getRightSon().getSegundos(), nodo.getRightSon().isPrio());
          Nodo_Documento temp2 = new Nodo_Documento(nodo.getNombre(),nodo.getTipo(),nodo.getSize(),nodo.getSegundos(),nodo.isPrio());
           
           Nodo_Documento rightSon = nodo.getRightSon();
           rightSon.setLeftSon(null);
           rightSon.setRightSon(null);
           
           
           nodo.setRightSon(null);
           nodo.setLeftSon(null);
           
           
           
           Nodo_Documento node = swapNodes(nodo, rightSon);
           
           node.setRightSon(nodo);
           node.setLeftSon(temp2.getLeftSon());
           
           nodo.setLeftSon(temp.getLeftSon());
           nodo.setRightSon(temp.getRightSon());
           
            if(isFirstTime){
           setRoot(node);
           heapifyDown(nodo, false);
            }else{
             getRoot().setRightSon(node);
             heapifyDown(nodo, false);
            }
       }
       
       else{
           heapifyUp(nodo);
       }
    }
    
    public Nodo_Documento swapNodes(Nodo_Documento n1, Nodo_Documento n2){
        Nodo_Documento temp = n1;
        n1 = n2;
        n2 = temp;
        return n1;
    }
    
    public Bin_Heap deleteSpecific(Bin_Heap bin, String nombre, Usuario user){
        
        while(bin.getRoot() != null){
            Nodo_Documento pointer = bin.deleteMin();
            pointer.setLeftSon(null);
            pointer.setRightSon(null);
            bin.getQ().enqueue(pointer);
        }
        
        Nodo pointer2 = bin.getQ().getHead();
        while(pointer2 != null) {
            if(((Nodo_Documento)pointer2.getElement()).getNombre().equalsIgnoreCase(nombre)){
                ((Nodo_Documento)pointer2.getElement()).setSegundos(1);
                Nodo pointer3 = bin.getQ().dequeue();
                Nodo_Documento pointer4 = (Nodo_Documento) pointer3.getElement();
                bin.insertNodo(pointer4.getNombre(), pointer4.getTipo(), pointer4.getSize(), pointer4.isPrio(), pointer4.getSegundos(), user);
                bin.deleteMin();
                break;
            }
            else{
                Nodo pointer3 = bin.getQ().dequeue();
                Nodo_Documento pointer4 = (Nodo_Documento) pointer3.getElement();
                bin.insertNodo(pointer4.getNombre(), pointer4.getTipo(), pointer4.getSize(), pointer4.isPrio(), pointer4.getSegundos(), user);
                pointer2 = bin.getQ().getHead();
            }
            
            
        }
        
        
        
        return bin;
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



    
