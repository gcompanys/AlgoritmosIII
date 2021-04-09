public class PersonaFrancesa extends Persona{


    public PersonaFrancesa(){
        this.setEstrategiaSaludo();
    }

    public void setEstrategiaSaludo(){
        this.estrategiaSaludo = new SaludoFrances();
    }
}
