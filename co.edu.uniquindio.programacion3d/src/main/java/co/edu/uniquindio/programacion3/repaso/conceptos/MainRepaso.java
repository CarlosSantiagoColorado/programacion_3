package co.edu.uniquindio.programacion3.repaso.conceptos;

import co.edu.uniquindio.programacion3.repaso.conceptos.model.Carro;

public class MainRepaso {
    public static void main(String[] args) {
        repasoConceptos();
    }

    private static void repasoConceptos() {
        Carro carro = new Carro();
        carro.setMarca("Mazda");
        carro.setColor("Negro");
        carro.setModelo(2023);
        carro.encender("Primero empujar el carro");
        carro.encender();
        System.out.println(carro.toString());
    }
}
