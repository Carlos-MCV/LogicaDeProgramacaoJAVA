/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maior_numero;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Maior_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Digite um número: ");
        float n1=input.nextFloat();
        System.out.println("Digite outro número: ");
        float n2=input.nextFloat();
        System.out.println("Digite um último número:");
        float n3=input.nextFloat();
        if(n1>n2&&n1>n3){
            System.out.printf("O maior valor é N1 = %.0f \n",n1);
        }
        else if(n2>n1&&n2>n3){
            System.out.printf("O maior valor é N2 = %.0f \n",n2);
        }
        else if(n3>n1&&n3>n2){
            System.out.printf("O maior valor é N3 = %.0f \n",n3);
        }
        
    }
    
}
