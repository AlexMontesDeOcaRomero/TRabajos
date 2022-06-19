import java.util.*;
public class Eva3_3_division_0 {
    /* excepcion aritmetica , es una excepcion matematica*/   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int entero = input.nextInt(); 
        System.out.println("Introduce tu edad en numero entero 2");
        int entero2 = input.nextInt();
        System.out.println("Division: " + (entero/entero2));
        //excepciones sirven para evitar problemas en el prgrama 
    }  
}