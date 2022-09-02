package Matriz;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

     
        float soma = 0;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int contPar = 0, contImpar = 0, somaDiPri = 0, somaDiSec = 0, num = 0;
        boolean condicao;

        System.out.println("num de 3 a 11");
        num = entrada.nextInt();
        if ((num % 2 != 0) && (num >= 3) && (num <= 11)) {
            condicao = true;

        } else {
            condicao = false;
        }

        int matriz[][] = new int[num][num];  

        while (condicao == true) {   condicao = false;
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("proxima linha:");
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("valor:");
                    matriz[i][j] = entrada.nextInt();

                    soma += matriz[i][j];

                    if (maiorValor < matriz[i][j]) {
                        maiorValor = matriz[i][j];  
                        System.out.println("----------------------------");

                    } else if (menorValor > matriz[i][j]) {
                        menorValor = matriz[i][j];  
                    }

                    if (matriz[i][j] % 2 == 0) {
                        contPar++;  
                    } else {
                        contImpar++;  
                    }
                    if (i == j) {
                        somaDiPri += matriz[i][j];  
                    }
                }
            }
        } 
        
	for(int i = matriz.length - 1; i >= 0; i--) {    
		for(int j = matriz.length - 1; j >= 0; j--) {
			if(i + j == matriz.length -	1) {
				somaDiSec += matriz[i][j];
			}
		}
	}

        System.out.println("_____SAIDA____");
        
        for (int i = 0; i < num; i++) {
            System.out.println("");
            for (int j = 0; j < num; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
        
        System.out.println("");
        System.out.println("Maior Valor: "+maiorValor);
        System.out.println("Menor valor: "+menorValor);
        System.out.println("qtd pares: "+contPar);
        System.out.println("qtd impares "+contImpar);
        System.out.println("Soma diagona Pri: "+somaDiPri );
        System.out.println("Soma diagona Sec: "+somaDiSec);
        System.out.println("Media dos num: "+(soma/(num*num)));
   
        entrada.close();
	}

}