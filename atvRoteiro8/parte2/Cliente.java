package atvRoteiro8.parte2;

public class Cliente {
    private String
    cpf_cnpj,
    nome,
    endereco,
    email,
    telefone;

//Construtor
public Cliente(String cpf_cnpj, String nome, String endereco, String email, String telefone) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    //Getters & Setters
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 
//toString
    public void getClientInfo() {
        System.out.println(
        "Dados do Cliente:"+
        "\n| CPF/CNPJ: " + cpf_cnpj +
        "\n| Nome: " + nome +
        "\n| Endereço: " + endereco +
        "\n| Email: " + email +
        "\n| Telefone: " +telefone
    );
}


    
}
