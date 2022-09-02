package Matriz;
import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
   
        System.out.println("quantas cartelas informar:");
        int num = entrada.nextInt();
        
        int matriz[][] = new int[num][6];
        int contAcertos[] = new int[6];  
        int vetorRandom[] = new int[6];  
        System.out.println("valor sorteado");
        for (int i = 0; i < 6; i++) {
            vetorRandom[i] = aleatorio.nextInt(60)+1; 
            System.out.print(vetorRandom[i]+" - ");
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+"ª Cartela:");
            for (int j = 0; j < 6; j++) {
                System.out.println("Valor "+(j+1)+":");
                matriz[i][j] = entrada.nextInt();
                for (int k = 0; k < 6; k++) {  
                    if (matriz[i][j] == vetorRandom[k]) {
                        contAcertos[i]++;            
                    }  
                }      
            }
        }
      
        System.out.println("");
        System.out.println("matriz das cartelas:");
        for (int i = 0; i <num; i++) {
            System.out.println("");
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.println("");
        System.out.println("\nValores aleatorios:");
        for (int i = 0; i < 6; i++) {
            System.out.print(vetorRandom[i]+"\t");
        }
        
        System.out.println("___________");
        for (int i = 0; i < num; i++) {
            System.out.println("Total de acertos da cartela: "+(i+1));
            System.out.println("Acertos: "+contAcertos[i]);
        }
        
        entrada.close();
    }
}