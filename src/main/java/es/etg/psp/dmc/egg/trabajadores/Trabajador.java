package es.etg.psp.dmc.egg.trabajadores;

public abstract class Trabajador implements Runnable{
    
    public abstract void trabajar();

    @Override
    public void run(){
        while (true) { 
            trabajar();
        }
    }
}
