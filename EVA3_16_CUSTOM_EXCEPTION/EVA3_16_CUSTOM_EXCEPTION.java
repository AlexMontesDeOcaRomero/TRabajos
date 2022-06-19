import java.util.*;
public class EVA3_14_THROW_2 {
    public static void main (String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Captura la Edad: ");
        int edad = input.nextln();
        int valor = 0;
        try {
           valor = input.nextln(); 
        } catch (InputMismatchException e) {
            throw new ExcepcionDeCaptura("Introdujiste una cadena de texto, no es un numero valido.")
        }
    }
}
//EXCEPTION PERSONALIZADA 
//HEREDAR DE EXCEPTION
class ExcepcionDeCaptura extends Exception{

    public ExcepcionDeCaptura() {
    }

    public ExcepcionDeCaptura(String message) {
        super(message);
    }
}