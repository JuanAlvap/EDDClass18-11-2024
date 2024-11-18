/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import multilistas.Multilista;
/**
 *
 * @author alvarezjp
 */
public class Main {

    public static void main(String[] args) {
        Multilista multilista = new Multilista();

        multilista.agregarMedico("Allison");
        multilista.agregarMedico("Adriana");
        multilista.agregarMedico("Maria");
        
        multilista.registrarPaciente("Allison", "Samuel");
        multilista.registrarPaciente("Allison", "Santiago");
        multilista.registrarPaciente("Adriana", "Allan");
        multilista.registrarPaciente("Adriana", "Juan Pablo");
        multilista.registrarPaciente("Maria", "Miguel");
        
        multilista.mostrarMultilista();
    }
}
