package Model;

import java.util.UUID;

public class Cliente {
    int id;
    Contato contato;
    Endereco endereco;
    Boolean cliente_ativo;
    String cadastrado_em;

    public Cliente(int id, Contato contato,
                   Endereco endereco, Boolean cliente_ativo, String cadastrado_em) {
        this.id = id;
        this.contato = contato;
        this.endereco = endereco;
        this.cliente_ativo = cliente_ativo;
        this.cadastrado_em = cadastrado_em;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Boolean getCliente_ativo() {
        return cliente_ativo;
    }

    public void setCliente_ativo(Boolean cliente_ativo) {
        this.cliente_ativo = cliente_ativo;
    }

    public String getCadastrado_em() {
        return cadastrado_em;
    }

    public void setCadastrado_em(String cadastrado_em) {
        this.cadastrado_em = cadastrado_em;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                contato + endereco +
                "\ncliente_ativo=" + cliente_ativo +
                "\ncadastrado_em='" + cadastrado_em + '\'' +
                '}';
    }
}
