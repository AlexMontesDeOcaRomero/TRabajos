import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class EVA3_19_BUFFER {
    public static void main (String [] args){
        //Definir la ruta
        Paths ruta = Paths.get("c:\Desktop\19.txt");
        //Abrimos el archivo
        InputStream abrirArch;
        //Leemos el archivo
        InputStreamReader leerArch;
        //Convertimos bytes a caracteres
        BufferedReader leerTexto;
        try {
            abrirArch = Files.newInputStream(ruta);
            leerArch = new InputStreamReader(abrirArch); 
            leerTexto = new BufferedReader(leerArch)
            String linea leerTexto.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = leerTexto.readLine();
            }
        } catch (Exception e) {
            Logger.getLogger(EVA3_19_BUFFER.class.getName().log(Level.SEVERE, null, ex));
        }
    }
}