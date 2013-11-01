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
       
}
