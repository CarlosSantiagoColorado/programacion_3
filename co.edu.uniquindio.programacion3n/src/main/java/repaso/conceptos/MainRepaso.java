package repaso.conceptos;

import repaso.conceptos.model.Cliente;
import repaso.conceptos.model.Persona;

public class MainRepaso {
    public static void main(String[] args) {
        validarHerencia();
    }

    private static void validarHerencia() {
        Cliente cliente = new Cliente();
        cliente.setNombre("pedro");
        cliente.setApellido("perez");
        cliente.setDireccion("Armenia");
        cliente.setTelefono("21222");
        System.out.println(cliente.toString());
        cliente.caminar();
        cliente.caminar("silla de ruedas");
        cliente.caminar(20);
        cliente.hacerDescuento(20000.0);
    }
}
