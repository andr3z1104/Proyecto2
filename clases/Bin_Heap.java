/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
//    public void insertNodo(String Nombre, int tipo, int tamano){
//        Nodo_Documento nodo = new Nodo_Documento(Nombre, tipo, tamano);
//        
//        if(isEmpty()){
//            setRoot(nodo);
//        }
//        else{
//            Nodo_Documento pointer = getRoot();
//            while(true){
//                if(tipo > pointer.getTipo()){
//                    if(pointer.getLeftSon() == null){
//                        pointer.setLeftSon(nodo);
//                        heapifyUp(nodo);
//                        break;
//                    }
//                    else{
//                        pointer = pointer.getLeftSon();
//                    }
//                }
//                else{
//                    if(pointer.getRightSon() == null){
//                        pointer.setRightSon(nodo);
//                        heapifyDown(nodo);
//                        break;
//                    }
//                    else{
//                        pointer = pointer.getRightSon();
//                    }
//                }
//            }
//        }
//    }
//    
    
    public void insert(String nombre, int tipo, int tamano) {
        Nodo_Documento nodo = new Nodo_Documento(nombre, tipo, tamano);
        if (isEmpty()) {
            setRoot(nodo); 
        } else {
            insertarRecur(getRoot(), nodo);
        }
        heapifyUp(nodo);
    }

    private void insertarRecur(Nodo_Documento pointer1, Nodo_Documento pointer2) {
        if (pointer1.getLeftSon() == null) {
            pointer1.setLeftSon(pointer2);
        } else if (pointer1.getRightSon() == null) {
            pointer1.setRightSon(pointer2);
        } else {
            insertarRecur(pointer1.getLeftSon(), pointer2);
        }
    }
    
    
    public Nodo_Documento deleteMin(){
        if(isEmpty()){
            System.out.println("El arbol esta vacio");
            return null;
        }else{
            Nodo_Documento pointer = getRoot();
//            Nodo_Documento pointerLeft = getRoot().getLeftSon();
//            Nodo_Documento pointerRight = getRoot().getRightSon();
            
            Nodo_Documento pointer2 = getLastNode();
//            pointer2.setLeftSon(pointerLeft);
//            pointer2.setLeftSon(pointerRight);
//            pointer.setLeftSon(null);
//            pointer.setRightSon(null);
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
        
        if(nodo.getTipo() < subRoot.getTipo()){
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
       if(pointer.getLeftSon() != null && pointer.getLeftSon().getTipo() > pointer.getTipo()){
            pointer.setLeftSon(pointer.getLeftSon());
        }
       else if(pointer.getRightSon() != null && pointer.getRightSon().getTipo() > pointer.getTipo()){
           pointer.setRightSon(pointer.getRightSon());
       }
       if(pointer != nodo){
           swapNodes(nodo, pointer);
           heapifyDown(pointer);
       }
    }
    
    
//    public boolean validateLeftSons(Nodo_Documento nodo){
//        return nodo.getRightSon() != null;
//    }
    
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
            System.out.println("Tamaño: " + pointer.getTamano());
            System.out.println();

            printRecur(pointer.getLeftSon());
            printRecur(pointer.getRightSon());
        
    }
    
    
}



    
