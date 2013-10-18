
package conversor.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.Conversor;

public class ConversorTest {

    Conversor meuConversor;

    @Before
    public void setUp() throws Exception {
    meuConversor = new Conversor();
    }

    @Test
    public void testCelsiusParaFahrenheit() {
    assertEquals(104, meuConversor.celsiusParaFahrenheit());
    }

    @Test
    public void testCelsiusParaFahrenheit() {
    assertEquals(32, meuConversor.celsiusParaFahrenheit(0));
    }

    @Test	
    public void testCelsiusParaFahrenheitDouble() {
    assertEquals(32.0, meuConversor.celsiusParaFahrenheit(0.0));
    }

    @Test	
    public void testCelsiusParaKelvin() {
    assertEquals(273, meuConversor.celsiusParaFahrenheit(0));
    }

    @Test	
    public void testCelsiusParaKelvin() {
    assertEquals(273.0, meuConversor.celsiusParaFahrenheit(0.0));
    }

    @Test
    public void testKelvinParaCelcius() {
    assertEquals(-272, meuConversor.celsiusParaFahrenheit(1));
    }	

    @Test
    public void testKelvinParaCelcius() {
    assertEquals(-272.0, meuConversor.celsiusParaFahrenheit(1.0));
    }

    @Test
    public void testKelvinParaFahrenheit() {
    assertEquals(32, meuConversor.celsiusParaFahrenheit(273));
    }

    @Test
    public void testKelvinParaFahrenheit() {
    assertEquals(32.0, meuConversor.celsiusParaFahrenheit(273.0));
    }
}
