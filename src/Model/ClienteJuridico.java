package Model;

public class ClienteJuridico extends Cliente{
    int id;
    String cnpj;
    String razao_social;
    String nome_fantasia;
    IndicadorInscricaoEstadual indicadorInscricaoEstadual;
    String inscricao_estadual;
    String inscricao_municipal;

    public ClienteJuridico(int id, Contato contato, Endereco endereco, Boolean cliente_ativo, String cadastrado_em,
                           int id1, String cnpj, String razao_social,
                           String nome_fantasia, IndicadorInscricaoEstadual indicadorInscricaoEstadual,
                           String inscricao_estadual, String inscricao_municipal) {
        super(id, contato, endereco, cliente_ativo, cadastrado_em);
        this.id = id1;
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
        this.inscricao_estadual = inscricao_estadual;
        this.inscricao_municipal = inscricao_municipal;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public IndicadorInscricaoEstadual getIndicadorInscricaoEstadual() {
        return indicadorInscricaoEstadual;
    }

    public void setIndicadorInscricaoEstadual(IndicadorInscricaoEstadual indicadorInscricaoEstadual) {
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_municipal() {
        return inscricao_municipal;
    }

    public void setInscricao_municipal(String inscricao_municipal) {
        this.inscricao_municipal = inscricao_municipal;
    }

    public ClienteJuridico(int id, Contato contato, Endereco endereco, Boolean cliente_ativo, String cadastrado_em) {
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
        return "ClienteJuridico{" +
                "\ncnpj='" + cnpj + '\'' +
                "\nrazao_social='" + razao_social + '\'' +
                "\nnome_fantasia='" + nome_fantasia + '\'' +
                "\nindicadorInscricaoEstadual=" + indicadorInscricaoEstadual +
                "\ninscricao_estadual='" + inscricao_estadual + '\'' +
                "\ninscricao_municipal='" + inscricao_municipal + '\'' + endereco + contato +
                '}';
    }
}

