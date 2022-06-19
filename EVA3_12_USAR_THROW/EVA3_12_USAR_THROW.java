import java.util.*;
public class EVA3_12_USAR_THROW {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        try {
            System.out.println("Introduce tu edad (numero entero positivo): ");
            int valor = input.nextIn();
            if (valor < 0)
            throw new Exception("El valor = " + valor + "no es una edad valida");       
        } catch (Exception e) {
        e.printStackTrace();
        }
        System.out.println("La edad capturada es: " +  valor);
    }
}