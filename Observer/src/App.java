public class App {

    public static void main(String[] args){

        AlarmaIncendio alarma = new AlarmaIncendio();
        RociadorDeAgua rociador = new RociadorDeAgua();

        alarma.registrarObservador(rociador);

        System.out.println("SE ACTIVA ALARMA");
        alarma.activarAlamar();
        System.out.println("SE DESACTIVA ALARMA");
        alarma.desactivarAlarma();
        System.out.println("SE VUELVE A ACTIVAR ALARMA");
        alarma.activarAlamar();
        
    }

}
