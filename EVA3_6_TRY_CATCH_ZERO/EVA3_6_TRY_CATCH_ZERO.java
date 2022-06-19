import java.util.*;
public class EVA3_6_TRY_CATCH_ZERO {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un numero entero 1: ");
        int entero = input.nextInt();
        System.out.println("Introduce un numero entero 2: ");
        int entero2 = input.nextInt();
        try {
            System.out.println("Division: " + (entero/entero2));           
        } catch (ArithmeticException e) {
            e.printStackTrace(); //Imprime la Excepcion sin que el programa se detenga
      }
      System.out.println("Fin del Programa ");
    }
}
