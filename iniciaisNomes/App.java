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

    public String contarIniciais(){
        String iniciais = "";



        return iniciais;
    }

    public static void main(String[] args) {

        // Exemplo André Filipe de Oliveira, FIgueiredo return afof
        String iniciais[] = new String[10];
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        String nome = "André Filipe de Oliveira Figueiredo";

        //app.passador(nome,0,nome);
        System.out.println(app.passador(nome, 0,""));
        
    }
    
    }
