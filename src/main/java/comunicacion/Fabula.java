package comunicacion;

public class Fabula extends Escrito {
    private String enseñanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabras) {
        return this.getPaginas() * palabras;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        return this.resumen() + "\n" +
                this.enseñanza;
    }

    public String getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
