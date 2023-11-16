/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author andre
 */
public class Nodo_Documento {
    
//    private Documento doc;
    private String nombre;
    private String tipo;
    private int size;
    private int segundos;
    private boolean prio;
    private Nodo_Documento leftSon,rightSon;
    

    public Nodo_Documento(String nombre, String tipo, int size, int segundos, boolean prio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.size = size;
        this.segundos = segundos;
        this.prio = prio;
        this.leftSon = null;
        this.rightSon = null;
    }

    public Nodo_Documento getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Nodo_Documento leftSon) {
        this.leftSon = leftSon;
    }

    public Nodo_Documento getRightSon() {
        return rightSon;
    }

    public void setRightSon(Nodo_Documento rightSon) {
        this.rightSon = rightSon;
    }

//    public Documento getDoc() {
//        return doc;
//    }
//
//    public void setDoc(Documento doc) {
//        this.doc = doc;
//    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }    

    public boolean isPrio() {
        return prio;
    }

    public void setPrio(boolean prio) {
        this.prio = prio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isLeaf(){
        return getRightSon() == null && getLeftSon() == null;
    }
    
    public boolean hasOnlyRightSon(){
        return getRightSon() != null && getLeftSon() == null;
    }
    
    public boolean hasOnlyLeftSon(){
        return getRightSon() == null && getLeftSon() != null;
    }
    
    
}
