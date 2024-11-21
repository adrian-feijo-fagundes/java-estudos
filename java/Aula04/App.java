package Aula04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um nome para o Arqueiro:");
		String nomeArqueiro = sc.next();
		
		System.out.println("Escolha um nome para o Guerreiro:");
		String nomeGuerreiro = sc.next();
				
		System.out.println("Escolha um nome para o Mago:");
		String nomeMago = sc.next();
	
		Personagem[] personagens = new Personagem[3];
		
		personagens[1] = new Guerreiro(nomeGuerreiro);
		personagens[0] = new Arqueiro(nomeArqueiro);
		personagens[2] = new Mago(nomeMago);
		
		while (personagens[0].estaVivo() && personagens[1].estaVivo() && personagens[2].estaVivo()) {
			int oponente, atacante;
			System.out.println("\nCampo de batalha");
			for (int i = 0; i < personagens.length; i++) {
				System.out.println((i + 1) + " " + personagens[i].info());
			}
			while (true) {
				System.out.println("\nEscolha um personagem para atacar:");
				atacante = sc.nextInt();
				
				if (atacante < 0 && atacante > 4) {
					System.out.println("\nNúmero invalido");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("\nEscolha um personagem para ser o alvo: ");
				oponente = sc.nextInt();
				
				if (oponente == atacante) {
					System.out.println("Escolha inválida não é possivel um personagem se atacar!!");
				} else if (oponente < 0 && oponente > 3) {
					System.out.println("Número invalido");
				} else {
					break;
				}
			}
			Personagem atacado = personagens[oponente - 1];
			personagens[atacante - 1].atacar(atacado);
			
			if (!atacado.estaVivo()) {
				System.out.println("\n O " + atacado.getTipo() + " " + atacado.getNome() + " foi derrotado e morreu.");	
			}	
		}					
	}
}