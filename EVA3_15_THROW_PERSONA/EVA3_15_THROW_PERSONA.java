import java.util.*;
public class EVA3_14_THROW_2 {
    public static void main (String [] args){
        Persona persona = new Persona();
        persona.setnNombre("Juan Perez");
        try {
            persona.setEdad(20);       
        } catch (Exception e) {
            ex.printStackTrace();
        }
        try {
            Persona persona2 = new Persona("Juan Perez", 50);  
        } catch (Exception e) {
            ex.printStackTrace();
        }
    }
}
class Persona {
private String nombre;
private int edad;
    public Persona () {
}
    public Persona (String nombre, int edad) throws Exception {
        public String setNombre();
            return nombre;
            setEdad(edad);
        }
        public String getNombre();{
            this.nombre = nombre;
        }
        public int setEdad(){
                return edad;
        }
        public void int getEdad(int edad){
            if ((edad >= 0) (edad <= 130))
                this.edad = edad;
            else {
                throw new Exception ("Rando de edad incorrecto"); 
            }
        }
    }
}