package co.edu.uniquindio.programacion3.repaso.conceptos.model;

import co.edu.uniquindio.programacion3.repaso.conceptos.interfaces.ICarroElectrico;

public class Carro extends  Vehiculo implements ICarroElectrico {

    @Override
    public void encender() {
        System.out.println("Encendiendo mi carro");
    }

    public void encender(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Encendiendo mi carro");
    }

    @Override
    public void encenderElectrico() {
        System.out.println("Realizando encendido electrico");
    }
}
