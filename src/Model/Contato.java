package Model;

import java.util.UUID;

public class Contato {
    int id;
    String numero_de_contato;
    String email;

    public Contato(int id, String numero_de_contato, String email) {
        this.id = id;
        this.numero_de_contato = numero_de_contato;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_de_contato() {
        return numero_de_contato;
    }

    public void setNumero_de_contato(String numero_de_contato) {
        this.numero_de_contato = numero_de_contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nContato{" +
                "\nid=" + id +
                "\nnumero_de_contato='" + numero_de_contato + '\'' +
                "\nemail='" + email + '\'' +
                '}';
    }
}
