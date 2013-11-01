package palavras;

public class Main {

        
        public static void main(String[] args) {
                PalavrasCruzadas main =new PalavrasCruzadas(2,4);
                Integer [][] teste = {{0,-1,0,-1},{-1,0,0,-1}};
                
                main.setMatriz(teste);
                main.marcador();
                
                for (int i = 0; i < main.getLinha(); i++){
                        for (int j = 0; j < main.getColuna(); j++) {
                                System.out.print(main.getMatrizPalavras(i, j)+"\t");
                        }
                        System.out.println(" ");
                }        
        }

}
