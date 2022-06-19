import java.util.*;
public class EVA3_14_THROW_2 {
    public static void main (String [] args){
        Persona persona = new Persona();
        persona.setnombre("Juan Perez"); 
        try {
            persona.setEdad(capturarEdad());     
        } catch (Exception e) {
            ex.printStackTrace();
        }
        try {
            Persona persona2 = new Persona("Juan Perez", capturaEdad());  
        } catch (Exception e) {
            ex.printStackTrace();
        }
    }
    public static int capturaEdad() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Captura la Edad: ");
        int valor = 0;
        try {
           valor = input.nextln(); 
        } catch (InputMismatchException e) {
            throw new Exception("Introdujiste una cadena de texto, no es un numero valido.")
        }
        return valor;
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
                throw new Exception ("Rango de edad incorrecto"); 
        }
    }
}