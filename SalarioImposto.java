/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarioimposto;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class SalarioImposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Como você se chama?");
        String nome=teclado.nextLine();
        System.out.printf("Olá, %s!!! Digite o seu salário \n",nome);
        float salario=teclado.nextFloat();
        double descontado;
        double valorfinal;
        if(salario<1787.77){
             System.out.printf("Você é isento Imposto de renda, %s. \n",nome);
        }else if(salario>1787.78&&salario<2679.29){
            descontado=(salario*7.5)/100;
            valorfinal=salario-descontado;
            System.out.printf("Seu salário descontado do IF fica: \n",valorfinal);
        }else if(salario>2679.30&&salario<3572.43){
            descontado=(salario*15)/100;
            valorfinal=salario-descontado;
            System.out.printf("Seu salário descontado do IF fica: \n",valorfinal);
        }else if(salario>3572.44&&salario<4463.81){
            descontado=(salario*22.5)/100;
            valorfinal=salario-descontado;
            System.out.printf("Seu salário descontado do IF fica: \n",valorfinal);
        }else if(salario>4463.82){
            descontado=(salario*27.5)/100;
            valorfinal=salario-descontado;
            System.out.printf("Seu salário descontado do IF fica: \n",valorfinal);
        }
    }
    
}
