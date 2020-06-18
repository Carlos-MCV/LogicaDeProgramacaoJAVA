/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equecaodesegundograu;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class EquecaoDeSegundoGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o valor de A");
        float a=teclado.nextFloat();
        System.out.println("Digite o valor de B");
        float b=teclado.nextFloat();
        System.out.println("Digite o valor de C");
        float c=teclado.nextFloat();
        float delta1=(float)Math.pow(b,2);
        float delta2=4*(a*c);
        float delta=delta1-delta2;
        float bfinal=b*-1;
        float afinal=a*2;
        float deltafinal=(float)Math.sqrt(delta);
        float numerador=bfinal+deltafinal;
        float x=numerador/afinal;
        if(delta>0){
            System.out.println("A equação terá soluções diferentes.");              
        }else if(delta==0){
            System.out.println("A equação terá soluções iguais.");
        }
        else if(delta<0){
            System.out.println("A equação não terá solução nos reais.");
        }
    
}
}