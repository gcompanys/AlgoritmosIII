package Modelo;

public class Tijera implements Material {

    public Material ganadorContra(Material material) {
        return material.ganadorContra(this);
    }

    public Material ganadorContra(Papel papel) {
        return this;
    }

    public Material ganadorContra(Piedra piedra) {
        return piedra;
    }

    public Material ganadorContra(Tijera tijera) {
        return this;
    }

    public String mostrarMaterial(){
        return "Tijera";
    }
}
