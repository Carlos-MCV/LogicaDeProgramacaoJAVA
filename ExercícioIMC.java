/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercícioimc;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ExercícioIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome=teclado.nextLine(); //next"Line"() vai servir a clásse String
        System.out.println("Digite o seu peso: ");
        int peso=teclado.nextInt();
        System.out.println("Digite sua altura: ");
        float altura=teclado.nextFloat();
        float imc=(float)Math.pow(altura,2);//Math.pow vai dar a potenciação
        float imc1=peso/imc;
        System.out.println("Seu imc é: "+imc1);
    }
    
}
