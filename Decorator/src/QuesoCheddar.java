public class QuesoCheddar extends DecoratorCondimentos{

    Hamburguesa hamburguesa;

    public QuesoCheddar(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public String getDescripcion(){
        return hamburguesa.getDescripcion() + ", queso cheddar";
    }

    public double costo(){
        return hamburguesa.costo() + 10.50;
    }

}
