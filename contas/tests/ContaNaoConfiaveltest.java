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
        
        
        
        //Cubo

        @Test
        public void testCuboZero() {
                assertEquals(aConta.calculaCubo(0),naoConta.calculaCubo(0),0.01);
        }
        
        
        
}


