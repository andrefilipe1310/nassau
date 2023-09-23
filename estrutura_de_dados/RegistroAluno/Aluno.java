
public class Aluno {
    protected String nome;
    protected int semestre;
    protected int sala;
    protected String curso;
    protected Endereco endereco;
    double[] notas = new double[6];
    public Aluno(String nome, int semestre, int sala, String curso, Endereco endereco){
        this.nome = nome;
        this.semestre = semestre;
        this.sala = sala;
        this.curso = curso;
        
        this.endereco = endereco;

    }
    public void getInformacoes(){
        System.out.println("---------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Semestre: " + semestre);
        System.out.println("Sala: " + sala);
        System.out.println("Curso: " + curso);
        System.out.println("Rua: " + endereco.rua);
        System.out.println("Bairro: " + endereco.bairro);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("Estado: " + endereco.estado);
        System.out.println("CEP: " + endereco.cep);
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f%n",i+1,notas[i]);
        }
        System.out.println("---------------------------------------------");
    }
    // Get de todas os atributos
    public String getCurso() {
        return curso;
    }
    public String getNome() {
        return nome;
    }
    public double[] getNotas() {
        return notas;
    }
    public int getSala() {
        return sala;
    }
    public int getSemestre() {
        return semestre;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    //set de todos os atributos
    public void setCurso(String curso) {
        this.curso = curso;
    }
    //set de notas por lista
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //set de notas por variaveis
    public void setNotas(double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.notas[3] = nota4;
        this.notas[4] = nota5;
        this.notas[5] = nota6;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
