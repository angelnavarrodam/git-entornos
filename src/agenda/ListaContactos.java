package agenda;

import java.util.ArrayList;
import java.util.Scanner;

 
public class ListaContactos {
    private ArrayList<Contacto> agenda;
    

    ListaContactos(){
        this.agenda=new ArrayList<>();
    }
    

    public void nuevoContacto(String nombre,String apellidos,String mail,int numero){
        Contacto c=new Contacto(nombre,apellidos,mail,numero); 
        agenda.add(c);                                         
    }

    public boolean buscar(String mail){
        Contacto aux=new Contacto(mail);
        if(this.agenda.contains(aux)){ 
            Contacto imp= this.agenda.get(this.agenda.indexOf(aux));
            System.out.println(imp); 
            return true;
        }else{
            System.out.println("El contacto introducido no existe");
            return false;
        }
        
    }
}
