import java.util.*;
public class EVA3_11_THROW {
    public static void main (String [] args){
        throw new Exception("Mi excepcion!! ");
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}