import java.util.Scanner;

public class App {


    public String  passador(String frase,int contador, String iniciais){
        
          frase = frase.trim();
          
        if(contador == frase.length()){
            
            return iniciais;
        }else {
            if (contador == 0 ){
                iniciais = iniciais + frase.substring(0,1);
            }
             
            
            String letra = frase.substring(contador, contador+1);
           
            if (letra.equals(" ")){
                
                String letraSeguinte = frase.substring(contador+1, contador+2);
                if (!letraSeguinte.equals(" ")) {

                    // Pegando 2 ou 3 letras seguintes para saber se são "de,da,do,dos,das"
                    String duasLetrasDepois = frase.substring(contador+1, contador+4);
                    String tresLetrasDepois = frase.substring(contador+1, contador+5);
                    if (!(duasLetrasDepois.equals("de ") || 
                     duasLetrasDepois.equals("da ") ||
                     duasLetrasDepois.equals("do ") || 
                     tresLetrasDepois.equals("dos ") || 
                     tresLetrasDepois.equals("das "))){

                    
                    iniciais = iniciais + letraSeguinte;

                    }
                    
                }
                //String duasLetrasDepois = frase.substring(contador+3, contador+4);
                
            }
            contador++;
            
            return passador(frase,contador, iniciais);
        }
    
    }

    public String contarIniciais(String nome){
        // A função contarIniciais serve para simplificar a chamada da função recursiva (passador() ) já que ela tem alguns parametros que não mudam e que são necessarios
        String iniciais;
        iniciais = passador(nome,0,"");


        return iniciais;
    }

    public static void main(String[] args) {

        // criando um objeto da classe para usar as funções
        App app = new App();

        // Pegando o nome completo da pessoa
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome completo e vamos dizer quais são as iniciais de cada nome: ");
        nome = scanner.nextLine();

        

        //Exibir mensagem com nome da pessoa e iniciais que são contadas através da função contarIniciais
        System.out.printf("A iniciais do Nome %s são: %s",nome,app.contarIniciais(nome));
        
    }
    
    }
