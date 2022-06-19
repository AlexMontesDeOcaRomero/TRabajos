import java.util.*;
public class EVA3_10_FINALLY {
    public static void main (String [] args){
        try {
            Scanner input = new Scanner (Sytem.in);
            System.out.println("Introduce un dato entero: ");
            int valor = input.nextIn();
            System.out.println("El valor es " + valor);          
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            System.out.println("Esta linea siempre debe ejecutarse");
        }
        System.out.println("Fin del Programa");
    }
}