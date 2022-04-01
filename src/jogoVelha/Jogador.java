package jogoVelha;

public class Jogador extends Tabuleiro {
	
	// Atributo jogar ja recebe o valor 1 que representa o jogador
	private int jogar = 1;

	// Getter e Stters
	public int getJogar() {
		return jogar;
	}

	// Metodo fazer jogada recebe um numero e verifica a posição selecionada se estiver vazia retorna true se não false
	public boolean fazerJogada(int jogada) {
			
			// Criando um vetor para verificar campo vazio
			// Onde verificar[0] == linha e verificar[1] == coluna
			int verificar[] = new int[2];
			
			switch (jogada) {
			case 1:
				
				verificar[0] = 0;
				verificar[1] = 0;
				// verifica a posição e retorna true se estiver vazia
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}
				
			case 2:
				
				verificar[0] = 0;
				verificar[1] = 1;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
				
			case 3:
				
				verificar[0] = 0;
				verificar[1] = 2;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
				
			case 4:
				
				verificar[0] = 1;
				verificar[1] = 0;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
				
			case 5:

				verificar[0] = 1;
				verificar[1] = 1;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
					
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
			
				
			case 6:

				verificar[0] = 1;
				verificar[1] = 2;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
					
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
			
				
			case 7:

				verificar[0] = 2;
				verificar[1] = 0;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
					
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
			
			case 8:

				verificar[0] = 2;
				verificar[1] = 1;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
			
			
			case 9:

				verificar[0] = 2;
				verificar[1] = 2;
				
				if(getPosicao(verificar) == 0) {
					
					setPosicao(verificar, jogar);
					return true;
				}
				else {
					System.out.println("Campo Invalido");
					return false;
				}	
			default:
				System.out.println("Número Invalido");
				return false;
			}
	
		}
		
}	

