/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller05.uml;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Receta {
    protected Date fecha;
    public ArrayList<PlanNutricional> planesNutricionales;
    public ArrayList<Medicamento> medicamentos;

    public Receta(Date fecha, ArrayList<PlanNutricional> planesNutricionales, ArrayList<Medicamento> medicamentos) {
        this.fecha = fecha;
        this.planesNutricionales = planesNutricionales;
        this.medicamentos = medicamentos;
    }
    
}
