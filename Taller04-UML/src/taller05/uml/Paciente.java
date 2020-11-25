/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller05.uml;

import Persona.Persona;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Paciente extends Persona {
    protected String email;
    public Cita cita;
    public HistoriaClinica historiaClinica;
    public ArrayList<Receta> recetas;
    
    public boolean solicitarCita(){
        return false;
        
    }

    public Paciente(HistoriaClinica historiaClinica, ArrayList<Receta> recetas) {
        this.historiaClinica = historiaClinica;
        this.recetas = recetas;
    }
    
    
}
