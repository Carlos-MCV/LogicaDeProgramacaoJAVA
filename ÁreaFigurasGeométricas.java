/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package áreafigurasgeométricas;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ÁreaFigurasGeométricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.println("Escolha qual forma geométrica vôce quer calcular a área!");
        System.out.println("Quadrado, triangulo ou círculo?");
        String objeto=teclado.nextLine();
        
        int resultado=0;
        String resposta="";
        
        switch(objeto){
            case "quadrado":
                System.out.println("Digite um dos lados do quadrado:");
                int ladoa=teclado.nextInt();
                System.out.println("Agora digite o outro lado:");
                int ladob=teclado.nextInt();
                resultado=ladoa*ladob;
                resposta="A área do quadrado é:";
                break;
                
            case "triangulo":
                System.out.println("Digite a base do triângulo:");
                int base=teclado.nextInt();
                System.out.println("Agora digite a altura:");
                int altura=teclado.nextInt();
                resultado=base*altura;
                resposta="A área do triangulo é:";
                break;
                
            case "circulo":
                System.out.println("Digite o raio do círculo:");
                int raio=teclado.nextInt();
                float raio1=(float)Math.pow(raio,2);
                resultado=(int) (3.14 *raio1);
                resposta="A área do círculo é:";
                break;
        }
        
        System.out.println(resposta + resultado);
    }
    
}
