import java.util.InputMismatchException;
import java.util.Scanner;
public class EVA3_9_CLASE_EXCEPTION {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);           
        //intentamos atrapar la excepcion     
        try{//aqui va el codigo que puede fallar
             System.out.println("Introduce tu edad en numero entero");
            int entero = input.nextInt();       
            System.out.println("Introduce tu edad en numero entero 2");
            int entero2 = input.nextInt();
            System.out.println("Division: " + (entero/entero2));
        }
        catch(Exception e){
            e.printStackTrace();
                    System.out.println("El valor capturado no es valido");
        }
    }   
}