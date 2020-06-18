/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicionumeromaior;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ExercicioNumeroMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int contador=0;
        int maior=0;
        while(contador!=10){
            contador++;
            System.out.println("Digite um número:");
            int valor=teclado.nextInt();
        if(contador>0){
            System.out.println("Digite outro número");
        }    
        if(valor> maior){
                maior=valor;
        }
    }
        System.out.println("O maior valor digitado foi: "+maior);
}
}
