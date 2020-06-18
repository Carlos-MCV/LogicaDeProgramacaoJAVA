/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciomenornumero;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ExercícioMenorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int contador=0,menor=Integer.MAX_VALUE;
        while(contador!=10){
            contador++;
            System.out.println("Digite um número:");
            int numero=teclado.nextInt();
            
        if(numero<menor){
            menor=numero;
        }    
        }
        System.out.println("O menor valor é:"+menor);
    }
    
}
