/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilistas;

/**
 *
 * @author alvarezjp
 */
public class NodoPaciente {
    
    private String nombrePaciente;
    private NodoPaciente abajo;

    public NodoPaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
        this.abajo = null;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public NodoPaciente getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPaciente abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return "NombrePaciente = " + nombrePaciente;
    }
    

    
}
