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
}
