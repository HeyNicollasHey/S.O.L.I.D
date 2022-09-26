package Model;

public class ClienteFisico extends Cliente{
    int id;
    String nome;
    String cpf;
    String orgao_emissor;
    Sexo sexo;
    String nascimento;

    public ClienteFisico(int id, Contato contato, Endereco endereco, Boolean cliente_ativo, String cadastrado_em,
                         int id1, String nome, String cpf, String orgao_emissor, Sexo sexo, String nascimento) {
        super(id, contato, endereco, cliente_ativo, cadastrado_em);
        this.id = id1;
        this.nome = nome;
        this.cpf = cpf;
        this.orgao_emissor = orgao_emissor;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getOrgao_emissor() {
        return orgao_emissor;
    }

    public void setOrgao_emissor(String orgao_emissor) {
        this.orgao_emissor = orgao_emissor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public ClienteFisico(int id, Contato contato, Endereco endereco, Boolean cliente_ativo, String cadastrado_em) {
        super(id, contato, endereco, cliente_ativo, cadastrado_em);
    }

    @Override
    public Contato getContato() {
        return super.getContato();
    }

    @Override
    public void setContato(Contato contato) {
        super.setContato(contato);
    }

    @Override
    public Endereco getEndereco() {
        return super.getEndereco();
    }

    @Override
    public void setEndereco(Endereco endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public Boolean getCliente_ativo() {
        return super.getCliente_ativo();
    }

    @Override
    public void setCliente_ativo(Boolean cliente_ativo) {
        super.setCliente_ativo(cliente_ativo);
    }

    @Override
    public String getCadastrado_em() {
        return super.getCadastrado_em();
    }

    @Override
    public void setCadastrado_em(String cadastrado_em) {
        super.setCadastrado_em(cadastrado_em);
    }

    @Override
    public String toString() {
        return "\nClienteFisico{" +
                "\nid=" + id +
                "\nnome='" + nome + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\norgao_emissor='" + orgao_emissor + '\'' +
                 sexo +
                "\nnascimento='" + nascimento + '\'' + endereco + contato +
                '}';
    }
}

