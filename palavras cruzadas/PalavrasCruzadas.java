package palavras;

public class PalavrasCruzadas {
        
        private Integer[][] matriz, matrizPalavras;
        private int inicio = 1; 
        private int linha,coluna;
        
        public Integer[][] getMatriz() {
                return matrizComPalavrasEnumeradas;
        }

        public void setMatriz(Integer[][] matriz) {
                this.matriz = matriz;
        }
        
        public int getMatrizPalavras(int i, int j) {
                return matrizPalavras[i][j];
        }

        public int getLinha() {
                return linha;
        }

        public void setLinha(int linha) {
                this.linha = linha;
        }

        public int getColuna() {
                return coluna;
        }

        public void setColuna(int coluna) {
                this.coluna = coluna;
        }
        
        public void marcador(){
                
                int i,j;
                
                for (i = 0; i < linha; i++)
                        for (j = 0; j < coluna; j++) {
                                
                                if(matriz[i][j]==-1){
                                        matrizPalavras[i][j]= matriz[i][j];
                                }
                                
                                else if((i==0)){
                                        if ((matriz[i+1][j]==0)){
                                                matrizPalavras[i][j] =inicio;
                                                inicio++;
                                        }
                                        else
                                                matrizPalavras[i][j]=matriz[i][j];
                                }
                                
                                else if((j==0)){
                                        if( (matriz[i][j+1]==0)){
                                                matrizPalavras[i][j] =inicio;
                                                inicio++;
                                        }
                                        else
                                                matrizPalavras[i][j]=matriz[i][j];
                                }
                                else if((i==linha-1)){
                                        if ((matriz[i][j-1]==-1)){
                                                matrizPalavras[i][j] =inicio;
                                                inicio++;
                                        }
                                        else
                                                matrizPalavras[i][j]=matriz[i][j];
                                }
                                else if((j==(coluna-1))){
                                        if( (matriz[i-1][j]==-1)){
                                                matrizPalavras[i][j] =inicio;
                                                inicio++;
                                        }
                                        else
                                                matrizPalavras[i][j]=matriz[i][j];
                                }
                                
                                else if((matriz[i][j+1]==0) && (matriz[i][j-1]==-1)){
                                        matrizPalavras[i][j] = inicio;
                                        inicio++;
                                }
                                
                                else if((matriz[i+1][j]==0) && (matriz[i-1][j]==-1) && i < (linha-1) ){
                                        matrizPalavras[i][j] = inicio;
                                        inicioDaPalavra++;
                                }
                                else
                                        matrizPalavras[i][j]= matriz[i][j];
                        }
        }
       
}
