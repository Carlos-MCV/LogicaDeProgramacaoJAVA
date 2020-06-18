/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosemordemcrescente;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class NumerosEmOrdemCrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite um número:");
        float n1=teclado.nextFloat();
        System.out.println("Digite um número:");
        float n2=teclado.nextFloat();
        System.out.println("Digite um número:");
        float n3=teclado.nextFloat();
        if(n1<n2&&n2<n3){
            System.out.printf("%.0f %.0f %.0f \n",n1,n2,n3);
        }else if(n2<n1&&n1<n3){
            System.out.println("n2 n1 n3");
        }else if(n3<n1&&n1<n2){
            System.out.println("n3 n1 n2");
        }else if(n1<n3&&n3>n2){
            System.out.println("n1 n3 n2");
        }else if(n2<n3&&n3>n1){
            System.out.println("n2 n3 n1");
        }else if(n3<n2&&n2>n1){
            System.out.println("n3 n2 n1");
        }
    
}
}
