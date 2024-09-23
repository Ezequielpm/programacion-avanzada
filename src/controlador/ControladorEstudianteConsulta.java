/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import vista.EstudianteConsulta;
import modelo.Estudiante;
import vista.MenuGeneralEstudiante;
/**
 *
 * @author ezequ
 */
public class ControladorEstudianteConsulta implements ActionListener{
    EstudianteConsulta ObjEstudianteConsulta;
    OperacionesEstudianteLista objOperacionesEstudianteLista;
    DefaultTableModel objDefaultTableModel;
    MenuGeneralEstudiante objMenuGeneralEstudiante;

    public ControladorEstudianteConsulta(EstudianteConsulta objEstudianteConsulta){
        this.ObjEstudianteConsulta = objEstudianteConsulta;
        this.objDefaultTableModel = (DefaultTableModel)objEstudianteConsulta.jTable1.getModel();
        this.ObjEstudianteConsulta.botonConsultar.addActionListener(this);
        this.ObjEstudianteConsulta.botonEstudianteConsultaRegresar.addActionListener(this);
    }
    
    public void llenarTabla(){
        ArrayList<Estudiante> listaEstudiantes = this.objMenuGeneralEstudiante.getObjControladorMenuGeneralEstudiante().objEstudianteAlta.getObjControladorEstudianteAlta().getObjOperacionesEstudianteLista().read();//objOperacionesEstudianteLista.read();
        Object[] arregloDatosEstudiante;
        for(Estudiante estudiante:listaEstudiantes){
            arregloDatosEstudiante = new Object[5];
            arregloDatosEstudiante[0] = estudiante.getMatricula();
            arregloDatosEstudiante[1] = estudiante.getNombre();
            arregloDatosEstudiante[2] = estudiante.getApPaterno();
            arregloDatosEstudiante[3] = estudiante.getApMaterno();
            arregloDatosEstudiante[4] = estudiante.getEdad();
            this.objDefaultTableModel.addRow(arregloDatosEstudiante);
        }
    }
    public void vaciarTabla(){
       for(int i=0;i<this.objDefaultTableModel.getRowCount();i++){
            this.objDefaultTableModel.removeRow(i);
        }
    }
    //cargar los datos a la tabla
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.ObjEstudianteConsulta.botonConsultar){
            if(this.objDefaultTableModel.getRowCount()>0)
                vaciarTabla(); 
           llenarTabla();
//           this.objDefaultTableModel.removeRow(0);
           return;
        }
        if(e.getSource()==this.ObjEstudianteConsulta.botonEstudianteConsultaRegresar){
            this.ObjEstudianteConsulta.setVisible(false);
            this.objMenuGeneralEstudiante.setVisible(true);
        }
    }

    public MenuGeneralEstudiante getObjMenuGeneralEstudiante() {
        return objMenuGeneralEstudiante;
    }

    public void setObjMenuGeneralEstudiante(MenuGeneralEstudiante objMenuGeneralEstudiante) {
        this.objMenuGeneralEstudiante = objMenuGeneralEstudiante;
    }
    
    
    
}
