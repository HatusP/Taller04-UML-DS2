/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller05.uml;

import Persona.Doctor;
import java.util.Date;
import taller05.uml.Pagos.Pago;

/**
 *
 * @author User
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    public Paciente paciente;
    public Doctor doctor;
    
    
    public void realizarPago(Pago pago){
        
    }
    
}
