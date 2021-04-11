package Tests;
import org.junit.Test;
import org.junit.Assert;
import Modelo.Material;
import Modelo.Piedra;
import Modelo.Papel;
import Modelo.Tijera;

public class TijeraTest {

    @Test
    public void testTijeraGanaContraPapel(){
        Material tijera = new Tijera();
        Material papel = new Papel();
        Assert.assertEquals(tijera, tijera.ganadorContra(papel));
    }

    @Test
    public void testTijeraPierdeContraPiedra() {
        Material tijera = new Tijera();
        Material piedra = new Piedra();

        Assert.assertEquals(piedra, tijera.ganadorContra(piedra));
    }
}
