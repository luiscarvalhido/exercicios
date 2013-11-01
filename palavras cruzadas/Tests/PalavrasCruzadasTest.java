package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPalavraCruzada {
        
        PalavrasCruzadas main = new PalavrasCruzadas(2,4);       
	
	@Before
	Integer [][] teste = {{0,-1,0,-1},{-1,-1,-1,-1};
        Integer [][] resposta = {{1,-1,2,-1},{-1,-1,-1,-1}};

        @Test
        public void test() {
        	main.setMatriz(teste);
                main.marcador();
                Integer[][] test = main.getMatriz();
                
                for (int i = 0; i < main.getLinha(); i++)
                        for (int j = 0; j < main.getColuna(); j++)
                                assertEquals(resposta[i][j],test[i][j]);

                }
       	}

}
