/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UI;

/**
 *
 * @author ACER
 */
public class IniciarInterfaz {

    public static void main(String[] args) {
        System.setProperty("org.graphstream.ui", "swing");
        CargarArchivo ventana = new CargarArchivo();
        ventana.setVisible(true);
        
    }
}
