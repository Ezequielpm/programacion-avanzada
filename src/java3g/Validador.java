/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3g;

import javax.swing.JOptionPane;

/**
 *
 * @author ezequ
 */
public class Validador {

    public Validador() {

    }
    public void validaCajaTextoCadena(javax.swing.JTextField cajaTexto){
        if(cajaTexto.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Urgente Campo requerido");
        }
    }
    
    public void validaCadena(String cadena){
        if(cadena.isBlank()){
            JOptionPane.showMessageDialog(null, "Campo requerido de la cadena");
        }
    }
    
}
