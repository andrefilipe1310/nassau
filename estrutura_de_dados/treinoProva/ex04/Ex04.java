package nassau.estrutura_de_dados.treinoProva.ex04;

public class Ex04 {

    public static void main(String[] args) {
        int[] numeros = new int[]{1,5,2,5,7,8,6,4,2,5};
        int[] numeros2 = new int[]{1,5,2,5,7,8,6};

        int[] numeros3 = new int[17];

        BubbleSort b = new BubbleSort();
        numeros = b.ordenar(numeros);
        numeros2 = b.ordenar(numeros2);
        //três indices para o while
        int index1=0, index2=0,index3=0;
        //comparar os indices ao tamanho de cada vetor para não dar erro de fora do indice
        while ((index1< numeros.length) && (index2< numeros2.length) && (index3 < numeros3.length)) {
            if (numeros[index1] < numeros2[index2]) {
                numeros3[index3++] = numeros[index1++];
            }else{
                numeros3[index3++] = numeros2[index2++];
            }
        }
        // Se ainda houver elementos não adicionados nos vetores
         while (index1 < numeros.length) {
            numeros3[index3++] = numeros[index1++];
        }
        
        
        while (index2 < numeros2.length) {
            numeros3[index3++] = numeros2[index2++];
        }
        
         for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i]+" ");
        }
       
    }
}
