import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EVA3_21_SERIALIZABLE {
    public static void main(String[] args) {
        //existen archivos binarios y de texto
        //especidfocar que clases van a ser serializables
        //debemos hacer que la clase implemente la interfaz serealizable
        persona per = new persona("Memo", "Sandoval");
        escribirObj(per);
    }
    //GUARDAR OBJETOS
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/Archivo/archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
        //LEER OBJETOS
    public static void LeerObj(){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/Archivo/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            leerObjeto.readObject();//siempre regresa un objeto de la clase object           
            persona per1 = (persona)leerObjeto.readObject();           
            System.out.println("Nombre" + persona.getNombre() + "" + persona.getApellido());
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_21_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
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
    public static String getNombre() {
        return nombre;
    }
    public static String getApellido() {
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