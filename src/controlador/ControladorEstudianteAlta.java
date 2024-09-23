/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Estudiante;
import vista.EstudianteAlta;
import vista.MenuGeneralEstudiante;

/**
 *
 * @author ezequ
 */
public class ControladorEstudianteAlta implements ActionListener {
    OperacionesEstudianteLista objOperacionesEstudianteLista;
    EstudianteAlta objEstudianteAlta;
    Validador objValidador;
    //vista del menu general
    MenuGeneralEstudiante objMenuGeneralEstudiante;
    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta) {
        this.objEstudianteAlta = objEstudianteAlta;
        objEstudianteAlta.jButton1.addActionListener(this);
        objEstudianteAlta.botonAltaEstudianteRegresar.addActionListener(this);
        objValidador = new Validador();
        objOperacionesEstudianteLista = new OperacionesEstudianteLista();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objEstudianteAlta.jButton1) {
            System.out.println("Escuchador del boton");
            if (!this.objValidador.validaCajaTextoEntero(objEstudianteAlta.getjTextField1())) {
                return;
            }
            else if(!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField2())){
                return;
            }
            else if(!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField3())){
                return;
            }
            else if(!this.objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField4())){
                
            }
            else if(!this.objValidador.validaCajaTextoEnteroEdad(objEstudianteAlta.getjTextField5())){
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
//        this.objOpEstudianteLista.setObjEstudiante(objEstudiante);
//        this.objOpEstudianteLista.create();
//        
//        limpiar();

        //Opc
        
        Estudiante estudiante = new Estudiante();
        estudiante.setMatricula(Integer.parseInt(objEstudianteAlta.getjTextField1().getText()));
        estudiante.setNombre(objEstudianteAlta.getjTextField2().getText());
        estudiante.setApPaterno(objEstudianteAlta.getjTextField3().getText());
        estudiante.setApMaterno(objEstudianteAlta.getjTextField4().getText());
        estudiante.setEdad(Integer.parseInt(objEstudianteAlta.getjTextField5().getText()));
        objOperacionesEstudianteLista.setObjEstudiante(estudiante);
        objOperacionesEstudianteLista.create();
        return;
        }
        if(e.getSource()==objEstudianteAlta.botonAltaEstudianteRegresar){
            System.out.println("Escuchador del boton regresar");
            this.objEstudianteAlta.setVisible(false);
            this.objMenuGeneralEstudiante.setVisible(true);
            return;
        }
    }

    public MenuGeneralEstudiante getObjMenuGeneralEstudiante() {
        return objMenuGeneralEstudiante;
    }

    public void setObjMenuGeneralEstudiante(MenuGeneralEstudiante objMenuGeneralEstudiante) {
        this.objMenuGeneralEstudiante = objMenuGeneralEstudiante;
    }

    public OperacionesEstudianteLista getObjOperacionesEstudianteLista() {
        return objOperacionesEstudianteLista;
    }

    public void setObjOperacionesEstudianteLista(OperacionesEstudianteLista objOperacionesEstudianteLista) {
        this.objOperacionesEstudianteLista = objOperacionesEstudianteLista;
    }
    
    
    

}
