
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorNumerosTest {

    @Test
    public void testVerificar() {


        assertFalse(ConversorNumeros.verificar("IVX"));

        assertFalse(ConversorNumeros.verificar("MIL"));

        assertFalse(ConversorNumeros.verificar("CDD"));

        assertFalse(ConversorNumeros.verificar("MMMM"));

        assertFalse(ConversorNumeros.verificar("MXCD"));

        assertTrue(ConversorNumeros.verificar("MMMDCCCLXXXVIII"));

        assertFalse(ConversorNumeros.verificar("MDCLXVIV"));

    }


    @Test
    public void calcularGruposSubstractivos(){

        ConversorNumeros cn = new ConversorNumeros();

        cn.calcularGruposSubstractivos("IV");

        assertEquals(4, cn.getResultat());

        cn.setResultat(-4);

        cn.calcularGruposSubstractivos("MCCCXL");

        assertEquals(40, cn.getResultat());

    }


}