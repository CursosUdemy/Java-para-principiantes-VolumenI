/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import javax.swing.JFrame;

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
    public MiprimerVentana() {
        //titulo de la ventana
        this.setTitle("Mi primer ventana en Java Swing");
        //accion por defecto al dar clic en la x
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //dimensiones
        this.setSize(700, 480);
        //centrar la ventana en pantalla
        this.setLocationRelativeTo(null);
        //que sea visible
       this.setVisible(true);
       //se puede redimencionar?
       this.setResizable(true);
    }
}
