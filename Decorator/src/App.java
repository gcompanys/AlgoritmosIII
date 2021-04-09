public class App {

    public static void main(String[] args){

        System.out.println("Pido una hamburguesa de carne sin condimentos");
        Hamburguesa hamburguesa1 = new HamburguesaDeCarne();
        System.out.println(hamburguesa1.getDescripcion() + "..." + "$" + "" + hamburguesa1.costo());

        System.out.println("Pido hamburguesa de pollo con bacon, lechuga y queso cheddar ");
        Hamburguesa hamburguesa2 = new HamburguesaDePollo();
        hamburguesa2 = new Bacon(hamburguesa2);
        hamburguesa2 = new QuesoCheddar(hamburguesa2);
        hamburguesa2 = new Lechuga(hamburguesa2);
        System.out.println(hamburguesa2.getDescripcion() + "..." + "$" + hamburguesa2.costo());


    }

}
