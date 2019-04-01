
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorNumerosTest {


    @Test
    public void verificarTest() {


        assertFalse(ConversorNumeros.verificar("IVX"));

        assertFalse(ConversorNumeros.verificar("MIL"));

        assertFalse(ConversorNumeros.verificar("CDD"));

        assertFalse(ConversorNumeros.verificar("MMMM"));

        assertFalse(ConversorNumeros.verificar("MXCD"));

        assertTrue(ConversorNumeros.verificar("MMMDCCCLXXXVIII"));

        assertFalse(ConversorNumeros.verificar("MDCLXVIV"));

    }


    @Test
    public void calcularGrupsSubstractiusTest(){

        ConversorNumeros cn = new ConversorNumeros();

        cn.calcularGrupsSubstractius("IV");

        assertEquals(4, cn.getResultat());

        cn.setResultat(-4);

        cn.calcularGrupsSubstractius("MCCCXL");

        assertEquals(40, cn.getResultat());

    }


    @Test
    public void calcularGrupsSumatorisTest(){

        ConversorNumeros cn = new ConversorNumeros();

        cn.calcularGrupsSumatoris("XXX");

        assertEquals(30, cn.getResultat());

        cn.setResultat(-30);

        cn.calcularGrupsSumatoris("MMMDCCCLXXXVIII");

        assertEquals(3888, cn.getResultat());

    }


    @Test
    public void CalcularTotal(){

        ConversorNumeros cn = new ConversorNumeros();

        assertEquals(149, cn.convertirNumeroRoma("CXLIX"));

    }


}