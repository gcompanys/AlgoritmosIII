public class HamburguesaDeCarne extends Hamburguesa{

     public HamburguesaDeCarne(){
         this.descripcion = "Hamburguesa de carne";
     }

    @Override
    public double costo() {
        return 30;
    }
}
