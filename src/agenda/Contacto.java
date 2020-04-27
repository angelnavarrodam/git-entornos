 * @author Usuario
 */
public class Contacto {
    private String nombre;
    private String apellidos;
    private String mail;
    private int numero;
    
   
    Contacto(String nombre,String apellidos,String mail,int numero){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.mail=mail;
        this.numero=numero;
    }
    
    Contacto(String mail){
        this.mail=mail;
    }
    Contacto(int numero){
        this.numero=numero;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
 }
    
    

 
     