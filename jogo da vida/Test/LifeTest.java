package tests;

import static org.junit.Assert.*;

import life.Life;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class LifeTest {

	Life novoJogo;
        int MAX = 10;
        int[][] matrizNula;
        int[][] matrizNaoNula;
        int i;
        int j;
        
        @Before
        public void setUp() throws Exception {
                novoJogo = new Life(10);
        }

        @Test
        public void testInicializa() {
               fail("Not yet implemented");
        }

        @Test
        public void testInicializaIntArrayArray() {
               fail("Not yet implemented");
        }

        @Test
        public void testImprimeTabuleiro() {
                
        }

        @Test
        public void testVizinhos() {
                fail("Not yet implemented");
        }

        @Test
        public void testIteracao() {
                fail("Not yet implemented");
        }

        @Test
        public void testSimulaVida() {
                fail("Not yet implemented");


}
