package es.etg.psp.dmc.egg.trabajadores;

import es.etg.psp.dmc.egg.granja.Granja;

public class Granjero extends Trabajador{
    
    @Override
    public void trabajar(){
        try {
            Thread.sleep(100);
            Granja.recolectar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
