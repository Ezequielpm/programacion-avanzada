/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java3g;

import java.util.ArrayList;

/**
 *
 * @author ezequ
 */
public class OperacionesProfesorLista extends CRUD{

    Profesor objProfesor;
    
    ArrayList<Profesor> objListaProfesor;

    public OperacionesProfesorLista() {
        objListaProfesor = new ArrayList();
    }

    @Override
    public void create() {
        objListaProfesor.add(objProfesor);
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Profesor getObjProfesor() {
        return objProfesor;
    }

    public void setObjProfesor(Profesor objProfesor) {
        this.objProfesor = objProfesor;
    }
    
    
}
