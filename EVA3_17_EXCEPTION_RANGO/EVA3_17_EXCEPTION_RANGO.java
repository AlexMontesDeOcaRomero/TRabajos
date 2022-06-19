import java.util.*;
public class EVA3_17_EXCEPTION_RANGO {
    public static void main(String [] args){
        try {
            Persona persona = new Persona ("Juan Perez", 50)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    class ExcepcionDeRango extends Exception{
        public ExcepcionDeRango(){
        }
        public ExcepcionDeRango(String message{
            super(message);
        }
        
}
class Persona {
    private String nombre;
    private int edad;
        public Persona (String nombre, int edad) throws ExcepcionDeRango {
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
                    throw new ExcepcionDeRango() ("Rango de edad incorrecto"); 
        }
    }
}