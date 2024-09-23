/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.CRUD;
import modelo.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author ezequ
 */
public class OperacionesEstudianteLista extends CRUD {

    ArrayList<Estudiante> objListaEstudiante;
    Estudiante objEstudiante;
    
    public OperacionesEstudianteLista() {
        objListaEstudiante = new ArrayList();
    }

    @Override
    public void create() {
        objListaEstudiante.add(objEstudiante);
    }
    
//    @Override
//    public void create() {
//    }


    @Override
    public ArrayList read() {
        return this.objListaEstudiante;
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Estudiante getObjEstudiante() {
        return objEstudiante;
    }

    public void setObjEstudiante(Estudiante objEstudiante) {
        this.objEstudiante = objEstudiante;
    }

    
    
}
