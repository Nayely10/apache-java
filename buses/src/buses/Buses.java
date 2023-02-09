/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buses;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Buses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un programa que le permita al usuarioingresar los datos
        //de 2 buses asi: 
        //1.placa
        //2.numero de pasajeros transportados y
        //3.el valor del pasaje,y el computados le muestre :
        //la placa del bus que mas dinero recogio
        Scanner guardar= new Scanner(System.in);
        
        String placa1 ;
        String placa2 ;
        int pasajeros1;
        int pasajeros2;
        int valor_de_pasaje;
        double bus1;
        double bus2;
        
        System.out.println("Ingrese placa del bus # 1");
         placa1=guardar.nextLine();
          System.out.println("Ingre placa del bus # 2");
         placa2=guardar.nextLine();
        System.out.println("Ingrese numero de pasajeros de bus # 1");
         pasajeros1=guardar.nextInt();
       
        System.out.println("Ingrese numero de pasajeros de bus # 2");
         pasajeros2=guardar.nextInt();
          
         
        System.out.println("Ingrese el valor del pasaje");
        valor_de_pasaje=guardar.nextInt();
        
        bus1=( pasajeros1*valor_de_pasaje);
        bus2=( pasajeros2*valor_de_pasaje);
        
        if(bus1>bus2){
            System.out.println("EL BUS QUE MAS DINERO RECOGIO ES:" + placa1 );
        }
        else if (bus1<bus2){
         System.out.println("EL BUS QUE MAS DINERO RECOGIO ES:" + placa2);
    }
    }
    
}
