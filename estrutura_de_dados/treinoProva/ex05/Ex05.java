package nassau.estrutura_de_dados.treinoProva.ex05;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1,5,2,5,7,8,6,4,2,5};

        
        Scanner scanner = new Scanner(System.in);
        int qtddPaises;
        System.out.println("Digite a quantidade de paises que você deseja registrar: ");
        qtddPaises = scanner.nextInt();
        String[] paises = new String[qtddPaises];
        int[] pedidos = new int[qtddPaises];
        scanner.nextLine();
        
        for (int i = 0; i < qtddPaises; i++) {
            String pais;
            int pedido;
            System.out.printf("Digite o pais %d: \n",i+1);
            pais = scanner.nextLine();
            System.out.printf("Digite a quantidade de %s: \n",pais);
            pedido = scanner.nextInt();

            paises[i] = pais;
            pedidos[i] = pedido;
            scanner.nextLine();
        }
        for (int i = 0; i < pedidos.length-1; i++) {
            for (int j = 0; j < pedidos.length-1-i; j++) {
                if(pedidos[j] > pedidos[j+1]){
                    int temp = pedidos[j+1];
                    String tempPais = paises[j+1];

                    pedidos[j+1] = pedidos[j];
                    pedidos[j] = temp;

                    paises[j+1] =paises[j];
                    paises[j] = tempPais;
                }
            }
        }
     
        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf("%s: %d\n",paises[i],pedidos[i]);
        }

    }
}
