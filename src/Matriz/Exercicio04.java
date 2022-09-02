package Matriz;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     
        System.out.println("qtd atletas");
        System.out.println("vai ser 3");
        int atletas = 3;

        float matriz[][] = new float[atletas][5];
        float piorSalto[] = new float[atletas];
        float vetorMedia[] = new float[atletas];

        for (int i = 0; i < atletas; i++) { 
            System.out.println("");
            System.out.println((i + 1) + "º atleta");
            for (int j = 0; j < 5; j++) { 

                System.out.println("salto " + (j + 1) + ": ");
                matriz[i][j] = entrada.nextFloat();

                vetorMedia[i] += matriz[i][j];  

                if (j == 0) { 
                    piorSalto[i] = matriz[i][j];
                } else {

                    if (matriz[i][j] < piorSalto[i]) {  
                        piorSalto[i] = matriz[i][j];
                    }
                
                    if (j == 4) {
                        System.out.println("pior salto desse atleta foi: " + piorSalto[i]);
                        vetorMedia[i] = (vetorMedia[i] - piorSalto[i]) / 4;
                        System.out.println("Media dos 4 melhores saltos foi: " + vetorMedia[i]);
                    }
                } 
            }
        } 
        
        for (int i = 0; i < atletas; i++) {
            System.out.println("Media dos saltos: " + vetorMedia[i] / 4);
        }
        
        entrada.close();
    }
}