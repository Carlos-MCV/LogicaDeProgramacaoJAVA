/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizdevariavelvalida;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Quizdevariavelvalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        float soma=0;
        System.out.println("Quais desses nomes servem como variável em programação?");
        String nao= "não";
        
        System.out.println("'numero' é válido?");
        String numero=teclado.nextLine();
        if(numero.equals("s")){
            System.out.println("Parabéns, acertou!");
            soma=soma+1;
        } else{
            System.out.println("Errou...");
        }
        
        System.out.println("'número' é válido?" );
        String numero2=teclado.nextLine();
        System.out.println(numero2);
        if(nao.equals(numero2)){
            System.out.println("Parabéns, acertou!");
            soma=soma+1;
        } else{
            System.out.println("Errou...");
        }
        
        System.out.println("'média Turma' e válido?");
        String media=teclado.nextLine();
        if(media.equals("n")){
            System.out.println("Parabéns, acertou!");
            soma=soma+1;}
        else{
            System.out.println("Errou...");
        }
        
        System.out.println("'n1' é válido?");
        String n1=teclado.nextLine();
        if(n1.equals("s")){
            System.out.println("Parabéns, acertou!");
            soma=soma+1;}
        else{
            System.out.println("Errou...");
        }
        
        System.out.println("'1n' é válido?");
        String n=teclado.nextLine();
        if(n.equals("n")){
            System.out.println("Parabéns, acertou!");
            soma=soma+1;   }
        else{
            System.out.println("Errou...");   
        }
        
        
        
        if(soma>1){
            System.out.printf("você acertou %.0f vezes!\n",soma);    //só consegui respresentar o número utilizando o float... n estava conseguido com o int %i
        }
        if(soma==1){
            System.out.printf("você acetou %.0f vez \n",soma);}  
        if(soma<1){
            System.out.println("você errou todas...");
        }        
}
}