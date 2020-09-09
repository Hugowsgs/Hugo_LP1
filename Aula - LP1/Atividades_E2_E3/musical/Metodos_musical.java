package musical;

import javax.swing.JOptionPane;

public class Metodos_musical {

	public static void main(String[] args) {
		
		Musical Missa = new Musical(JOptionPane.showInputDialog("Digite o número conforme tipo de instrumento a ser usado (1 - Sopro / 2 - Cordas / 3 - Percurssão"), JOptionPane.showInputDialog("Digite o instrumento a ser usado: "), JOptionPane.showInputDialog("Digite o número conforme o ritmo a ser usado (1 - VALSA / 2 - FUNK / 3 - SAMBA ENREDO)"));
	
		Missa.getTipo_instrumento();
		Missa.getInstrumento();
		Missa.getRitmo();
		

		int conversao_tipo_instrumento = Integer.parseInt(Missa.getTipo_instrumento());
		int conversao_ritmo = Integer.parseInt(Missa.getRitmo());
		
		System.out.println("O instrumento escolhido para uso é: " + Missa.getInstrumento());
		System.out.println("");
		Missa.missa_comentario_4();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		if (conversao_ritmo == 1) {
			System.out.println("O ritmo escolhido foi: " + Missa.getRitmo() + " - VALSA");
			System.out.println("");
			Missa.missa_comentario_5();
		
		}else if(conversao_ritmo == 2) {
			System.out.println("O ritmo escolhido foi: " + Missa.getRitmo() + " - FUNK");
			System.out.println("");
			Missa.missa_comentario_6();
		}else {
			System.out.println("O ritmo escolhido foi: " + Missa.getRitmo() + " - SAMBA ENREDO");
			System.out.println("");
			Missa.missa_comentario_7();
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		if (conversao_tipo_instrumento == 1) {
			System.out.println("O tipo de instrumento escolhido foi: " + Missa.getTipo_instrumento() + " - SOPRO");
			System.out.println("");
			Missa.missa_comentario();
			
		}else if (conversao_tipo_instrumento == 2) {
			System.out.println("O tipo de instrumento escolhido foi: " + Missa.getTipo_instrumento() + " - CORDAS");
			System.out.println("");
			Missa.missa_comentario_2();
			
		}else {
			System.out.println("O tipo de instrumento escolhido foi: " + Missa.getTipo_instrumento() + " - PERCURSSÃO");
			System.out.println("");
			Missa.missa_comentario_3();
		}
		
	}
}
