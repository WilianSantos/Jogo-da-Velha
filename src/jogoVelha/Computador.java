package jogoVelha;

import java.util.Random;

public class Computador extends Tabuleiro {
	
	// Atributos da classe
	private int comp = -1; // variavel comp recebe o -1 que representa o computador
	private int nivel;
	Random aleatorio = new Random();

	//Getter e Setters
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
	public int getComp() {
		return comp;
	}
	
	//Criando Classe jogar para definir como o coputador vai se comportar em cada nivel
	public void jogar(int nivel) {
	
		// Criando um vetor para verificar campo vazio
		// Onde verificar[0] == linha e verificar[1] == coluna
		int[] verificar = new int[2];
		
		// Condição do computador nivel 1
		if(this.nivel == 1) {
				
			// Variavel do Loop
			int fim_loop = 0;
			
			// Enquanto o computador não encontrar um campo vazio o loop não termina
			while(fim_loop == 0) {
				
				// Gereando um número aleatorio de 0 - 3
				verificar[0] = aleatorio.nextInt(3); 
				verificar[1] = aleatorio.nextInt(3);
				
				// Verificando se o campo da matriz Tabuleiro esta vazio  do campo gerado
				// e atribuindo a variavel comp na matriz 
				if (getPosicao(verificar) == 0) {
					
					setPosicao(verificar, this.comp);

					// Fim do loop
					fim_loop++;						
				}
				
			}
		
		}// Nivel 2
		else if (this.nivel == 2) {
			
			// No nivel 2 é verificado se o campo do centro esta vazio
			// Se não estiver e prenchido e se estiver segue a mesma logica do nivel 1
			verificar[0] = 1;
			verificar[1] = 1;
			
			if (getPosicao(verificar) == 0 ) {
				
				setPosicao(verificar, comp);
				
			}
			else {
				
				int fim_loop = 0;
				
				while(fim_loop == 0) {
					
					verificar[0] = aleatorio.nextInt(3); 
					verificar[1] = aleatorio.nextInt(3);
					
					if (getPosicao(verificar) == 0) {
						
						setPosicao(verificar, this.comp);
						
						fim_loop++;						
					}
					
				}
			}			
		}// Nivel 3
		else if(nivel == 3) {
			
			int fim_loop = 0;
	
			// Inicio do loop
			while(fim_loop == 0) {
						
						verificar[0] = aleatorio.nextInt(3);
						verificar[1] = aleatorio.nextInt(3);
						
						// Analisando cada canto da posição matriz e igual a 1
						if(verificar[0] == 0 && verificar[1] == 0 ||
							verificar[0] == 0 && verificar[1] == 2 ||
							verificar[0] == 2 && verificar[1] == 0 || 
							verificar[0] == 2 && verificar[1] == 2) {
							
							// Se for igual a 1 vai adicionar um -1 no centro do campo
							if(getPosicao(verificar) == 1) {
								
								verificar[0] = 1;
								verificar[1] = 1;
								
								if(getPosicao(verificar) == 0) {
									
									setPosicao(verificar, comp);
									fim_loop++;
								}else {
									int loop = 0;
									while(loop == 0) {
										
										verificar[0] = aleatorio.nextInt(3);
										verificar[1] = aleatorio.nextInt(3);
										
										if(verificar[0] == 0 && verificar[1] == 1 || 
											verificar[0] == 1 && verificar[1] == 0 ||
											verificar[0] == 1 && verificar[1] == 2 ||
											verificar[0] == 2 && verificar[1] == 1) {
											
											if(getPosicao(verificar) == 0) {
												
												setPosicao(verificar, comp);
												loop++;
												fim_loop++;
											}
										}
										
									}
								}
							}
							// Se não estiver vazia vai procurar um campo vazio e prencher
							else {
								int fim_loop2 = 0;
								
								while(fim_loop2 == 0) {
									
									verificar[0] = aleatorio.nextInt(3); 
									verificar[1] = aleatorio.nextInt(3);
									
									if (getPosicao(verificar) == 0) {
										
										setPosicao(verificar, this.comp);
										
										fim_loop2++;	
										fim_loop++;
									}
									
								}			
												
							}								
						}
					}						
				}
			}
		}
	
				

			
			
			
		
	
		

	

