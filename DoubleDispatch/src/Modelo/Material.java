package Modelo;

public interface Material {

    Material ganadorContra(Material material);
    Material ganadorContra(Piedra piedra);
    Material ganadorContra(Tijera tijera);
    Material ganadorContra(Papel papel);

    String mostrarMaterial();


}
