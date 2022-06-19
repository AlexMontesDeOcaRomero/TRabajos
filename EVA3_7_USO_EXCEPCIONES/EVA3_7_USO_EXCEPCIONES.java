import java.util.InputMismatchException;
import java.util.Scanner;

public class Eva3_7_USO_EXCEPCIONES {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);        
         boolean datoErroneo = true;//el usuario siempre se equivoca
         //para do while se utiliza booleano por terminos de true false    
         do{
        try{
            System.out.println("Introduce tu edad en numero entero");
            int iedad = input.nextInt();
            System.out.println("Tu edad:" + iedad);
            datoErroneo = false;//el dato es falso el do while ya no sse va  a repetir.
        }catch(InputMismatchException e){
            System.out.println(input.next() + " no es un numero valido");
        }
         }while(datoErroneo);//el dato es erroneo se vulve a repetir
}
}