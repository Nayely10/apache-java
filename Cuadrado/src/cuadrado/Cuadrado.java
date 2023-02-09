/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;

/**
 *
 * @author Laboratorio
 */

public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ////crear un programa que muestre el cuadrado de los numeros del 1 al 10
        //mostrar uno por uno,van a sumarlos y mostrar el resultado.
        
        int cuadrado;
        int suma = 0;
        
        for (int numero=1;numero<=10;numero++){
            cuadrado=numero*numero;
            System.out.println("Los numeros del 1 al 10 al cuadrado son:"+cuadrado);
            suma=cuadrado+suma;
        }
        
        System.out.println("La suma del cuadrado de los numeros del 1 al 10 es:"+suma);
        
    }
    
}
