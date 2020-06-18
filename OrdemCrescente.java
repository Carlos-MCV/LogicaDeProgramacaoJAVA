/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemcrescente;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class OrdemCrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        float numero1, numero2;
        System.out.println("Digite um número qualquer:");
        numero1=teclado.nextInt();
        System.out.println("Digite outro núemro:");
        numero2=teclado.nextInt();
        if(numero1>numero2){
            System.out.printf("Em ordem creccente ficam: %.0f, %.0f \n",numero2,numero1);
        }
        else{
            System.out.printf("Em ordem crescente ficam: %.0f, %.0f \n",numero1,numero2);
        }
        
    }
    
}
