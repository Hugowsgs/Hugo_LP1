package pessoa;

import javax.swing.JOptionPane;

public class Metodos_pessoa {

	public static void main(String[] args) {
		
		Pessoa Encontro = new Pessoa (JOptionPane.showInputDialog("Digite o tipo do seu cabelo: "), 1.59, 75);
		
		Encontro.getAltura();
		Encontro.getCabelo();
		Encontro.getPeso();
		
		
		System.out.println("Seu tipo de cabelo: " + Encontro.getCabelo());
		Encontro.elogio();
		System.out.println();
		System.out.println();

		if (Encontro.getAltura() <= 1.60) {
			Encontro.permissao();
			System.out.print("A sua altura é somente:" + "  " + Encontro.getAltura());
		} else {
			Encontro.permissao_2();
		}
		
		System.out.println();
		System.out.println();
		
		if (Encontro.getPeso() <= 50) {
			Encontro.conselho_2();
			System.out.println("Seu peso: " + Encontro.getPeso());
		}else if(Encontro.getPeso() > 80) {
			Encontro.conselho();
			System.out.println("Seu peso: " + Encontro.getPeso());
		}else {
			Encontro.conselho_3();
			System.out.println("Seu peso: " + Encontro.getPeso());
			
		}
		
		
	}
	
	}

