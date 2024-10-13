/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;
//proxima semana, examen el miercoles
/**
 *
 * @author ezequ
 */
public class ControladorEstudianteAlta implements ActionListener {

    EstudianteAlta objEstudianteAlta;
    Validador objValidador;
    OperacionesEstudianteLista objOperacionesEstudianteLista;
    EstudianteConsulta objEstudianteConsulta;
    
    //lo que tiene el código de Kevin
    ArrayList<Estudiante> objListaEstudiante;
    Estudiante objEstudiante;

    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta) {
        this.objEstudianteAlta = objEstudianteAlta;
        this.objEstudianteAlta.jButton1.addActionListener(this);
        objValidador = new Validador();
        objOperacionesEstudianteLista = new OperacionesEstudianteLista();
        this.objEstudianteAlta.jButton2.addActionListener(this);
        objEstudianteConsulta = new EstudianteConsulta();
        this.objEstudianteConsulta.setVisible(false);
        this.objEstudianteConsulta.getObjControladorEstudianteConsulta().setObjControladorEstudianteAlta(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objEstudianteAlta.jButton1) {
            System.out.println("Escuchador del boton");
            if (!this.objValidador.validaCajaTextoEntero(objEstudianteAlta.getjTextField1())) {
                return;
            } else if (!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField2())) {
                return;
            } else if (!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField3())) {
                return;
            } else if (!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField4())) {

            } else if (!this.objValidador.validaCajaTextoEnteroEdad(objEstudianteAlta.getjTextField5())) {
                return;
            }
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
//        this.objOpEstudianteLista.create();
//        
//        limpiar();

            //Opc
            Estudiante objEstudiante = new Estudiante();
            objEstudiante.setMatricula(Integer.parseInt(objEstudianteAlta.getjTextField1().getText()));
            objEstudiante.setNombre(objEstudianteAlta.getjTextField2().getText());
            objEstudiante.setApPaterno(objEstudianteAlta.getjTextField3().getText());
            objEstudiante.setApMaterno(objEstudianteAlta.getjTextField4().getText());
            objEstudiante.setEdad(Integer.parseInt(objEstudianteAlta.getjTextField5().getText()));
            this.objOperacionesEstudianteLista.setObjEstudiante(objEstudiante);

//        objOperacionesEstudianteLista.setObjEstudiante(estudiante);
            this.objOperacionesEstudianteLista.create();
            return;
        }
        if (e.getSource() == objEstudianteAlta.jButton2) {
            System.out.println("Escuchador del boton consultar");
            this.objEstudianteAlta.setVisible(false);
            this.objEstudianteConsulta.setVisible(true);

            return;
            
            //mas codigo de kevin
//            EstudianteConsulta objEstudianteConsulta = new EstudianteConsulta();
//             VistaConsultaAlumno objConsulta = new VistaConsultaAlumno(this.objListaAlumno);
//            objConsulta.setSize(500, 500);
//            objConsulta.setVisible(true);
        }
    }

}
