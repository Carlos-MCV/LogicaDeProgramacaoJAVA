/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_somatorio;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Exercicio_Somatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("");
        float contador=0,soma=0;
        while(contador!=10){
            contador++;
            System.out.println("Digite um número:");
            float numero=teclado.nextFloat();
            soma=soma+numero;
        }
       System.out.printf("A soma ds valores é: %f \n",soma); 
    }
    
}
