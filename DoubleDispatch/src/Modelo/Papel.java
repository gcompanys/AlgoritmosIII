package Modelo;

public class Papel implements Material {

    public Material ganadorContra(Material material) {
        return material.ganadorContra(this);
    }

    public Material ganadorContra(Papel papel) {
        return this;
    }

    public Material ganadorContra(Piedra piedra) {
        return this;
    }

    public Material ganadorContra(Tijera tijera) {
        return tijera;
    }

    public String mostrarMaterial(){
        return "Papel";
    }
}
