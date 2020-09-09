package calçado;

import javax.swing.JOptionPane;


public class Metodos_calcados {

	
	public static void main(String[] args) {
		
		Calcado Vendedora = new Calcado (JOptionPane.showInputDialog("Digite 1 - Masculino / 2 - Feminino"), JOptionPane.showInputDialog("Digite o tipo de calçado que deseja: "), JOptionPane.showInputDialog("Digite a cor desejada do calçado"));
		
		
int conversao_genero = Integer.parseInt(Vendedora.getGenero());



		Vendedora.getGenero();
		Vendedora.getCor();
		Vendedora.getTipo();

		
		if (conversao_genero == 1) {
			System.out.println("O gênero do calçado escolhido foi: Masculino");
			Vendedora.promocoes_masc();
		}else if (conversao_genero == 2) {
			System.out.println("O gênero do calçado escolhido foi: Feminino");
			Vendedora.promocoes_fem();
		}else {
			return;
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("O tipo de calçado escolhido foi: " + Vendedora.getTipo());
		Vendedora.comentario();
		
		System.out.println("");
		System.out.println("");

		System.out.println("A cor escolhida do calçado é: " + Vendedora.getCor());
		Vendedora.comentario_2();
		
		
		
		
		
	
		
	}
}
