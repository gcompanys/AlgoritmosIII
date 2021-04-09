public class Main {

    public static void main(String[] args){
        Persona persona1 = new PersonaArgentina();
        Persona persona2 = new PersonaFrancesa();
        Persona persona3 = new PersonaInglesa();

        System.out.println("Saludan las personas: ");

        System.out.println("Argentino: ");
        persona1.saludar();
        System.out.println("Frances: ");
        persona2.saludar();
        System.out.println("Ingles: ");
        persona3.saludar();
    }

}
