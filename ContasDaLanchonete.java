/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas.da.lanchonete;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class ContasDaLanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int dias=1;
        float coxinha=4.50f, pastel=4.00f, melhordia, piordia, faturamentocoxinha=0f, faturamentopastel=0f, melhordiacoxinha=0f, melhordiapastel=0f, piordiacoxinha=99999999f, piordiapastel=99999999f;
        float totalcoxinhas=0f, totalpasteis=0f;
        while(dias<5){
            dias++;
            
            System.out.println("Quantas coxinhas foram vendidas hoje?");
            float quantidadecoxinhas=teclado.nextFloat();
            faturamentocoxinha=coxinha*quantidadecoxinhas;
            totalcoxinhas=totalcoxinhas+faturamentocoxinha;
            
            
            
            System.out.println("Quantos pastéis foram vendidos hoje?");
            float quantidadepasteis=teclado.nextFloat();
            faturamentopastel=pastel*quantidadepasteis;
            totalpasteis=totalpasteis+faturamentopastel;
                    
                    
                    
            if(faturamentocoxinha>melhordiacoxinha){
                melhordiacoxinha=faturamentocoxinha;
            }
            
            if(faturamentopastel>melhordiapastel){
                melhordiapastel=faturamentopastel;
            }
            
            
            if(faturamentocoxinha<piordiacoxinha){
                piordiacoxinha=faturamentocoxinha;
            }
            
            if(faturamentopastel<piordiapastel){
                piordiapastel=faturamentopastel;
            }
        }
        
        if(totalcoxinhas>totalpasteis){
               System.out.printf("O maior faturamento do mês foi com coxinhas, que chegaram a vender: %.2f Reais. \n", totalcoxinhas);
        }else if(totalcoxinhas==totalpasteis){
            System.out.printf("Coxinhas e pastéis empataram em questão de faturamento com %.2f e %.2f Reais cada. \n", totalcoxinhas, totalpasteis);
        }else{
            System.out.printf("O maior faturamento do mês foi com pastéis, que chegaram a vender: %.2f Reais. \n", totalpasteis);
        }
        
        System.out.printf("Faturamento total com coxinhas: %.2f Reais. \n ",totalcoxinhas);
        System.out.printf("Faturamento total com pastéis: %.2f Reais. \n ",totalpasteis);
        System.out.printf("O melhor dia de faturamento com coxinhas totalizou: %.2f Reais. \n",melhordiacoxinha);
        System.out.printf("O melhor dia de faturamento com pastéis totalizou: %.2f Reais. \n",melhordiapastel);
        System.out.printf("O pior dia de faturamento com coxinhas totalizou: %.2f Reais. \n",piordiacoxinha);
        System.out.printf("O pior dia de faturamento com pastéis totalizou: %.2f Reais. \n",piordiapastel);
    }
}
