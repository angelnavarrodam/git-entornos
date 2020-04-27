package agenda;

import java.util.Objects;

/**
 *
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
}