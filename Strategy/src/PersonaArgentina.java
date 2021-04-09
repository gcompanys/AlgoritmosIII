public class PersonaArgentina extends Persona{

    public PersonaArgentina(){
        this.setEstrategiaSaludo();
    }

    public void setEstrategiaSaludo(){
        this.estrategiaSaludo = new SaludoArgento();
    }

}
