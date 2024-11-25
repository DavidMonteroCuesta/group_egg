package es.etg.psp.dmc.egg;

import es.etg.psp.dmc.egg.trabajadores.Granjero;
import es.etg.psp.dmc.egg.trabajadores.Transportista;

public class Main {
    public static void main(String[] args) {
        Thread granjero = new Thread(new Granjero());
        Thread transportista = new Thread(new Transportista());

        granjero.start();
        transportista.start();
    }
}