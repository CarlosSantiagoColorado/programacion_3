package co.edu.uniquindio.programacion3.repaso.conceptos.model;

public class Vehiculo {
    private String marca;
    private String color;
    private int modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, int modelo) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void encender(){
        System.out.println("Encendiendo vehiculo");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
