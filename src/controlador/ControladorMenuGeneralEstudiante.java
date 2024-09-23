/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;
import vista.MenuGeneralEstudiante;

/**
 *
 * @author ezequ
 */
public class ControladorMenuGeneralEstudiante implements ActionListener{
    //Esta clase se encarga de ocultar o mostrar ventanas
    MenuGeneralEstudiante objMenuGeneralEstudiante;
    //Agrego las vistas anidadas del menu general en el controlador aunque
    //también se podrían poner dentro de la clase de cada vista, para seguir
    //el patrón mvc, se hace aqui
    EstudianteAlta objEstudianteAlta;
    EstudianteConsulta objEstudianteConsulta;
    public ControladorMenuGeneralEstudiante(MenuGeneralEstudiante objMenuGeneralEstudiante,
            EstudianteAlta objEstudianteAlta, EstudianteConsulta objEstudianteConsulta){
        this.objMenuGeneralEstudiante = objMenuGeneralEstudiante;
        this.objMenuGeneralEstudiante.botonAltaEstudiante.addActionListener(this);
        this.objMenuGeneralEstudiante.botonConsultaEstudiante.addActionListener(this);
        this.objEstudianteAlta = objEstudianteAlta;
        this.objEstudianteConsulta = objEstudianteConsulta;
        this.objEstudianteAlta.setVisible(false);
        this.objEstudianteConsulta.setVisible(false);
        
        this.objEstudianteAlta.getObjControladorEstudianteAlta().setObjMenuGeneralEstudiante(this.objMenuGeneralEstudiante);
        this.objEstudianteConsulta.getObjControladorEstudianteConsulta().setObjMenuGeneralEstudiante(this.objMenuGeneralEstudiante);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objMenuGeneralEstudiante.botonAltaEstudiante){
            System.out.println("Escuchador del boton de alta");
            objMenuGeneralEstudiante.setVisible(false);
            objEstudianteAlta.setVisible(true);
        }
        if(e.getSource()==objMenuGeneralEstudiante.botonConsultaEstudiante){
            System.out.println("Escuchador del boton de consulta");
            objMenuGeneralEstudiante.setVisible(false);
            objEstudianteConsulta.setVisible(true);
        }
    }
}
