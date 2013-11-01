package jogo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Life F = new Life();
		
		/* int MAX = 10;
		int [][] matriz = new int[MAX][MAX];
		int i,j;
		
		for(i = 1; i < MAX -1; i++)
		{
			for(j = 1; j < MAX -1; j++)
			{
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("0 = Morta, 1 = Viva"));
			}	
		} */
	
	F.inicializa();
	F.simulaVida(10);

	}

}
