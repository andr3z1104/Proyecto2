
package clases;
import java.util.Random;

/**
 *
 * @author andre
 */
public class Usuario {
    
    private String nombre;
    private int ID;
    private int tipo;
    private Lista Documentos;

    public Usuario(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ID = generarID();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Lista getDocumentos() {
        return Documentos;
    }

    public void setDocumentos(Lista Documentos) {
        this.Documentos = Documentos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    private int generarID(){
        Random r = new Random();
        return r.nextInt(10000);
    }
    
}
