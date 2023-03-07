import java.awt.*;
import java.util.ArrayList;

public class Automovil {
    private String Marca;
    private String subMarca;
    private String Modelo;
    private java.awt.Color Color;

    public Automovil(String marca, String subMarca, String modelo, java.awt.Color color) {
        Marca = marca;
        this.subMarca = subMarca;
        Modelo = modelo;
        Color = color;
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("BMW");
        marcas.add("HONDA");
        marcas.add("TESLA");
        marcas.add("MITSUBISHI");
        marcas.add("TOYOTA");

        if (marcas.contains(marca.toUpperCase())){
            this.Marca = marca;
        } else {
            System.out.println("Esta marca no existe.");
        }
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public java.awt.Color getColor() {
        return Color;
    }

    public void setColor(java.awt.Color color) {
        Color = color;
    }
    @Override
    public String toString() {
        return "Automovil{" +
                "Marca='" + Marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", Modelo=" + Modelo +
                ", Color=" + Color +
                '}';
    }


}
