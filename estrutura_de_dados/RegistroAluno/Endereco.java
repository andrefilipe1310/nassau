public class Endereco{
    protected String rua;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected int cep;

    public Endereco(String rua, String bairro, String cidade, String estado, int cep){
        
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    // Get dos atributos
    public String getBairro() {
        return bairro;
    }
    public int getCep() {
        return cep;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getRua() {
        return rua;
    }
    // Set dos atributos
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
}
