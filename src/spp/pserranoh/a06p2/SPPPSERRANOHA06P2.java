/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.a06p2;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n;
        n = solicitarNumero();
        calcularFactorial(n);
    }
    
    public static int solicitarNumero(){
        int n;
        System.out.println("Introduzca el numero que quiera calcular su factorial:");
        Scanner entradaNumero = new Scanner(System.in);
        n = entradaNumero.nextInt();
        if (n < 1 || n > 10){
            System.out.println("El numero esta fuera del rango");
            solicitarNumero();
        } else {
            
        }
        return n;
    }
    
    public static void calcularFactorial(int n){
        int factorial, contador;
        contador = 1;
        factorial = 1;
        do {
            contador++;
            factorial = factorial*(contador);
        } while (contador < (n));
        System.out.println("El factorial del numero ingresado es: " + factorial);
    }
    
}