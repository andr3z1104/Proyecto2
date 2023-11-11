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
    
    private String Nombre;
    private int tamano;
    private int tipo;
    private Nodo_Documento leftSon,rightSon;
    //private Nodo_Documento subRoot;

    public Nodo_Documento(String Nombre, int tipo, int tamano) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.leftSon = null;
        this.rightSon = null;
        //this.subRoot = null;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

//    public Nodo_Documento getSubRoot() {
//        return subRoot;
//    }
//
//    public void setSubRoot(Nodo_Documento subRoot) {
//        this.subRoot = subRoot;
//    }
//    
    
    
    
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
