import java.util.*;

public class EVA3_5_TRY_CATCH {
    public static void main (String [] args){
Scanner input = new Scanner (System.in);
System.out.println("Introduce tu edad (numero entero): ");
int iedad=0;
try { //Codigo que puede fallar
    int iedad = input.nextInt();
} catch (Exception e) {
    //Codigo que ejecutamos si ocurre una falla
    e.printStackTrace();
    //System.out.println("Uops!! Fallo la captura!!");
 //Excepcion a capturar
  System.out.println("Tu edad: " + iedad);
  }
 }
}