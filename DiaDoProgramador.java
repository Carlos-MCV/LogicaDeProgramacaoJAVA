/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.pkgdo.programador;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class DiaDoProgramador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Em que ano nós estamos?");
        int ano=teclado.nextInt();
        
        if(ano%4==0 && (ano%100!=0 || ano%400==0)){
            System.out.println("Esse ano é um ano bissexto!!!");
        }else{
            System.out.println("Esse não é um ano bissexto...");
        }
    }
    
}
