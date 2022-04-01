package jogoVelha;


public class Tabuleiro {
	
	// Criando atributo static da posição na tabela
	static int[][] posicao = new int[3][3];
	
	// Metodo para exibir o tabuleiro
	public void exibeTabuleiro(){
        System.out.println();
        for(int linha=0 ; linha<3 ; linha++){
        
            for(int coluna=0 ; coluna<3 ; coluna++){
                
                if(posicao[linha][coluna] == 1){
                    System.out.print(" X ");
                }
                else if(posicao[linha][coluna] == -1){
                    System.out.print(" O ");
                }
                else if(posicao[linha][coluna] == 0){
                    System.out.print("   ");
                }
                
                if(coluna==0 || coluna==1)
                    System.out.print("|");
            }
            System.out.println();
        }
                
    }

	// Metodo get da posição
	 public int getPosicao(int[] tentativa){
	        return posicao[tentativa[0]][tentativa[1]];
	    }
	    
	 // Metodo set da posicao
	 public void setPosicao(int[] tentativa, int jogador){
	        if(jogador == 1)
	            posicao[tentativa[0]][tentativa[1]] = 1;
	        else
	            posicao[tentativa[0]][tentativa[1]] = -1;
	        
	        
	    }  
	
	 // Metodo para visualizar o número de cada campo
	public void visualizarCampos() {
		System.out.println();
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("-----------");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("-----------");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println();
	}
	

	// Metodo para verificar se as linhas ja estão prenchidas
	public int verificarLinhas() {
		
		// Verificando o total de cada linha e 
		//retornando 1 para jogador ou -1 para computador ou 0 para dar continuidade no jogo
		
		for (int linhas = 0; linhas < 3; linhas++) {
			
			if(posicao[linhas][0] + posicao[linhas][1] + posicao[linhas][2] == 3) {
				return 1;
			}
			else if(posicao[linhas][0] + posicao[linhas][1] + posicao[linhas][2] == -3) {
				return -1;
			}
		}
		
		return 0;
	}
	
	// Metodo para verificar se as colunas ja estão prenchidas
		public int verificarColunas() {
			
			// Verificando o total de cada coluna e 
			//retornando 1 para jogador ou -1 para computador ou 0 para dar continuidade no jogo
			
			for (int colunas = 0; colunas < 3; colunas++) {
				
				if(posicao[0][colunas] + posicao[1][colunas] + posicao[2][colunas] == 3) {
					return 1;
				}
				else if(posicao[0][colunas] + posicao[1][colunas] + posicao[2][colunas] == -3) {
					return -1;
				}
			}
			
			return 0;
		}
		
		//Verificando diagonal
		public int verificarDiagonal() {
			
			// Verificando o total de cada diagonal e 
			//retornando 1 para jogador ou -1 para computador ou 0 para dar continuidade no jogo
			
			if(posicao[0][0] + posicao[1][1] + posicao[2][2] == -3) {
				return -1;
			}
			else if(posicao[0][2] + posicao[1][1] + posicao[2][0] == -3) {
				return -1;
			}
			else if(posicao[0][0] + posicao[1][1] + posicao[2][2] == 3) {
				return 1;
			}
			else if(posicao[0][2] + posicao[1][1] + posicao[2][0] == 3) {
				return 1;
			}else {
				return 0;
			}
					
		}
		
		// Metodo para zerar o jogo
		public void zerarTabuleiro(){
	        for(int linha=0 ; linha<3 ; linha++)
	            for(int coluna=0 ; coluna<3 ; coluna++)
	                posicao[linha][coluna] = 0;
	    }

}
