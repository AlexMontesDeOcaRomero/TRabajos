/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_final;

/**
 *
 * @author Alex Montes
 */
public class EVA2_14_FINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class EstudiantePosgrado extends Persona{
        }
        final class Estudiante extends Persona{
            private String numeroControl;
            public Estudiante(){
            }
            public Estudiante (String numeroControl){
                this.numeroControl=numeroControl;
            }
            public Estudiante (String numeroControl, String Nombre){
                super(Nombre);
                this.numeroControl=numeroControl;
            }
          }   
    }
    
}
