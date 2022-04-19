public class Veiculo {
    
    // atributos
    private int ano;
    private String modelo;
    
    // construtor 1 - nenhum parâmetro, não é possível inicializar os atributos
    public Veiculo() {
    }

    // construtor 2 - contém 2 parâmetros, é possível inicializar os atributos
    public Veiculo(int ano, String modelo) {
        this.ano = ano;
        this.modelo = modelo;
    }

    // encapsulamento
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
