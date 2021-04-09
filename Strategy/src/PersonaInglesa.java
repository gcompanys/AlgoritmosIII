public class PersonaInglesa extends Persona{

    public PersonaInglesa(){
        this.setEstrategiaSaludo();
    }

    public void setEstrategiaSaludo(){
        this.estrategiaSaludo = new SaludoIngles();
    }
}
