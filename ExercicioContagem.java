/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocontagem;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ExercicioContagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero=teclado.nextInt();
        int contador=0;
        if (numero==0){
            System.out.println(0);
        }
        while(contador!=numero){
            contador++;
            System.out.println(contador);
        }
    }
    
}
