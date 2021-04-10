package Tests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import SistemaAlarma.AlarmaIncendio;

public class AlarmaIncendioTest {

    @Test
    public void testLaAlarmaIncendioSeInstanciaApagada(){
        AlarmaIncendio alarma = new AlarmaIncendio();

        Assert.assertEquals(alarma.estaEncendida(), false);
    }

    @Test
    public void testFuncionaLaAlarmaDeIncendios(){
        AlarmaIncendio alarma = new AlarmaIncendio();
        alarma.activarAlamar();

        Assert.assertEquals(alarma.estaEncendida(), true);

    }

    @Test
    public void testSeActivaYDesactivaAlarma(){
        AlarmaIncendio alarma = new AlarmaIncendio();
        alarma.activarAlamar();
        alarma.desactivarAlarma();

        Assert.assertEquals(alarma.estaEncendida(), false);
    }



}
