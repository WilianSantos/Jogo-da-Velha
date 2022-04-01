package jogoVelha;

import java.util.Scanner;

public class Jogo  extends Tabuleiro{
	
	Computador computador = new Computador();
	Jogador jogador = new Jogador();
	Scanner teclado = new Scanner(System.in);
	
	// Metodo para verificar o resultado dos metodos da classe tabuleiro e retorna um valor 1 ou -1
	public int ganhou() {
		if(verificarLinhas() == 1 || verificarColunas() == 1 || verificarDiagonal() == 1) {
			return 1;
		}
		else if(verificarLinhas() == -1 || verificarColunas() == -1 || verificarDiagonal() == -1) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	// Metodo jogar
	public void jogar() {
		int jogo = 0;
		
		// Loop do jogo
		while(jogo == 0) {
			
			
			boolean fim_partida = false;
			int nivel;
			
			System.out.println("Digite o nível do jogo.");
			nivel = teclado.nextInt();
			
			// Verificação do nivel digitado
			if (nivel < 1 || nivel > 3) {
				
				System.out.println("Você digitou um número invalido, vamos começar no nível 1");
				computador.setNivel(1);
			}
			else {
				computador.setNivel(nivel);
			}

			visualizarCampos();
			
			// Loop da partida
			while(fim_partida == false) {
		
				// Variavel da partida
				int jogada = 1;
				boolean validar = false;
				
				// Verifica o valor da variavel jogada se for 10 exibe empate e termina a partida
				if (jogada == 10) {
					System.out.println("Jogo empatado");
					fim_partida = true;
				}
				
				// Esse loop recebe o resultado do metodo fazer jogada da classe jogador 
				// e enquanto o resultado for falso pede para digitar a posição
				while(validar == false) {
					
					System.out.println("Faça sua jogada. Escolha a posição do X de 1 ao 9 para um dos campos.");
					
					if(jogador.fazerJogada(teclado.nextInt()) == true) {
						
						validar = true;
					}				
				}
				
				// computador faz a jogada e depois e exibido o tabuleiro 
				computador.jogar(computador.getNivel());
				exibeTabuleiro();
				
				// Verificação do metodo ganhou é 1 ou -1
				if(ganhou() == 1) {
					System.out.println("Você ganhou parabens");
					fim_partida = true;
				}
				else if(ganhou() == -1) {
					System.out.println("Você perdeu quem sabe na proxima");
					fim_partida = true;
				}
		
				// Soma 1 na variavel
				jogada += 1;
			}
			
			System.out.println("Deseja jogar novamente? s ou n");
			
			// Se o usuario desejar jogar de novo o loop do jogo continua
			if(teclado.next().equals("s") || teclado.next().equals("S")) {
				
				System.out.println("Vamos JOGAR de novo");
				zerarTabuleiro();
				
			}
			else {
				System.out.println("Fim do jogo");
				jogo ++;
			}
			
		}
	}


}
