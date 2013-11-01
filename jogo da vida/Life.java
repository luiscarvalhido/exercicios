package jogo;

class Life
{
	private int matriz[][];
	private int numColunas;
	
	public Life(int numColunas)
	{
		this.numColunas = numColunas;
		this.matriz = new int[this.numColunas][this.numColunas];
	
	}
	
	public void inicializa()
	{
		for (int i = 1; i < (this.numColunas - 1); i++) {
                        for (int j = 1; j < (this.numColunas - 1); j++) {
                                matriz[i][j] = (int) (Math.random() * 1.5);
                        }
                }
	}
	
	public void inicializa(int matriz[][])
	{
		this.matriz = matriz;	
	}
	
	public void imprimeTabuleiro()
	{
		int i,j;
		for(i=0;i< this.numColunas;i++)
		{
			for(j=0;j< this.numColunas;j++)
				if(matriz[i][j] == 1 )
					System.out.print("∗");
				else
					System.out.print(".");
			System.out.println();
		}
		System.out.println();
	}
	
	public int vizinhos(int i, int j)
	{
		 return matriz[i-1][j-1] + matriz[i-1][j] + matriz[i-1][j+1] +	matriz[i][j-1] + matriz[i][j+1] +matriz[i+1][j-1]+matriz[i+1][j]+matriz[i+1][j+1];
	}
	
	private int [][] iteração()
	{
		int [][] aux = new int[this.numColunas][this.numColunas];
		int i, j;
		
		for(i=1; i< this.numColunas - 1; i++)
			for(j=1; j< this.numColunas - 1; j++)
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
	
	public void simulaVida ( int quant )
	{
			int i ;
		 for ( i = 0 ; i < quant ; i ++){
			imprimeTabuleiro();
		}
	}
	
	//add get+set

	public int[][] getMatriz() 
	{
                return matriz;
        }

        public void setMatriz(int[][] matriz) 
        {
                this.matriz = matriz;
        }
}
