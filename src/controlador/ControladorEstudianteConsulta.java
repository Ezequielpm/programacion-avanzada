/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import vista.EstudianteConsulta;

/**
 *
 * @author ezequ
 */
public class ControladorEstudianteConsulta implements ActionListener {
    EstudianteConsulta objEstudianteConsulta;
    ControladorEstudianteAlta objControladorEstudianteAlta;
    public ControladorEstudianteConsulta(EstudianteConsulta objEstudianteConsulta){
        this.objEstudianteConsulta = objEstudianteConsulta;
        this.objEstudianteConsulta.jButton1.addActionListener(this);
        this.objEstudianteConsulta.jButton2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objEstudianteConsulta.jButton1){
            System.out.println("Escuchador del boton consulta");
            DefaultTableModel objModel = (DefaultTableModel) this.objEstudianteConsulta.jTable1.getModel();
            Object[] datos = {"1","1","1","1","1"};
            objModel.addRow(datos);
            return;
        }
        if(e.getSource()==objEstudianteConsulta.jButton2){
            System.out.println("Escuchador del boton regresar a alta");
            this.objEstudianteConsulta.setVisible(false);
            this.objControladorEstudianteAlta.objEstudianteAlta.setVisible(true);
            return;
        }
    }

    public ControladorEstudianteAlta getObjControladorEstudianteAlta() {
        return objControladorEstudianteAlta;
    }

    public void setObjControladorEstudianteAlta(ControladorEstudianteAlta objControladorEstudianteAlta) {
        this.objControladorEstudianteAlta = objControladorEstudianteAlta;
    }
    
    
    
}
