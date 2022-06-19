import java.util.*;
public class EVA3_13_MEJORAR_CAPTURA_EDAD {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        do {
            try {
                System.out.println("Introduce tu edad (numero entero positivo): ");
                int iedad = input.nextIn();
                if (iedad < 0)
                throw new Exception("El valor = " + iedad + "no es una edad valida");       
                datoErroneo = false;
                System.out.println("Tu edad: " + iedad);
            }catch (Exception e) {
                System.out.println (input.next() + "no es un numero valido");
            }catch (InputMismatchException exception) {
                System.out.println("Edad no valida");
        }
            System.out.println("La edad capturada es: " +  iedad);
        } while (datoErroneo);
    }
}