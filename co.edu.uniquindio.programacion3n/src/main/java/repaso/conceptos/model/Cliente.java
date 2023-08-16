package repaso.conceptos.model;

import repaso.conceptos.interfaces.IClientePremium;

public class Cliente extends Persona implements IClientePremium {

    private String direccion;
    private String telefono;

    public Cliente() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public void caminar() {
        System.out.println("Estoy caminando relajado");
    }

    public void caminar(String mensaje) {
        System.out.println("Estoy caminando relajado en"+ mensaje);
    }

    public void caminar(int valor) {
        System.out.println("Estoy caminando relajado a "+valor+" por hora");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public void hacerDescuento(double valorDescuento) {
        System.out.println("Descuento por premium: "+ valorDescuento);
    }
}
