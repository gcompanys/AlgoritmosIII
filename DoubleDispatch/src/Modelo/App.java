package Modelo;

import Modelo.Material;

public class App {

    public static void main(String[] args){
        Material piedra = new Piedra();
        Material tijera = new Tijera();
        Material papel = new Papel();

        System.out.println("Piedra vs Papel");
        System.out.println("Ganador: "+ (papel.ganadorContra(piedra)).mostrarMaterial() );

        System.out.println("Piedra vs Tijera");
        System.out.println("Ganador:" + (piedra.ganadorContra(tijera)).mostrarMaterial());

        System.out.println("Tijera vs Papel");
        System.out.println("Ganador: " + (tijera.ganadorContra(papel)).mostrarMaterial());

    }
}
