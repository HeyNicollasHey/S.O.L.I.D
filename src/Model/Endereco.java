package Model;

import java.util.UUID;

public class Endereco {
    int id;
    String cep;
    String uf;
    String cidade;
    String bairro;
    String logradouro;
    String complemento;

    public Endereco(int id, String cep, String uf,
                    String cidade, String bairro, String logradouro, String complemento) {
        this.id = id;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "\nEndereco{" +
                "\ncep='" + cep + '\'' +
                "\nuf='" + uf + '\'' +
                "\ncidade='" + cidade + '\'' +
                "\nbairro='" + bairro + '\'' +
                "\nlogradouro='" + logradouro + '\'' +
                "\ncomplemento='" + complemento + '\'' +
                '}';
    }
}
