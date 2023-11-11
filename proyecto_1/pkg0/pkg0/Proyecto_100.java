
package proyecto_1.pkg0.pkg0;
import clases.*;

/**
 *
 * @author andre
 */
public class Proyecto_100 {

    public static void main(String[] args) {
        Bin_Heap heap = new Bin_Heap();
        
        heap.insertNodo("Doc1", 1, 100);
        heap.insertNodo("Doc2", 2, 100);
        heap.insertNodo("Doc3", 2, 100);
        heap.insertNodo("Doc4", 3, 100);
        heap.insertNodo("Doc5", 3, 100);
        
        heap.print();
        System.out.println("///////////");
        System.out.println("Delete");
        System.out.println("///////////");
        heap.deleteMin();
        
        heap.print();
        
//        System.out.println("Insert");
//        heap.insert("Doc6", 1, 100);
//        heap.print();
    }
    
}
