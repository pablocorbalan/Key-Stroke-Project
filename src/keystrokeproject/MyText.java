/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package keystrokeproject;

/**
 *
 * @author PabloCorbalan
 */

//Importamos librerías
import java.io.*;
public class MyText {
    
    //Definimos los objetos a utilizar
    FileWriter fichero = null;
    PrintWriter pw = null;
    
    public MyText(){
        
    }
    
    public void escribeFichero(String s){
        try{
            String path = new File ("").getAbsolutePath ();
            fichero = new FileWriter(path+"/testsDone/prueba.txt");
            System.out.println("Se ha creado un fichero en "+path+"/testsDone/prueba.txt");
            pw = new PrintWriter(fichero);
            pw.print(s);
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
}
