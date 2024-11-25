package es.etg.psp.dmc.egg.granja;

public class Granja{

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
        System.out.println(RECOLECTAR + Granja.huevos);
        Granja.class.notify();
    }

    public synchronized static void transportar() throws Exception{
        if (huevos < CAPACIDAD_CAMION)
            Granja.class.wait();
        huevos -= CAPACIDAD_CAMION;
        System.out.println(TRANSPORTAR + Granja.huevos);
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
