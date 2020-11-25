/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.ArrayList;
import taller05.uml.Cita;
import taller05.uml.Receta;


public class Doctor extends Persona {
    protected int regDoctor;
    protected String  especialidad;
    public ArrayList<Cita> citas;
    public ArrayList<Receta> recetasRegistradas;
    public AreaMedica area;
    public Secretaria secretaria;
    
public void recetar(){}   
public void agregarPlanNut(){}
public void imprimirReceta(){}
public void registaSecretaria(){}
    
    
}
