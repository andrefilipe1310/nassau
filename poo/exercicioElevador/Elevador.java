package nassau.poo.exercicioElevador;

public class Elevador {
    private final int TERREO = 0; //Não terá set
    private int totalAndares;
    private int andarAtual;
    private int capacidadeElevador;
    private int pessoasPresentes;





    //---------------- construtor ------------------------
    public Elevador(int capacidadeElevador, int totalAndares){
    
            this.capacidadeElevador = capacidadeElevador;
            this.totalAndares = totalAndares;
            this.andarAtual = TERREO;
            this.pessoasPresentes = 0;
        
        
    }

    //---------------- metodos ---------------------------


    public void entrar(){
        if (pessoasPresentes < capacidadeElevador) {
            pessoasPresentes++;
            System.out.println("Adicionado e agora tem "+pessoasPresentes+" Pessoa(s)");
        }else{
            System.out.println("Seu elevador já está na capacidade maxima!");
        }
    }

    public void sair(){
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Removido e agora tem "+pessoasPresentes+" Pessoa(s)");
        }else{
            System.out.println("Não foi possivel! O elevador está vazio");
        }
    }

    public void subir(){
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo!");
        }else{
            System.out.println("Não posso subir mais, pois estou no ultimo andar");
        }
    }

    public void descer(){
        if (andarAtual > TERREO) {
            andarAtual --;
            System.out.println("Descendo!");
        }else{
            System.out.println("Não posso descer mais, pois já estou no TERREO");
        }
    }
    //------------------------ verificar status do objeto---------------------------

    public void status(){
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("Esse predio tem %d andares (Sem contar o terreo)\n",totalAndares);
        System.out.printf("O elevador suporta até %d pessoa(s)\n",capacidadeElevador);
        System.out.printf("Atualmente tem %d pessoa(s) no elevador\n",pessoasPresentes);
        if (andarAtual != TERREO) {
        System.out.printf("Atualmente estamos no %d andar\n",andarAtual);    
        }else{
            System.out.println("Atualmente estamos no Terreo");
        }
      System.out.println("--------------------------------------------------------------------");  
    }

    //--------------------área get e set ------------------------


    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }
    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }
    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
    public int getTerreo() {
        return TERREO;
    }
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
}
