public class Lechuga extends DecoratorCondimentos{

    Hamburguesa hamburguesa;

    public Lechuga(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public String getDescripcion(){
        return hamburguesa.getDescripcion() + ", lechuga";
    }

    public double costo() {
        return hamburguesa.costo() + 2;
    }
}
