import java.util.InputMismatchException;
import java.util.Scanner;

public class Eva3_8_MULTIPLES_CATCH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         
        //intentamos atrapar la excepcion     
        try{//aqui va el codigo que puede fallar
             System.out.println("Introduce tu edad en numero entero");
            int entero = input.nextInt(); 
            System.out.println("Introduce tu edad en numero entero 2");
            int entero2 = input.nextInt();
            System.out.println("Division: " + (entero/entero2));
        }catch(ArithmeticException e){//despues de la excepcion debemos de otorgarle una variable
            //Catch nos da una accion que puede resolver la excepcion que ingreso el usuario
           // e.printStackTrace();//imprime la excepcion sin que el programa falle
            System.out.println("Se produjo un error");
        }
        catch(InputMismatchException i){
                    System.out.println("El valor capturado no es valido");
                }
    }
}