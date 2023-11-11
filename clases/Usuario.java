
package clases;

/**
 *
 * @author andre
 */
public class Usuario {
    
    private String nombre;
    private int tipo;
    private Lista Documentos;

    public Usuario(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
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
    
    
    
}
