package es.etg.psp.dmc.egg.trabajadores;

import es.etg.psp.dmc.egg.granja.Granja;

public class Granjero extends Trabajador{

    private static final int TIEMPO_ESPERA_GRANJERO = 100;

    @Override
    public void trabajar(){
        try {
            Thread.sleep(TIEMPO_ESPERA_GRANJERO);
            Granja.recolectar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
