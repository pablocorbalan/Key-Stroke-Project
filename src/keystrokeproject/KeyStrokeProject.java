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
import javax.swing.SwingUtilities;
public class KeyStrokeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                MyJFrame f = new MyJFrame();
                f.setVisible(true);
            }
        });
    }
}
