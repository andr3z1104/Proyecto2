/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.view.Viewer;

import java.util.Random;


/**
 *
 * @author andre
 */
public class Graficar_Bin {
    
    private Bin_Heap arbol;

    public Graficar_Bin(Bin_Heap arbol) {
        this.arbol = arbol;
    }

    public Bin_Heap getArbol() {
        return arbol;
    }

    public void setArbol(Bin_Heap arbol) {
        this.arbol = arbol;
    }

    
     public Graph recurArbol(){
         Graph g = new SingleGraph("hp");
         g.addNode(getArbol().getRoot().getNombre());
         Random r = new Random();
         returnArbol(getArbol().getRoot(), g, r.nextInt(100000));
         return g;
     }
    
    
    
     public Graph returnArbol(Nodo_Documento nodo, Graph g, int cont){
         
         if(nodo.getLeftSon() != null){
             Random r = new Random();
             g.addNode(nodo.getLeftSon().getNombre());
             g.addEdge(Integer.toString(r.nextInt(100000)), nodo.getNombre(), nodo.getLeftSon().getNombre(), true);
             returnArbol(nodo.getLeftSon(), g, r.nextInt(100000));
         }
         
         if(nodo.getRightSon() != null){
             Random r = new Random();
             g.addNode(nodo.getRightSon().getNombre());
             g.addEdge(Integer.toString(r.nextInt(100000)), nodo.getNombre(), nodo.getRightSon().getNombre(), true);
             returnArbol(nodo.getRightSon(), g, r.nextInt(100000));
         }
         
         return g;
         
     }
     
     
     public void mostrar(){
        Graph g = recurArbol();
        g.setAttribute("ui.stylesheet", "node { text-alignment: under; }");
        
        for (Node node : g) {
            node.setAttribute("ui.label", node.getId());
        }
         
        for (Node node : g) {
            node.setAttribute("ui.style", "text-size: 20;");
        }
        
        Viewer viewer = g.display();
        viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
    }
     
}
