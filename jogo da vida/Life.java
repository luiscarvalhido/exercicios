package jogo;

class Life
{
	int MAX = 10 ;
	//Tamanho da matriz
	int[][] matriz = new int[MAX][MAX] ;
	void inicializa()
	{
		int i,j;    
		
		for(i=1; i< MAX -1;i++)
			for(j=1;j< MAX -1;j ++)
				matriz[i][j]=(int)(Math.random() * 1.5);
	}
	
	void imprimeTabuleiro()
	{
		int i,j;
		for(i=0;i<MAX;i++)
		{
			for(j=0;j<MAX;j++)
				if(matriz[i][j] == 1 )
					System.out.print("∗");
				else
					System.out.print(".");
			System.out.println();
		}
		System.out.println();
	}
	
	int vizinhos(int i, int j)
	{
		 return matriz[i-1][j-1] + matriz[i-1][j] + matriz[i-1][j+1] +	matriz[i][j-1] + matriz[i][j+1] +matriz[i+1][j-1]+matriz[i+1][j]+matriz[i+1][j+1];
	}
	
	int [][] iteração(){
		int [][] aux = new int[MAX][MAX];
		int i, j;
		
		for(i=1; i< MAX - 1; i++)
			for(j=1; j< MAX - 1; j++)
			{
				if (matriz[i][j] == 1)	// se está viva         
					{
						if ((vizinhos(i,j) < 2)||(vizinhos(i,j) > 3))
						aux[i][j] = 0 ; // morre 
						else
						aux[i][j] = 1; // continua viva
					}
					else //se não está viva 
					{
						if(vizinhos(i,j) == 3)
							aux[i][j] = 1 ; // aparece vida
						else
							aux[i][j] = 0 ; //continua como estava
					}
			}
		return aux; //devolve a matriz com a nova iteração
	}
	
		void simulaVida ( int quant ){
			int i ;
		 for ( i = 0 ; i < quant ; i ++){
			imprimeTabuleiro();
		}
	}
}
