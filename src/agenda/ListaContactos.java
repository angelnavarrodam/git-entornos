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

    public boolean buscar(int numero){
        for(Contacto c:this.agenda){
            if(c.getNumero()==numero){
                System.out.println(c);
                return true;
            }
        }
       
        System.out.println("El numero introducido no existe ");
        return false;
    }



    public void menu(){
    System.out.println("\n\n--------MENU-------\n"
            + "Seleccione su opción:\n"
            + "1.-Añadir contacto\n"
            + "2.-Buscar según mail\n"
            + "3.-Buscar según numero\n"
            + "4.-Salir");
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    Scanner scanN=new Scanner(System.in);
    }

switch(n){
case 1:
    System.out.println("\nIntroduzca el nombre del usuario que desea introducir:");
    String nombre=scanN.nextLine();
    System.out.println("\nIntroduzca los apellidos del usuario que desea introducir:");
    String apellidos=scanN.nextLine();
    System.out.println("\nIntroduzca el mail del usuario que desea introducir:");
    String mail=scanN.nextLine();
    System.out.println("\nIntroduzca el numero del usuario que desea introducir:");
    int numero=scanN.nextInt();
    this.nuevoContacto(nombre, apellidos, mail, numero);
    this.menu();
    break;
case 2:
    System.out.println("\nIntroduzca el mail del usuario que desea buscar:");
    String buscarm=scanN.nextLine();
    this.buscar(buscarm);
    this.menu();
    break;
