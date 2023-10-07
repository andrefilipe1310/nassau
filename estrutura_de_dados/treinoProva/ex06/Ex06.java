package nassau.estrutura_de_dados.treinoProva.ex06;

public class Ex06 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        int[][] teste = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (coluna > linha) {
                    matriz[linha][coluna] = 2*linha+1;
                    
                }
                else if(coluna == linha){
                    matriz[linha][coluna] = 1;
                }
                else if(coluna < linha){
                    matriz[linha][coluna] = 2*coluna + 3*linha;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
