/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_media_melhor_e_pior.número;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Exercicio_media_melhor_e_piorNúmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        float contador=0,soma=0,media,melhor=0,pior=Integer.MAX_VALUE;
       
        while(contador<10){
            contador++;
            
            System.out.println("Digite um valor:");
            float numero=teclado.nextFloat();
            
            soma=soma+numero;
            
            if(melhor<numero){
                melhor=numero;
            }
            if(pior>numero){
                pior=numero;
            }
        }
        media=soma/10;
        System.out.printf("Média dos valores é: %.0f ; O maior valor foi: %.0f e o pior tempo foi: %.0f \n",media,melhor,pior);
    }
    
}
