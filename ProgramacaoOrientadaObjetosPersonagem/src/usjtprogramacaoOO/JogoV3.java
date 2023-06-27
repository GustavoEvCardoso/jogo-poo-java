package usjtprogramacaoOO;

import java.util.Random;

public class JogoV3 {
				
	public static void main(String[] args) throws InterruptedException { //joga para outro quando der problema
		Random random = new Random();
		Personagem pescador = new Personagem ("Pedro",10,10,10);

		
		while(true) {
			switch(random.nextInt(3)) { //vai sortear um numero ate 2, cada numero sorteado ele vai fazer algo que esta
										//nos cases
			case 0:
				pescador.cacar();
				break;	
				
			case 1:
				pescador.dormir();
				break;
			
			case 2:
				pescador.comer();
				break;
				
			}
			System.out.println(pescador.informacoes());
			Thread.sleep(2000);// serve para nao ir muito rapido na hora de exibir o system.out no console
		}
	}
}
