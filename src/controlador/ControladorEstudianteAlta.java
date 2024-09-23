/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Estudiante;
import vista.EstudianteAlta;

/**
 *
 * @author ezequ
 */
public class ControladorEstudianteAlta implements ActionListener {
    EstudianteAlta objEstudianteAlta;
    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta){
        this.objEstudianteAlta = objEstudianteAlta;
        objEstudianteAlta.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objEstudianteAlta.jButton1){
            System.out.println("Escuchador del boton");
            
//            this.validaCamposTexto2();
//        /* ^ aqui hay un error, se corrige en la
//        rama arreglo-bugs*/
//        objEstudiante = new Estudiante(); // Aqui se soluciona el problema
//
//        System.out.println("Hola" + this.jTextField1.getText());
//        System.out.println("Tamaño jtextfield1: " + this.jTextField1.getText().length());
//        System.out.println("Metodo empty (tf1): " + this.jTextField1.getText().isEmpty());
//        System.out.println("Metodo blank (tf1): " + this.jTextField1.getText().isBlank());
//        objEstudiante.setMatricula(Integer.parseInt(this.jTextField1.getText()));
//        objEstudiante.setNombre(this.jTextField2.getText());
//        objEstudiante.setApPaterno(this.jTextField3.getText());
//        objEstudiante.setApMaterno(this.jTextField4.getText());
//        objEstudiante.setEdad(Integer.parseInt(this.jTextField5.getText()));
//        
//        //listaEstudiante.add(objEstudiante);
//        this.objOpEstudianteLista.setObjEstudiante(objEstudiante);
//        this.objOpEstudianteLista.create();
//        
//        limpiar();
            return;
        }
        if(e.getSource()==objEstudianteAlta.jButton2){
            return;
        }
    }
    
}
