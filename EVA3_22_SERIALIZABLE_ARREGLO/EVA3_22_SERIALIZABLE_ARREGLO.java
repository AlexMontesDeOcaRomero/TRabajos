import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EVA3_22_SERIALIZABLE_ARREGLO {
public static void main(String[] args) {
        ArrayList<persona> miLista = new ArrayList();//llamados collections y hay multiples tipos de estructuras, a las llaves se les llama tipos de datos genericos
        miLista.add(new persona ("Juan","Perez"));
        escribirObj(miLista);
    }
public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/Archivo/archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_22_SERIALIZABLE_ARREGLO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_22_SERIALIZABLE_ARREGLO.class.getName()).log(Level.SEVERE, null, ex);
        } 
}
public static void LeerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/Archivo/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            leerObjeto.readObject();//siempre regresa un objeto de la clase object           
            ArrayList<persona> miLista = (ArrayList<persona>)leerObjeto.readObject();          
            leerObjeto.close();        
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
                ex.printStackTrace();
         } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
    }   
}
 class persona implements Serializable{
    private String nombre;
    private String apellido;
    public persona() {
    }
    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
  }
}