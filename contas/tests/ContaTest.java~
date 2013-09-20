package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.Conta;

public class ContaTest {

	Conta aConta;

	//Inicializar antes de cada teste (instanciador)

	@Before
	public void setUp() throws Exception {
	aConta = new Conta();
	}
	
	//Teste Quadrado
	
	@Test
	public void testQuadradoZero() {
	assertEquals(0,aConta.calculaQuadrado(0),0.01);
	}
	
	@Test
	public void testQuadradoPositivoPequeno() {
	assertEquals(9.61,aConta.calculaQuadrado(3.1),0.01);
	}
	
	@Test
	public void testQuadradoNegativoPequeno() {
	assertEquals(9,aConta.calculaQuadrado(-3),0.01);
	}
	
	@Test
	public void testQuadradoPositivoGrande() {
	assertEquals(16900,aConta.calculaQuadrado(130),0.01);
	}
	
	@Test
	public void testQuadradoNegativoGrande() {
	assertEquals(65536,aConta.calculaQuadrado(-265),0.01);
	}


	//Teste Cubo

	@Test
	public void testCuboZero() {
	assertEquals(0,aConta.calculaCubo(0),0.01);
	}
	
		@Test
	public void testCuboPositivoPequeno() {
	assertEquals(27,aConta.calculaCubo(3),0.01);
	}

	@Test
	public void testCuboNegativoPequeno() {
	assertEquals(-29.791,aConta.calculaCubo(-3.1),0.01);
	}

	@Test
	public void testCuboPositivoGrande() {
	assertEquals(219700,aConta.calculaCubo(13),0.01);
	}

	@Test
	public void testCuboNegativoGrande() {
	assertEquals(-274625,aConta.calculaCubo(-65),0.01);
	}


}
