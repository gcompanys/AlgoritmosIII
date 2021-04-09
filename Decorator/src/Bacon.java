public class Bacon extends DecoratorCondimentos{

    Hamburguesa hamburguesa;

    public Bacon(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public String getDescripcion(){
        return hamburguesa.getDescripcion() + ",bacon";
    }

    public double costo(){
        return hamburguesa.costo() + 15;
    }
}
