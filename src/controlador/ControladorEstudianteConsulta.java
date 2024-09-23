/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.EstudianteConsulta;

/**
 *
 * @author ezequ
 */
public class ControladorEstudianteConsulta implements ActionListener {
    EstudianteConsulta objEstudianteConsulta;
    public ControladorEstudianteConsulta(EstudianteConsulta objEstudianteConsulta){
        this.objEstudianteConsulta = objEstudianteConsulta;
        this.objEstudianteConsulta.jButton1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objEstudianteConsulta.jButton1){
            System.out.println("Escuchador del boton consulta");
        }
    }
    
}
