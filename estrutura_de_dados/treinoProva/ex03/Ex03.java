package nassau.estrutura_de_dados.treinoProva.ex03;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,0,10}; 
        int quantidade = numeros.length;

        int[] pares = new int[quantidade];
        int[] impares = new int[quantidade];
        int indexPar = 0,indexImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 == 0) {
                pares[indexPar] = numeros[i];
                indexPar++;
            }else{
                impares[indexImpar] = numeros[i];
                indexImpar++;
            }
        }

        for (int i = 0; i < indexImpar; i++) {
            System.out.print(impares[i]+" ");
        }

        System.out.println("");

        for (int i = 0; i < indexPar; i++) {
            System.out.print(pares[i]+" ");
        }
    }
}
