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
    private int size;
    private String tipo;
    private int segundos;
    private Nodo_Documento leftSon,rightSon;
    

    public Nodo_Documento(String Nombre, String tipo, int size, int segundos) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.size = size;
        this.segundos = segundos;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
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
