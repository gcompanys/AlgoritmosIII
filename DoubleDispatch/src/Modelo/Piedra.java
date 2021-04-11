package Modelo;

public class Piedra implements Material {

    public Material ganadorContra(Material material) {
        return material.ganadorContra(this);
    }

    public Material ganadorContra(Papel papel) {
        return papel;
    }

    public Material ganadorContra(Piedra piedra) {
        return this;
    }

    public Material ganadorContra(Tijera tijera) {
        return this;
    }

    public String mostrarMaterial(){
        return "Piedra";
    }
}
