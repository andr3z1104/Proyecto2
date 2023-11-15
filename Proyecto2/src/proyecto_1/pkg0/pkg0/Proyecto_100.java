
package proyecto_1.pkg0.pkg0;
import UI.*;
import clases.*;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;


/**
 *
 * @author andre
 */
public class Proyecto_100 {

    public static void main(String[] args) {
        Bin_Heap heap = new Bin_Heap();
        Timer ti = new Timer();
        HashTable h = new HashTable(10);
        ti.run();
        ti.setSegundos(50);
        
//        TimerUI tim = new TimerUI();
//        tim.setVisible(true);
        
        heap.insertNodo("Doc1", "PDF", 100, ti.getSegundos());
        ti.setSegundos(60);
        heap.insertNodo("Doc2", "Word", 100, ti.getSegundos());
        ti.setSegundos(70);
        heap.insertNodo("Doc3", "Pub", 100, ti.getSegundos());
        ti.setSegundos(80);
        heap.insertNodo("Doc4", "PPTX", 100, ti.getSegundos());
        ti.setSegundos(90);
        heap.insertNodo("Doc5", "Win", 100, ti.getSegundos());
     
        heap.print();
        System.out.println("///////////");
        System.out.println("Delete");
        System.out.println("///////////");
        heap.deleteMin();
        
        heap.print();
        Lista d = new Lista();
        Usuario u = new Usuario("Nicola",1);
        Usuario w = new Usuario("Andres",1);
        h.insert(u);
        h.insert(w);
        h.print();
        
        
        
        
        
        
//        JFrame frame = new JFrame("Ejemplo arbol");
//        frame.setSize(500,500);
//        
//        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("TOP");
//        
//        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
//        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
//        
//        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("A1");
//        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("A2");
//        
//        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("B1");
//        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("B2");
//        DefaultMutableTreeNode B3 = new DefaultMutableTreeNode("B3");
//        
//        A.add(A1);
//        A.add(A2);
//        
//        B.add(B1);
//        B.add(B2);
//        B.add(B3);
//        
//        rootNode.add(A);
//        rootNode.add(B);
//        
//        JTree tree = new JTree(rootNode);
//        frame.add(tree);
//        frame.setVisible(true);
//        
  
    }
    
}
