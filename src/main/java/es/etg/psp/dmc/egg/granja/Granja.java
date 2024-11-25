package es.etg.psp.dmc.egg.granja;

import es.etg.psp.dmc.egg.visibilidad.Impresora;

public class Granja implements Impresora{

    private static final String RECOLECTAR = "recolectar";
    private static final String TRANSPORTAR = "transportar";
    private static final int DOCENA = 12;
    private static final int CAPACIDAD_CAMION = 120;
    private static final int CAPACIDAD_GRANJA = 150;
    private static int huevos = 0;

    
    public synchronized static void recolectar() throws Exception{
        if ((huevos + DOCENA) > CAPACIDAD_GRANJA)
            Granja.class.wait();
        huevos += DOCENA;
        Impresora.imprimir(RECOLECTAR + Granja.huevos);
        Granja.class.notify();
    }

    public synchronized static void transportar() throws Exception{
        if (huevos < CAPACIDAD_CAMION)
            Granja.class.wait();
        huevos -= CAPACIDAD_CAMION;
        Impresora.imprimir(TRANSPORTAR + Granja.huevos);
        Granja.class.notify();
    }

    public static int getDocena() {
        return DOCENA;
    }

    public static int getCapacidadCamion() {
        return CAPACIDAD_CAMION;
    }

    public int getHuevos() {
        return huevos;
    }

    public static void setHuevos(int huevos) {
        Granja.huevos = huevos;
    }
}
