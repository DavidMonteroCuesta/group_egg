package es.etg.psp.dmc.egg.trabajadores;

import es.etg.psp.dmc.egg.granja.Granja;

public class Transportista extends Trabajador{
    
    @Override
    public void trabajar(){
        try {
            Thread.sleep(2000);
            Granja.transportar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
