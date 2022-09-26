package Model;

public class IndicadorInscricaoEstadual {
    int id;
    String indicador;

    public IndicadorInscricaoEstadual(int id, String indicador) {
        this.id = id;
        this.indicador = indicador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
}
