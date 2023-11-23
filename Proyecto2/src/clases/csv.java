/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author UsuarioDeWindows
 */
public class csv {
        public String Seleccionar(){
        String path;
        JFileChooser buscador = new JFileChooser();
        buscador.showOpenDialog(buscador);
        path = buscador.getSelectedFile().getAbsolutePath();
        return path;
    }

        public Lista leer(String path){
            BufferedReader br = null;
            Lista users = new Lista();
      
        try {

           br =new BufferedReader(new FileReader(path));
           String line = br.readLine();
           while (null!=line) {
              String [] fields = line.split(",");
              int x=0;
              if (fields[1].equalsIgnoreCase("prioridad_baja")){
                  x=3;    
              }else if(fields[1].equalsIgnoreCase("prioridad_media")){
                  x=2;
              }else if (fields[1].equalsIgnoreCase("prioridad_alta")){
                  x=1;
              }
              Usuario usuario = new Usuario(fields[0],x);
              users.insertFinale(usuario);

              line = br.readLine();
           }



           br.close();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e);
          }
            return users;
        }
        
        public void modificarCSV(String path, String data,String nombre, String tipo){
        try {
            PrintWriter output = new PrintWriter(path);
            data=data+nombre+","+tipo;
            output.write(data); 
            output.close(); 
        } 
  
        catch (Exception e) { 
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e);
        } 
    }
        
       public String ObtenerStr(String path){
           String s="";
           BufferedReader br = null;
           
           try {
           br =new BufferedReader(new FileReader(path));
           
           String line = br.readLine();
               
           while (line!=null) {
              
              s=s+line+"\n";
              line = br.readLine();
           }

           br.close();
           } catch (Exception e) {
               e.getStackTrace();
              JOptionPane.showMessageDialog(null, "1");
          }
        return s;   
       }
       public String borrarLine(String path, String nombre){
       String s="";
       BufferedReader br = null;
           
           try {
           br =new BufferedReader(new FileReader(path));
           
           String line = br.readLine();
               
           while (line!=null) {
              if(!line.contains(nombre)){
              s=s+line+"\n";
              }
              line = br.readLine();
           }

           br.close();
           } catch (Exception e) {
               e.getStackTrace();
              JOptionPane.showMessageDialog(null, "2");
          }
       
       return s;
       }
    
        public void borrarCSV(String path,String data){
            try {
            PrintWriter output = new PrintWriter(path);
            output.write(data); 
            output.close(); 
        } 
  
        catch (Exception e) { 
            e.getStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
            
        }
}
