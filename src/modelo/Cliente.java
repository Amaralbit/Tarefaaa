package modelo;


public class Cliente {
        // Atributos
        private String cpf;
        private String nome;
        private String endereco;
        private String telefone;
        private String email;

        // Construtor
        public Cliente(String cpf, String nome, String endereco, String telefone, String email) {
            this.cpf = cpf;
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
        }

        // getters
        public String getCpf() {
            return cpf;
        }

        public String getNome() {
            return nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEmail() {
            return email;
        }

        //metodos settesr
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // metodo para mostrar as informacoes do cliente em questai
        public void exibirInformacoes() {
            System.out.println("--- Dados do modelo.Cliente ---");
            System.out.println("CPF: " + cpf);
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
            System.out.println("E-mail: " + email);
            System.out.println("------------------------");
        }
    }

