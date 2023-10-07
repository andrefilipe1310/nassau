package nassau.estrutura_de_dados.treinoProva.ex04;

public class BubbleSort {
    // função com tipo de retorno array
    public int[] ordenar(int[] numeros){
        // percorre dois loop e faz uma codicional comparativa
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (j == numeros.length - 1) {
                    break;
                }
                if (numeros[j] > numeros[j+1]) {
                    // ordenando de forma crescente
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    return numeros;
    }

    public int[] ordenarBonitinho(int[] numeros){
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1-i; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

       return numeros;
    }
}
