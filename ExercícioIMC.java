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
       /* String msgsobrepeso=". Infelizmente você está com sobrepeso!!!";//atribuição de um texto a váriavel msg sobrepeso utilizando a classe String
       * String msgok="!!!";
       */
        float imc=(float)Math.pow(altura,2);//Math.pow vai dar a potenciação
        float imc1=peso/imc;
        String msgfinal=(imc1>=30)?". Infelizmente você está com sobrepeso!!!":". Parabéns!!!";
        System.out.printf("Seu imc, %s, é de: %f%s \n",nome,imc1,msgfinal);
    }
    
}
