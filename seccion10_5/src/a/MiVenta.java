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
/**
 *
 * @author udemy
 */
public class MiVenta extends JFrame{
private JLabel lblNombre,lblApellidos,lblEdad,lblCorreoElectronico;
private JTextField txtNombre,txtApellidos,txtEdad,txtCorreoElectronico;
private JButton btnEnviar, btnLimpiar;

    public MiVenta() {
        this.setTitle("Registro de usuario");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,380);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        
        lblNombre=new JLabel("Ingrese su nombre");
        lblApellidos=new JLabel("Ingrese sus apellidos");
        lblEdad=new JLabel("Ingrese su edad");
        lblCorreoElectronico=new JLabel("Ingrese su correo electronico");
        
        txtNombre=new JTextField(20);
        txtApellidos=new JTextField(20);
        txtEdad=new JTextField(20);
        txtCorreoElectronico=new JTextField(20);
        btnEnviar=new JButton("Enviar");
        btnLimpiar=new JButton("Limpiar");        
        
        this.add(lblNombre);
        this.add(txtNombre);
        this.add(lblApellidos);
        this.add(txtApellidos);
        this.add(lblCorreoElectronico);
        this.add(txtCorreoElectronico);
        this.add(lblEdad);
        this.add(txtEdad);
        this.add(btnEnviar);
        this.add(btnLimpiar);
        this.setVisible(true);

    }
    
    
    
}
