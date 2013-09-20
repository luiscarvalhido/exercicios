package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import contas.ContaNaoConfiaveis;
import contas.Conta;

public class ContaNaoConfiavelTest {	

        Conta aConta;
        ContaNaoConfiavel outraConta;
        
        
        //Inicialização e instanciação antes de cada teste
        @Before
        public void setUp() throws Exception {
                aConta = new Conta();
                naoConta = new ContaNaoConfiavel();
                
        }

	//Quadrado  
	      
        @Test
        public void testQuadradoZero() {
                assertEquals(aConta.calculaQuadrado(0),naoConta.calculaQuadrado(0),0.01);
        }
        
        @Test
        public void testQuadradoPositivoPequeno() {
                assertEquals(aConta.calculaQuadrado(3.1),naoConta.calculaQuadrado(3.1),0.01);
        }
        
        @Test
        public void testQuadradoNegativoPequeno() {
                assertEquals(aConta.calculaQuadrado(-5),naoConta.calculaQuadrado(-5),0.01);
        }
        
        @Test
        public void testQuadradoPositivoGrande() {
                assertEquals(aConta.calculaQuadrado(1000),naoConta.calculaQuadrado(1000),0.01);
        }
        
        @Test
        public void testQuadradoNegativoGrande() {
                assertEquals(aConta.calculaQuadrado(-130),naoConta.calculaQuadrado(-130),0.01);
        }
        
        
        
        
        //Cubo

        @Test
        public void testCuboZero() {
                assertEquals(aConta.calculaCubo(0),naoConta.calculaCubo(0),0.01);
        }
        
        	@Test
        public void testCuboPositivoPequeno() {
                assertEquals(aConta.calculaCubo(5),naoConta.calculaCubo(5),0.01);
        }
        
        @Test
        public void testCuboNegativoPequeno() {
                assertEquals(aConta.calculaCubo(-3.1),naoConta.calculaCubo(-3.1),0.01);
        }
        
        @Test
        public void testCuboPositivoGrande() {
                assertEquals(aConta.calculaCubo(10000),naoConta.calculaCubo(10000),0.01);
        }
        
        @Test
        public void testCuboNegativoGrande() {
                assertEquals(aConta.calculaCubo(-256),naoConta.calculaCubo(-256),0.01);
        }
        
        
        
}


