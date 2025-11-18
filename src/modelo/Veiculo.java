package modelo;

public class Veiculo {

    private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private String cor;


    // para saber de quem é o carro
    private Cliente proprietario;


    public Veiculo(String placa, String modelo, int ano, String fabricante, String cor, Cliente proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    // construtor sem proprietario
    public Veiculo(String placa, String modelo, int ano, String fabricante, String cor) {
        this(placa, modelo, ano, fabricante, cor, null);
    }

    //getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getCor() {
        return cor;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    // setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    // metodo para exibir as informações do veiculo
    public void exibirInformacoes() {
        System.out.println("--- Dados do Veículo ---");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Cor: " + cor);
        if (proprietario != null) {
            System.out.println("Proprietário (Nome): " + proprietario.getNome());
            System.out.println("Proprietário (CPF): " + proprietario.getCpf());
        } else {
            System.out.println("Proprietário: Não vinculado");
        }
        System.out.println("------------------------");
    }
}