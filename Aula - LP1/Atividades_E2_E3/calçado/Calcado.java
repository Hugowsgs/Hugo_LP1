package calçado;

public class Calcado {
	
	private String genero;
	private String tipo;
	private String cor;
	
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public Calcado(String genero, String tipo, String cor) {
		super();
		this.genero = genero;
		this.tipo = tipo;
		this.cor = cor;
	}
	
	
	public void promocoes_masc() {
		System.out.println("ESTAMOS COM ÓTIMAS PROMOÇÕES EM CALÇADOS MASCULINOS!");
	}
	
	public void promocoes_fem() {
		System.out.println("VOCÊ VAI ADORAR OS NOVOS SALTOS VERMELHOS QUE CHEGARAM!");
	}
	
	public void comentario() {
		System.out.println("VOCÊ VAI ADORAR OS NOVOS MODELOS QUE CHEGARAM!");
	}
	
	public void comentario_2() {
		System.out.println("ESSA COR VAI VAI SE DESTACAR NO SEU LOOK!");
	}
	

	
	
}


