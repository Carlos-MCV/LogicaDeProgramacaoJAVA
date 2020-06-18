/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imccompleto;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ImcCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome=teclado.nextLine();
        System.out.printf("Digite sua altura, %s: Obs:.Apenas os números \n",nome);
        float altura=teclado.nextFloat();
        System.out.printf("Agora digite seu peso, %s: Obs:.Apenas os números.\n",nome);
        float peso=teclado.nextFloat();
        float imc=(float)Math.pow(altura,2);
        float imc2=peso/imc;
        if(imc2<25&&imc2>19){
            System.out.printf("Você está com peso normal, %s.\n",nome);
        }
    else if(imc2<20&&imc2>16){
            System.out.printf("Você está com subpeso, %s. \n",nome);
        }
    else if(imc2<16){
            System.out.printf("Você está com severo subpeso, %s. \n",nome);
    }
    else if(imc2>25&&imc2<30){
            System.out.printf("Você está com sobrepeso, %s. \n",nome);
    }
    else if(imc2>30&&imc2<40){
            System.out.printf("Você está obeso, %s. \n",nome);
    }
    else if(imc2>40){
            System.out.printf("Seu imc é de: %.0f Você está com obesidade mórbida, %s. \n",imc2,nome);
    }
}
}

