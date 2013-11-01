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
               matrizNula = new int[MAX][MAX];
                
                for (i =1; i < MAX - 1; i++)
                        for (j = 1; i < MAX - 1; i++)
                                matrizNula[i][j] = (int) (0);
                
                novoJogo.inicializa();
                assertThat(novoJogo.getMatriz(), not(equalTo(matrizNula)));
        }

        @Test
        public void testInicializaIntArrayArray() {
               matrizNaoNula = new int[MAX][MAX];
                for (i =1; i < MAX - 1; i++)
                        for (j = 1; i < MAX - 1; i++)
                                matrizNaoNula[i][j] = (int) (Math.random() * 1.5);
                
                novoJogo.inicializa(matrizNaoNula);
                assertThat(novoJogo.getMatriz(), equalTo(matrizNaoNula));
        }
}
