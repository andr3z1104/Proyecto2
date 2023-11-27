
package Main;
import UI.*;
import clases.*;


/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui", "swing");
        CargarArchivo ventana = new CargarArchivo();
        ventana.setVisible(true);
        

    }
    
}
