
package clases;

/**
 *
 * @author andre
 */
public class HashTable {
    
    private int size;
    public Lista[] tabla;

    public HashTable(int size) {
        
        this.size = size;
        this.tabla = new Lista[size];
        
        for(int i= 0;i<size;i++){
            Lista temp = new Lista();
            this.tabla[i] = temp;
            }
        
    }
   

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Lista[] getTabla() {
        return tabla;
    }

    public void setTabla(Lista[] tabla) {
        this.tabla = tabla;
    }
    
    private int hashFunction(Integer usuario){
        int hashCode = usuario.hashCode();
        return Math.abs(hashCode) % tabla.length;
    }
    
     public void insert(Usuario Usuario){
        int usuario = Usuario.getID();
        int index = hashFunction(usuario);
        tabla[index].insertAtIndex(usuario,index);
    }
     
    public void delete(Usuario Usuario){
        int usuario = Usuario.getID();
        int index = hashFunction(usuario);
        tabla[index].deleteAtIndex(index);
    }
    
    public Nodo search(Usuario Usuario){
        int usuario = Usuario.getID();
        int index = hashFunction(usuario);
        return tabla[index].searchByIndex(index);
    }
    
    public void print(){
        for (int i = 0; i < getSize(); i++) {
            tabla[i].print();
        }
    }
    
    
    
}
