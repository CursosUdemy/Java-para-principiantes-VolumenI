/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Franklin Rony Cortez
 * Esta clase contiene los componenetes para la interfaz grafica,debe importarse el
 * paquete Swing y extender de la clase JFrame.
 */
public class MiprimerVentana extends JFrame {


    /**
     * Declarar los componentes de la ventana
     */
    private JLabel lblNombre,lblApellidos,lblEdad,lblCorreoElectronico;
    private JTextField txtNombre,txtApellidos,txtEdad,txtCorreoElectronico;
    
    public MiprimerVentana() {
        //titulo de la ventana
        this.setTitle("Registro de usuario");
        //accion por defecto al dar clic en la x
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //dimensiones
        this.setSize(300, 380);
        //centrar la ventana en pantalla
        this.setLocationRelativeTo(null);

       //se puede redimencionar?
       this.setResizable(false);
       this.setLayout(new FlowLayout());
       //componentes de la ventana etiquetas,botones,etc
       //etiquetas
       lblNombre=new JLabel("Ingrese su nombre");
       lblNombre.setHorizontalAlignment(JLabel.LEFT);
       lblApellidos=new JLabel("Ingrese sus apellidos:");
       lblEdad=new JLabel("Ingrese su edad");
       lblCorreoElectronico=new JLabel("Ingrese su Correo");
       //campos de texto
       txtNombre=new JTextField(20);
       txtApellidos=new JTextField(20);
       txtEdad=new JTextField(20);
       txtCorreoElectronico=new JTextField(20);

       
       this.add(lblNombre);
       this.add(txtNombre);
       this.add(lblApellidos);
       this.add(txtApellidos);
       this.add(lblCorreoElectronico);
       this.add(txtCorreoElectronico);
       this.add(lblEdad);
       this.add(txtEdad);
 
       //que sea visible
       this.setVisible(true);
    }
}
