package es.etg.psp.dmc.egg.trabajadores;

import es.etg.psp.dmc.egg.granja.Granja;

public class Transportista extends Trabajador{
    
    private static final int TIEMPO_ESPERA_TRANSPORTISTA = 2000;

    @Override
    public void trabajar(){
        try {
            Thread.sleep(TIEMPO_ESPERA_TRANSPORTISTA);
            Granja.transportar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
