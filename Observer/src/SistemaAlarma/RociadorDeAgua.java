package SistemaAlarma;

public class RociadorDeAgua implements Observador{

    private boolean encendido;

    public RociadorDeAgua(){
        this.encendido = false;
    }

    public void actualizar() {
        this.encendido = !this.encendido; 
        //aca agrego unos prints para mostrar como se va actualizando y que funciona nuestro observer
        if(encendido){
            System.out.println("Rociador prendido.");
        }else{
            System.out.println("Rociador apagado.");
        }
    }

    public boolean estaEncendido(){
        return this.encendido;
    }
}
