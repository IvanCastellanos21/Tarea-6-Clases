public class Monitor {
    private double pulgada;
    private String marcaMonitor;
    private String modelo;
    private String tipo;
    private double precio;

    public double getPulgada() {
        return pulgada;
    }

    public void setPulgada(double pulgada) {
        this.pulgada = pulgada;
    }

    public String getMarca() {
        return marcaMonitor;
    }

    public void setMarca(String marca) {
        this.marcaMonitor = marcaMonitor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Monitor(double pulgada, String marca, String modelo, String tipo, double precio) {
        this.pulgada = pulgada;
        this.marcaMonitor = marcaMonitor;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgada=" + pulgada +
                ", marcaMonitor='" + marcaMonitor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
