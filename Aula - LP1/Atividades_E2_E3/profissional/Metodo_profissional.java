package profissional;

import javax.swing.JOptionPane;

public class Metodo_profissional {

	public static void main(String[] args) {
		
		profissional Trabalho = new profissional (JOptionPane.showInputDialog("Digite o número correspondente a profissão exercida (1 - Desenvolvedor FullStack / 2 - Engenheiro de produção"), JOptionPane.showInputDialog("Digite a quantidade de anos que exerceu/exerce a profissão: "), JOptionPane.showInputDialog("Digite o número conforme a empresa que trabalha (1 - Embraer / 2 - GSW"));
		
		
		Trabalho.getProfissão();
		Trabalho.getAnos();
		Trabalho.getEmpresa();
		
		int conversao_profissao = Integer.parseInt(Trabalho.getProfissão());
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
			System.out.println("A profissão selecionada foi: " + Trabalho.getProfissão() + " - DESENVOLVEDOR FULLSTACK");
			System.out.println("");
			Trabalho.comentario_profissao();
		}else if(conversao_profissao == 2) {
			System.out.println("A profissão selecionada foi: " + Trabalho.getProfissão() + " - ENGENHEIRO DE PRODUÇÃO");
			System.out.println("");
			Trabalho.comentario_profissao_2();
		}
		
		System.out.println("");
		System.out.println("");
		
		if (conversao_anos >= 7) {
			System.out.println("A quantidade de anos trabalhadas nessa profissão foi: " + Trabalho.getAnos() + " ANOS");
			System.out.println("");
			Trabalho.comentario_anos_2();
		}else if(conversao_anos >= 4) {
			System.out.println("A quantidade de anos trabalhadas nessa profissão foi: " + Trabalho.getAnos() + " ANOS");
			System.out.println("");
			Trabalho.comentario_anos_3();
		}else {
			System.out.println("A quantidade de anos trabalhadas nessa profissão foi: " + Trabalho.getAnos() + " ANOS");
			System.out.println("");
			Trabalho.comentario_anos();
		}
	}
}
