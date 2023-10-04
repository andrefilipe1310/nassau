package nassau.estrutura_de_dados.treinoProva.ex02;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        int[] numerosMutiplicos5 = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o número %d: \n",i+1);
            int numero = scanner.nextInt();
            numeros[i] = numero;
            numerosMutiplicos5[i] = numero*5;

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d %d\n",numeros[i],numerosMutiplicos5[i]);
        }
    }
    
}
