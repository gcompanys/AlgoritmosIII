package SistemaAlarma;

import java.util.ArrayList;

public class AlarmaIncendio implements Sujeto{

    private boolean encendida;
    private ArrayList<Observador> observadores = new ArrayList<>();

    public AlarmaIncendio(){
        this.encendida = false;
    }

   public void activarAlamar(){
        if(!encendida) {
            this.notificarObservador();
            this.encendida = true;
        }
    }

    public boolean estaEncendida(){
        return this.encendida;
    }


   public void desactivarAlarma(){
        if(encendida) {
            this.notificarObservador();
            this.encendida = false;
        }
   }

    public void registrarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void notificarObservador(){
       for(Observador observador: observadores){
           observador.actualizar();
       }
    }
}
