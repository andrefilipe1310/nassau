package nassau.estrutura_de_dados.treinoProva.ex01;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o seu nome (pessoa %d): \n",i+1);
            nomes[i] = scanner.nextLine();
        }
        
        for (int i = 0; i < nomes.length; i++) {
            if (i+1 < nomes.length) {
                System.out.printf("%s, ",nomes[i]);
            }else{
                System.out.printf("%s\n",nomes[i]);
            }
            
        }

        for (int i = nomes.length-1; i >= 0; i--) {
            if (i-1 >= 0) {
                System.out.printf("%s, ",nomes[i]);
            }else{
                System.out.printf("%s",nomes[i]);
            }
            
        }
    }
}
