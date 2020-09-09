package fatec;

import javax.swing.JOptionPane;

public class Metodos_fatec {
	
	public static void main(String[] args) {
		Fatec Questoes = new Fatec (JOptionPane.showInputDialog("Digite seu curso: "), JOptionPane.showInputDialog("Digite o nome de sua escola: "), 7.9);
		
		Questoes.getCurso();
		Questoes.getEscola();
		Questoes.getMedia();
		
		System.out.println("Seu curso: " + " " + Questoes.getCurso());
		Questoes.comentario();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Sua escola: " + " " + Questoes.getEscola());
		Questoes.comentario_2();
		
		System.out.println("");
		System.out.println("");
		
		if (Questoes.getMedia() >= 8) {
			Questoes.comentario_3();
			System.out.println("Sua nota é: " + Questoes.getMedia());
		}else if(Questoes.getMedia() >= 6) {
			Questoes.comentario_4();
			System.out.println("Sua nota é: " + Questoes.getMedia());
		}else {
			Questoes.comentario_5();
			
		}
		
		
	
	}
	
}
