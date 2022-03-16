/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clase_persona;

import java.util.Scanner;

/**
 *
 * @author Alex Montes
 */
public class EVA1_2_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //implementacion
      System.out.println("Hola mundo!!");
      Persona estudiante = new Persona();
      estudiante.id = "21550348";
      estudiante.nombre = "Alexandro Angel Montes De Oca Romero";
      estudiante.edad = 18;        
      EVA1_2_CLASE_PERSONA objCLASE_PER = new EVA1_2_CLASE_PERSONA();
    }
    
}

class Persona{
  String id;
  String nombre;
  int edad;  
}