public class HamburguesaDePollo extends Hamburguesa{

    public HamburguesaDePollo(){
        this.descripcion = "Hamburguesa de pollo";
    }

    @Override
    public double costo() {
        return 20;
    }
}
