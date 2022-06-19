import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EVA3_18_ARCHIVOS {  
    public static void main(String[] args) {
        try {
            //RUTA:
            //FileInputStream
            FileInputStream archivo = new FileInputStream("C:\\Txt/Doc texto.txt");
            /*System.out.println("Leer: " + archivo.read());
            System.out.println("Leer: " + archivo.read());*/
            //Leer todo el archivo:
            int caracter = archivo.read();
            while(caracter != -1){
                System.out.print((char)caracter);
                caracter = archivo.read();
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}