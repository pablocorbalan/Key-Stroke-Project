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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;


public class MyJFrame extends JFrame implements KeyListener, ActionListener{

    //Declaramos los objetos de nuestra aplicacion
    JTabbedPane jtp;
    JPanel jp1, jp2, jp3, jp4, jp5;
    JTextField txtUser1, txtUser2, txtName, txtSurname, txtCity, txtAge, txtMail,
            txtID, txtKey, txtCode;
    JPasswordField txtPass1, txtPass2, txtPass2Repeated;
    JLabel lblUser1, lblPass1, lblName, lblSurname, lblUser2, lblPass2, lblPass2Repeated, lblCity, lblAge, lblMail,
            lblID, lblTest1, lblTest2, lblKey, lblCode;
    JButton bLogIn, bSignIn, bTest1, bTest2;
    JTextArea atxt11, atxt12, atxt21, atxt22;
    
    //Variables de teclado y tiempos
    long [] timePressed = new long[1000];
    long [] timeReleased = new long[1000];
    String [] keyPressed = new String[1000];
    String [] keyReleased = new String[1000];
    int [] keyCodeP = new int[1000];
    int [] keyCodeR = new int[1000];
    String [] keyModifiersP = new String[1000];
    int iPressed = 0;
    int iReleased = 0;
    String s="";
    
    public MyJFrame(){
        initGUI();
    }
    
    private void initGUI(){
        
        //Creamos el panel y definimos el Layout
        jtp = new JTabbedPane();
        jp1 = new JPanel();
        jp1.setLayout(null);
        jp2 = new JPanel();
        jp2.setLayout(null);
        jp3 = new JPanel();
        jp3.setLayout(null);
        jp4 = new JPanel();
        jp4.setLayout(null);
        jp5 = new JPanel();
        jp5.setLayout(null);
        
        //Log In Interface
        //Creamos las etiquetas
        lblUser1 = new JLabel("Username: ");
        lblUser1.setBounds(20, 20, 80, 30);
        lblPass1 = new JLabel("Password: ");
        lblPass1.setBounds(20, 50, 80, 30);
        
        //Creamos los campos de texto
        txtUser1 = new JTextField(20);
        txtUser1.setBounds(100, 20, 400, 25);
        txtUser1.setFocusable(true);
        txtUser1.addKeyListener(this);
        
        txtPass1 = new JPasswordField(20);
        txtPass1.setBounds(100, 50, 400, 25);
        txtPass1.setFocusable(true);
        txtPass1.addKeyListener(this);
        
        //Creamos el botón de log in
        bLogIn = new JButton("Log In");
        bLogIn.setBounds(20, 80, 180, 30);
        bLogIn.addActionListener(this);
        
        //Añadimos los componentes al Panel
        jp1.add(lblUser1);
        jp1.add(txtUser1);
        jp1.add(lblPass1);
        jp1.add(txtPass1);
        jp1.add(bLogIn);
        
        //Sign In Interface
        //Creamos las etiquetas
        lblName = new JLabel("Name: ");
        lblName.setBounds(20, 20, 100, 30);
        lblSurname = new JLabel("Surname: ");
        lblSurname.setBounds(20, 50, 100, 30);
        lblID = new JLabel("ID: ");
        lblID.setBounds(20, 80, 100, 30);
        lblAge = new JLabel("Age: ");
        lblAge.setBounds(20, 110, 100, 30);
        lblCity = new JLabel("City: ");
        lblCity.setBounds(20, 140, 100, 30);
        lblMail = new JLabel("Mail: ");
        lblMail.setBounds(20, 170, 100, 30);
        lblUser2 = new JLabel("Username: ");
        lblUser2.setBounds(20, 200, 100, 30);
        lblPass2 = new JLabel("Password: ");
        lblPass2.setBounds(20, 230, 100, 30);
        lblPass2Repeated = new JLabel("Repeat pass: ");
        lblPass2Repeated.setBounds(20, 260, 100, 30);
        
        //Creamos los campos de texto
        txtName = new JTextField();
        txtName.setBounds(110, 20, 150, 30);
        txtName.setFocusable(true);
        txtName.addKeyListener(this);
        txtSurname = new JTextField();
        txtSurname.setBounds(110, 50, 150, 30);
        txtSurname.setFocusable(true);
        txtSurname.addKeyListener(this);
        txtID = new JTextField();
        txtID.setBounds(110, 80, 150, 30);
        txtID.setFocusable(true);
        txtID.addKeyListener(this);
        txtAge = new JTextField();
        txtAge.setBounds(110, 110, 150, 30);
        txtAge.setFocusable(true);
        txtAge.addKeyListener(this);
        txtCity = new JTextField();
        txtCity.setBounds(110, 140, 150, 30);
        txtCity.setFocusable(true);
        txtCity.addKeyListener(this);
        txtMail = new JTextField();
        txtMail.setBounds(110, 170, 150, 30);
        txtMail.setFocusable(true);
        txtMail.addKeyListener(this);
        txtUser2 = new JTextField();
        txtUser2.setBounds(110, 200, 150, 30);
        txtMail.setFocusable(true);
        txtMail.addKeyListener(this);
        txtPass2 = new JPasswordField();
        txtPass2.setBounds(110, 230, 150, 30);
        txtPass2.setFocusable(true);
        txtPass2.addKeyListener(this);
        txtPass2Repeated = new JPasswordField();
        txtPass2Repeated.setBounds(110, 260, 150, 30);
        txtPass2Repeated.setFocusable(true);
        txtPass2Repeated.addKeyListener(this);
        
        //Creamos el botón de Sign In
        bSignIn = new JButton("Sign In");
        bSignIn.setBounds(20, 290, 180, 30);
        bSignIn.addActionListener(this);
        
        //Añadimos los componentes al panel
        jp2.add(lblName);
        jp2.add(txtName);
        jp2.add(lblSurname);
        jp2.add(txtSurname);
        jp2.add(lblID);
        jp2.add(txtID);
        jp2.add(lblAge);
        jp2.add(txtAge);
        jp2.add(lblCity);
        jp2.add(txtCity);
        jp2.add(lblMail);
        jp2.add(txtMail);
        jp2.add(lblUser2);
        jp2.add(txtUser2);
        jp2.add(lblPass2);
        jp2.add(txtPass2);
        jp2.add(lblPass2Repeated);
        jp2.add(txtPass2Repeated);
        jp2.add(bSignIn);
        
        //Test 1 Interface
        lblTest1 = new JLabel("Escriba el siguiente texto: ");
        lblTest1.setBounds(20, 20, 450, 30);
        atxt11 = new JTextArea("Un día vi una vaca vestida de uniforme.");
        atxt11.setBounds(20, 50, 480, 50);
        atxt11.setEnabled(false);
        atxt12 = new JTextArea("");
        atxt12.setBounds(20, 120, 480, 50);
        atxt12.setFocusable(true);
        atxt12.addKeyListener(this);
        bTest1 = new JButton("Enviar Test");
        bTest1.setBounds(20, 180, 450, 30);
        bTest1.addActionListener(this);
        
        //Añadimos los componentes al panel
        jp3.add(lblTest1);
        jp3.add(atxt11);
        jp3.add(atxt12);
        jp3.add(bTest1);
        
        //Test 2 Interface
        lblTest2 = new JLabel("Escriba el siguiente texto: ");
        lblTest2.setBounds(20, 20, 450, 30);
        atxt21 = new JTextArea("En un lugar de la Mancha, de cuyo nombre no "
                + "quiero acordarme, no ha mucho tiempo que vivía un hidalgo "
                + "de los de lanza en astillero, adarga antigua, rocín flaco "
                + "y galgo corredor.");
        atxt21.setBounds(20, 50, 480, 50);
        atxt21.setEnabled(false);
        atxt21.setLineWrap(true);
        atxt21.setWrapStyleWord(true);
        
        atxt22 = new JTextArea("");
        atxt22.setBounds(20, 120, 480, 50);
        atxt22.setFocusable(true);
        atxt22.setLineWrap(true);
        atxt22.setWrapStyleWord(true);
        atxt22.addKeyListener(this);
        bTest2 = new JButton("Enviar Test");
        bTest2.setBounds(20, 180, 450, 30);
        bTest2.addActionListener(this);
        
        //Añadimos los componentes al panel
        jp4.add(lblTest2);
        jp4.add(atxt21);
        jp4.add(atxt22);
        jp4.add(bTest2);
                
        //KeyCode Interface
        //Creamos las etiquetas
        lblKey = new JLabel("Key: ");
        lblKey.setBounds(20, 20, 80, 30);
        lblCode = new JLabel("KeyCode: ");
        lblCode.setBounds(20, 50, 80, 30);
        
        //Creamos los campos de texto
        txtKey = new JTextField(20);
        txtKey.setBounds(100, 20, 400, 25);
        txtKey.setFocusable(true);
        txtKey.addKeyListener(this);
        
        txtCode = new JTextField(20);
        txtCode.setBounds(100, 50, 400, 25);
        txtCode.setEnabled(false);
        
        //Añadimos los componentes al panel 
        jp5.add(lblKey);
        jp5.add(txtKey);
        jp5.add(lblCode);
        jp5.add(txtCode);
        
        
        //Añadimos los distintos paneles al JTabbedPane
        //add(jp1);
        getContentPane().add(jtp);
        jtp.addTab("Log In", jp1);
        jtp.addTab("Sign In", jp2);
        jtp.addTab("Test 1", jp3);
        jtp.addTab("Test 2", jp4);
        jtp.addTab("KeyCode", jp5);

        setTitle("KeyStroke Dynamics");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    //Eventos KeyListener
    public void keyTyped(KeyEvent e) {

    }
     
    public void keyPressed(KeyEvent e) {
        if(e.getSource()==txtKey){
            txtCode.setText(""+e.getKeyCode());
        }else{
            timePressed[iPressed] = e.getWhen();            
            keyCodeP[iPressed] = e.getKeyCode();
            if(e.getKeyChar() != KeyEvent.CHAR_UNDEFINED & keyCodeP[iPressed]!=8 && keyCodeP[iReleased]!=10 && keyCodeP[iReleased]!=e.VK_DEAD_TILDE){
                keyPressed[iPressed] = "" + e.getKeyChar();
            }else if(keyCodeP[iReleased]!=e.VK_DEAD_TILDE){
                keyPressed[iPressed] = getStringKey(keyCodeP[iPressed]);
            }else if(keyCodeP[iReleased]==e.VK_DEAD_TILDE){
                keyPressed[iPressed] = getStringKey(0);
            }
            s += "KP||"+keyPressed[iPressed]+"||"+keyCodeP[iPressed]+"||"+
                    timePressed[iPressed]+"*+*\n";
            iPressed++;
        } 
   }
     
    public void keyReleased(KeyEvent e) {
        if(e.getSource()==txtKey){
            txtCode.setText(""+e.getKeyCode());
        }else{
            timeReleased[iReleased] = e.getWhen();
            keyCodeR[iReleased] = e.getKeyCode();
            if(e.getKeyChar()!= KeyEvent.CHAR_UNDEFINED && keyCodeR[iReleased]!=8 && keyCodeR[iReleased]!=10){
                keyReleased[iReleased] = "" + e.getKeyChar();                
            }else{
                keyReleased[iReleased] = getStringKey(keyCodeR[iReleased]);
            }
            //System.out.println("Key Released: " + keyReleased[iReleased]+" Time: " + timeReleased[iReleased]);
            s += "KR||"+keyReleased[iReleased]+"||"+keyCodeR[iReleased]+"||"+timeReleased[iReleased]+"*+*\n";
            iReleased++;
        }
    }
    
    //Eventos ActionListener
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bLogIn){
            /*s = "KP || TP || KR || TR||n\n";
            for(int j=0;j<=iPressed;j++){
                s +=""+keyPressed[j]+" || "+timePressed[j]+" || "+keyCodeP[j]+" || "+keyReleased[j]+" || "+timeReleased[j]+ " || "+
                        keyCodeR[j]+"\n"; 
            }*/        
        }else if(e.getSource()==bTest1){
            /*s = "KP || TP || KR || TR||n\n";
            for(int j=0;j<=iPressed;j++){
                s +=""+keyPressed[j]+" || "+timePressed[j]+" || "+keyReleased[j]+" || "+timeReleased[j]+"\n"; 
            }*/
        }
        //Escribimos en un fichero de texto los datos obtenidos
        //System.out.println(s);
        MyText stx = new MyText();
        stx.escribeFichero(s);
    }
    
    public String getStringKey(int keyCode){
        //This is just for Mac OS X (Virtual Key Codes change depending on the Platform)
        String myStringKey="";
        switch (keyCode){
            case 0:
                myStringKey = "TILDE";
                break;
            case 8:
                myStringKey = "BS";
                break;
            case 10:
                myStringKey = "Enter";
                break;
            case 16:
                myStringKey = "Shift";
                break;
            case 17:
                myStringKey = "Ctrl";
                break;
            case 18:
                myStringKey = "ALT";
                break;
            case  20:
                myStringKey = "CapsLock";
                break;
            case 27:
                myStringKey = "Esc";
                break;
            /*    
            case 32:
                myStringKey = "WhiteSpace";
                break;
            */
            case 37:
                myStringKey = "LeftArrow";
                break; 
            case 38:
                myStringKey = "UpArrow";
                break;
            case 39:
                myStringKey = "RightArrow";
                break;
            case 40:
                myStringKey = "DownArrow";
                break;
            case 157:
                myStringKey = "CMD";
                break;
                
            default:
                myStringKey = " ";
                break;
        }
        return(myStringKey);
   }
}

