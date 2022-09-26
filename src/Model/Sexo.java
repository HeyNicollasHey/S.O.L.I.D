package Model;

public class Sexo {
    int id;
    String orientacao_sexual;

    public Sexo(int id, String orientacao_sexual) {
        this.id = id;
        this.orientacao_sexual = orientacao_sexual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrientacao_sexual() {
        return orientacao_sexual;
    }

    public void setOrientacao_sexual(String orientacao_sexual) {
        this.orientacao_sexual = orientacao_sexual;
    }

    @Override
    public String toString() {
        return "\nSexo{" +
                "\nid=" + id +
                "\norientacao_sexual='" + orientacao_sexual + '\'' +
                '}';
    }
}
