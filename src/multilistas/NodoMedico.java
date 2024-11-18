/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilistas;

/**
 *
 * @author alvarezjp
 */
public class NodoMedico {
    
    private String nombreMedico;
    private NodoMedico ant;
    private NodoMedico sig;
    private NodoPaciente abajo;

    public NodoMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
        this.ant = null;
        this.sig = null;
        this.abajo = null;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public NodoMedico getAnt() {
        return ant;
    }

    public void setAnt(NodoMedico ant) {
        this.ant = ant;
    }

    public NodoMedico getSig() {
        return sig;
    }

    public void setSig(NodoMedico sig) {
        this.sig = sig;
    }

    public NodoPaciente getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPaciente abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return "NombreMedico = " + nombreMedico;
    }
    
    
    
}
