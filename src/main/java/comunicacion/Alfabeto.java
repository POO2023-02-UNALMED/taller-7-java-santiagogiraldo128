package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this. letras = letras;
        this.interpretacion = interpretacion;

    }

    public int cantidadLetras() {
        return this.letras.length;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        return String.join(", ", this.letras);
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
