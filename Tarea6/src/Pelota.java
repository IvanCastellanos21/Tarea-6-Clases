public class Pelota {
    private String tipo;
    private String marcaPelota;
    private double radio;

    public String getMarcaPelota() {
        return marcaPelota;
    }

    public void setMarcaPelota(String marcaPelota) {
        this.marcaPelota = marcaPelota;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pelota(String tipo, String marcaPelota, double radio) {
        this.tipo = tipo;
        this.marcaPelota = marcaPelota;
        this.radio = radio;
    }
}
