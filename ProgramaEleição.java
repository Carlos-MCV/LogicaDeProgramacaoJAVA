/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaeleição;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ProgramaEleição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        float voto=0, total1=0, total2=0, total3=0, votacaototal, porcentagem1, porcentagem2, porcentagem3;
        String continuar="sim";
        
        
        System.out.println("Escolha seu candidato digitando seu respectivo número.");
        
        while(continuar.equals("sim")){
            System.out.println("Candidato 1; candidato 2 ou candidato 3?");
            voto=teclado.nextInt();
            
           if(voto!=1&&voto!=2&&voto!=3){
            System.out.println("ERRO...");
            System.out.println("Por favor, digite um número válido.");
            continuar="sim";
            }
           
           if(voto==1||voto==2||voto==3){
                System.out.println("Continuar com a votação?");
                continuar=teclado.next();
            } 
            
           if(voto==1){
               total1++;
           }
           if(voto==2){
               total2++;
           }
           if(voto==3){
               total3++;
           }
           }
           votacaototal=total1+total2+total3;
           
           porcentagem1=(total1*100)/votacaototal;
           
           porcentagem2=(total2*100)/votacaototal;
           
           porcentagem3=(total3*100)/votacaototal;
           
           System.out.printf("%.2f %.2f %.2f ", porcentagem1, porcentagem2, porcentagem3);
          
           if(porcentagem1>50){
               System.out.printf("candidato 1 venceu no primeiro turno com %.2f  dos votos \n", porcentagem1);
           }
           if(porcentagem2>50){
               System.out.printf("candidato 2 venceu no primeiro turno com %.2f  dos votos \n", porcentagem2);
           }
           if(porcentagem3>50){
               System.out.printf("candidato 3 venceu no primeiro turno com %.2f  dos votos \n", porcentagem3);
           }else{
               System.out.println("Teremos segundo turno...");
           }
          
        
    }
    
}
