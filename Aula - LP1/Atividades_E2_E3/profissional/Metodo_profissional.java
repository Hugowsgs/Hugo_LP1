package profissional;

import javax.swing.JOptionPane;

public class Metodo_profissional {

	public static void main(String[] args) {
		
		profissional Trabalho = new profissional (JOptionPane.showInputDialog("Digite o n�mero correspondente a profiss�o exercida (1 - Desenvolvedor FullStack / 2 - Engenheiro de produ��o"), JOptionPane.showInputDialog("Digite a quantidade de anos que exerceu/exerce a profiss�o: "), JOptionPane.showInputDialog("Digite o n�mero conforme a empresa que trabalha (1 - Embraer / 2 - GSW"));
		
		
		Trabalho.getProfiss�o();
		Trabalho.getAnos();
		Trabalho.getEmpresa();
		
		int conversao_profissao = Integer.parseInt(Trabalho.getProfiss�o());
		int conversao_empresa = Integer.parseInt(Trabalho.getEmpresa());
		int conversao_anos = Integer.parseInt(Trabalho.getAnos());
		
		if (conversao_empresa == 1) {
			System.out.println("A empresa selecionada foi: " + Trabalho.getEmpresa() + "- EMBRAER");
			System.out.println("");
			Trabalho.comentario_embraer();
		}else if(conversao_empresa == 2){
			System.out.println("A empresa selecionada foi: " + Trabalho.getEmpresa()  + "- GSW");
			System.out.println("");
			Trabalho.comentario_GSW();
		}
		
		System.out.println("");
		System.out.println("");
		
		if (conversao_profissao == 1) {
			System.out.println("A profiss�o selecionada foi: " + Trabalho.getProfiss�o() + " - DESENVOLVEDOR FULLSTACK");
			System.out.println("");
			Trabalho.comentario_profissao();
		}else if(conversao_profissao == 2) {
			System.out.println("A profiss�o selecionada foi: " + Trabalho.getProfiss�o() + " - ENGENHEIRO DE PRODU��O");
			System.out.println("");
			Trabalho.comentario_profissao_2();
		}
		
		System.out.println("");
		System.out.println("");
		
		if (conversao_anos >= 7) {
			System.out.println("A quantidade de anos trabalhadas nessa profiss�o foi: " + Trabalho.getAnos() + " ANOS");
			System.out.println("");
			Trabalho.comentario_anos_2();
		}else if(conversao_anos >= 4) {
			System.out.println("A quantidade de anos trabalhadas nessa profiss�o foi: " + Trabalho.getAnos() + " ANOS");
			System.out.println("");
			Trabalho.comentario_anos_3();
		}else {
			System.out.println("A quantidade de anos trabalhadas nessa profiss�o foi: " + Trabalho.getAnos() + " ANOS");
			System.out.println("");
			Trabalho.comentario_anos();
		}
	}
}
