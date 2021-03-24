/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.notas.e.frequencia;

import java.util.Scanner;

/**
 *
 * @author rodri_mwdybw0
 */
public class NotasEFrequencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String[] nomes = new String [3];
        int [] notas=new int[10],
           frequencia = new int[10];
        boolean[] aprovados=new boolean[10];
        int i;
        
        for(i=0;i < nomes.length;i++)
        {
            System.out.println("Dados do "+(i+1)+"º aluno");
            System.out.println("Nome:");
            nomes[i]=sc.nextLine();
            System.out.println("Nota:");
            notas[i]= Integer.parseInt(sc.nextLine());
            System.out.println("Frequencia:");
            frequencia[i]=Integer.parseInt(sc.nextLine());
           
            System.out.println("");
        }
       
        System.out.println("Alunos Aprovados");
        
        for(i=0;i < nomes.length;i++)
        {
              if((notas[i]>=60)&& (frequencia[i]>=75))
            {
                aprovados[i]=true;
                System.out.println("Aluno aprovado:"+nomes[i]+" posição"+(i+1));
            }
                else
                aprovados[i]=false;
        }
        System.out.println("");
        
        System.out.println("RELATORIO FINAL");
        for(i=0;i < nomes.length;i++)
        {
            System.out.println("Nomes: "+nomes[i]);
            System.out.println("Notas: "+notas[i]);
            System.out.println("Frequencia: "+frequencia[i]);
            if(aprovados[i])
            {
                System.out.println("Aprovado");
            }
            else
                System.out.println("Reprovado");
            System.out.println("");
        }
      
    }
    
}
