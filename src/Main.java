

import modelo.Cliente;
import modelo.Veiculo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Aplicação de Controle de Oficina Mecânica Iniciada.\n");

        // cadastro do ciente
        System.out.println("--- Módulo de Cadastro de Clientes ---");
        Cliente cliente1 = new Cliente(
                "123.456.789-00",
                "Maria da Silva",
                "Rua das Flores, 100",
                "(11) 98765-4321",
                "maria.silva@email.com"
        );

        //mostra as informacoes
        cliente1.exibirInformacoes();

        // cadastrar os carros/motos
        System.out.println("\n--- Módulo de Cadastro e Entrada de Veículos ---");
        Veiculo veiculo1 = new Veiculo(
                "ABC-1234",
                "Gol",
                2015,
                "Volkswagen",
                "Prata",
                cliente1 // Vincula o veículo ao cliente cadastrado
        );

        //mostra informacoes dos veiculos
        veiculo1.exibirInformacoes();

        // exemplo de um veiculo sem proprietario
        Veiculo veiculo2 = new Veiculo(
                "XYZ-9876",
                "Civic",
                2020,
                "Honda",
                "Preto"
        );

        // exemplo de entrada na manutenção
        System.out.println("\n--- Controle de Entrada (Veículo 2) ---");
        System.out.println("Veículo " + veiculo2.getPlaca() + " (" + veiculo2.getModelo() + ") deu entrada para manutenção.");



        System.out.println("\nAplicação finalizada.");
    }
}