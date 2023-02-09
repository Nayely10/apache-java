/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicar.tabla;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class MultiplicarTabla {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args, int multiplicacion) {
        // TODO code application logic here
        Scanner guardar= new Scanner(System.in);
        int numero;
        int miltiplicacion;
        System.out.println("ingrese un numero");
        numero=guardar.nextInt();
        for(int a=1; a<=10; a++)
        {
           multiplicacion =numero*a;
            System.out.println(numero+"*"+a+"="+multiplicacion);
        }
                
        
    }
    
}
