package nassau.estrutura_de_dados.treinoProva.ex07;

public class Ex07 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                if (coluna > linha) {
                    matriz[linha][coluna] = 2*coluna + 4* linha;

                }
                else if(coluna == linha){
                    matriz[linha][coluna] = 2;
                }
                else if (coluna<linha){
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
