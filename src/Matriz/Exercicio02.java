package Matriz;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

     
        float matriz[][] = new float[5][5];
        float valor = 0;
        float vetorProd[] = {0, 0, 0, 0, 0};
        float vetorMerc[] = {0, 0, 0, 0, 0};

        for (int i = 0; i < 5; i++) {
            valor += 5;
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        System.out.println("             prod.1  | prod.2 | prod.3| prod.4| prod.5");
        for (int i = 0; i < 5; i++) {

            if (i != 0) {
                System.out.println("");
            }
            for (int j = 0; j < 5; j++) {

                if (j == 0) {
                    switch (i) {
                        case 0:
                            System.out.print("MERCADO 1 ");
                            break;
                        case 1:
                            System.out.print("MERCADO 2 ");
                            break;
                        case 2:
                            System.out.print("MERCADO 3 ");
                            break;
                        case 3:
                            System.out.print("MERCADO 4 ");
                            break;
                        case 4:
                            System.out.print("MERCADO 5 ");
                            break;

                    }
                    System.out.print("   ");
                }

                System.out.print("R$" + matriz[i][j] + "\t");

                switch (i) {
                    case 0:
                        vetorMerc[i] += matriz[i][j];
                        break;
                    case 1:
                        vetorMerc[i] += matriz[i][j];
                        break;
                    case 2:
                        vetorMerc[i] += matriz[i][j];
                        break;
                    case 3:
                        vetorMerc[i] += matriz[i][j];
                        break;
                    case 4:
                        vetorMerc[i] += matriz[i][j];
                        break;
                }

                switch (j) {
                    case 0:
                        vetorProd[j] += matriz[i][j];
                        break;
                    case 1:
                        vetorProd[j] += matriz[i][j];
                        break;
                    case 2:
                        vetorProd[j] += matriz[i][j];
                        break;
                    case 3:
                        vetorProd[j] += matriz[i][j];
                        break;
                    case 4:
                        vetorProd[j] += matriz[i][j];
                        break;

                }

            }
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.println("Media de preço do Produto " + (1 + i) + ": " + (vetorProd[i]/5));
            System.out.println("Soma mercado " + (i + 1) + ": " + vetorMerc[i]);
            System.out.println("---");
        }
        
        entrada.close();
    }
}