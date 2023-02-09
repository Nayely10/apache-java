/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acomulador;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Acomulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un ciclo que al ingresar el nombre, la eadad y el sexo(F-M) de 5 personas 
        //muestre cuantas mujeres y cuantos hombres hay
        Scanner guardar = new Scanner("System.in");
        
        int cantfemenino =0;
        int cantmasculino = 0;
        String nombre , sexo;
        int edad;
        
            for (int cant=1; cant<=5; cant++){
                System.out.println("ingrese su nombre");
                nombre=guardar.next();
                System.out.println("ingrese su sexo(f o m)");
                sexo=guardar.next();
                System.out.println("ingrese su edad");
                edad=guardar.nextInt();
                if(){
                    
                }
            }
        
    }
    
}
