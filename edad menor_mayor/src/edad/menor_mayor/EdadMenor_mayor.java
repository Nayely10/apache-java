/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad.menor_mayor;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class EdadMenor_mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //2.Elabore un algoritmo que solicite la edad de 5 personas y muestre 
        //cuantos son mayores y menor de edad
        Scanner guardar= new Scanner(System.in);
        int edad;
        int cantmayores=0;
        int cantmenores=0;
        
        for(int i=1;i<=5;i=i+1){
            System.out.println("Ingrese el valor de la edad ");
        edad =guardar.nextInt();
        
        if(edad<=17){
            cantmenores=cantmenores+1;
        }else
        {
            cantmayores=cantmayores+1;
        }
      }  
        System.out.println("la cantidad de mayores es: "+cantmayores);
        
        System.out.println("la cantidad de menores es: "+cantmenores);
    }
    
}
