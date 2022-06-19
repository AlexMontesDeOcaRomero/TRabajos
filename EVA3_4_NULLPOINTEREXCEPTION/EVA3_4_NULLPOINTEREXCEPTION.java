public class Eva3_4_NULLPOINTEREXCEPTION {

    public static void main(String[] args) {
        Persona persona = null;       
        imprimir(persona);  
      /*Las excepciones son como el fuego, se van a propagar*/
      //si no se sabe controlar excepcinoes, no las controles 
    }
    public static void imprimir (Persona perso){
        masComplicado(perso);
    }
    public static void masComplicado(Persona perso){
        System.out.println("Nombre" + perso.getNombre());
    }
     public class Persona{
            String Nombre;
            public Persona() {
            }
            public Persona(String Nombre) {
                this.Nombre = Nombre;
            }
            public String getNombre() {
                return Nombre;
            }
            public void setNombre(String Nombre) {
                this.Nombre = Nombre;
            }               
        }  
}