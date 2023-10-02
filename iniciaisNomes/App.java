import java.util.Scanner;

public class App {


    public String  passador(String frase,int contador, String intacta, String iniciais){

          
        if(contador == intacta.length()){
            
            return iniciais;
        }else {
            if (contador == 0 ){
                iniciais = iniciais + frase.substring(0,1);
            }
            
            //System.out.println(frase.substring(contador, frase.length()));
            
            String letra = frase.substring(contador, contador+1);
           
            if (letra.equals(" ")){
                String letraSeguinte = frase.substring(contador+1, contador+2);
                iniciais = iniciais + letraSeguinte;
            }
            contador++;
            
            
            
            return passador(frase,contador,intacta, iniciais);
        }
    
    }

    public String contarIniciais(){
        String iniciais = "";



        return iniciais;
    }

       /*  public String iniciais(int contador,String nome){
            contador = 0;
            String armazenador = nome;
            //André Filipe de Oliveira Figueiredo
            if (contador == nome.length()){
                return "acabou";
            }
            else{
                nome = nome.substring(nome.length(),contador);
                contador++;

                System.out.println(nome);
                
                return iniciais(contador,nome);
                //return iniciais(nome);
            }
            
        } */
    public static void main(String[] args) {

        // Exemplo André Filipe de Oliveira, FIgueiredo return afof
        String iniciais[] = new String[10];
        App app = new App();
        Scanner scanner = new Scanner(System.in);

        String nome = "André Filipe de Oliveira Figueiredo";

        //app.passador(nome,0,nome);
        System.out.println(app.passador(nome, 0, nome,""));
        
    }
    
    }

