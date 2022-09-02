package Matriz;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("qtd alunos:");
        int alunos = entrada.nextInt();
      
        float matriz[][] = new float[alunos][2];
        String vetorNome[] =new String[alunos];  
        float vetorMedia[] = new float[alunos];
        float maiorNota= Integer.MIN_VALUE; 
        float menorNota = Integer.MAX_VALUE; 
        int posMaiorNota = 0;  
        int posMenorNota =0;
        
        for (int i = 0; i < alunos; i++) {
            System.out.println("Nome aluno:");
            vetorNome[i] = entrada.next();
            for (int j = 0; j < 2; j++) {
                System.out.println("nota "+(j+1)+":");
                matriz[i][j] = entrada.nextFloat();
              
                vetorMedia[i]+=matriz[i][j];  
                
                if (maiorNota < matriz[i][j]) {
                    maiorNota = matriz[i][j];
                    posMaiorNota = i;
                }
                if (menorNota > matriz[i][j]) {
                    menorNota =matriz[i][j];
                    posMenorNota = i;
                }
            } 
        } 
        
        System.out.println("__________SAIDA__________");
        for (int i = 0; i < alunos; i++) {
            System.out.println("");
            System.out.println(vetorNome[i]);
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.println("");
        for (int i = 0; i < alunos; i++) {
            if (i==posMenorNota) {
                System.out.println("nome menor nota: "+vetorNome[i]);
                System.out.println("media dele "+vetorMedia[i]/2);
            }
            System.out.println("");
            if (i==posMaiorNota) {
                System.out.println("nome maior nota "+vetorNome[i]);
                System.out.println("media dele "+vetorMedia[i]/2);
            }
        }
       entrada.close();
    }    
}