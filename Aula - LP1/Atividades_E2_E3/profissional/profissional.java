package profissional;

public class profissional {

	private String profissao;
	private String anos;
	private String empresa;
	
	
	public String getProfiss�o() {
		return profissao;
	}
	public void setProfissao(String profiss�o) {
		this.profissao = profiss�o;
	}
	public String getAnos() {
		return anos;
	}
	public void setAnos(String anos) {
		this.anos = anos;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	public profissional(String profissao, String anos, String empresa) {
		super();
		this.profissao = profissao;
		this.anos = anos;
		this.empresa = empresa;
	}
	
	public void comentario_embraer() {
		System.out.println("NOSSA, EU SOUBE QUE ESTA EMPRESA ESTA DEMITINDO...");
	}
	
	public void comentario_GSW() {
		System.out.println("NOSSA, ESSA EMPRESA DE TECNOLOGIA � FENOMENAL!");
	}
	
	public void comentario_anos() {
		System.out.println("ENT�O, VOCE FOI RECENTEMENTE CONTRATADO!");
	}
	
	public void comentario_anos_2() {
		System.out.println("FAZ MUITO TEMPO QUE TRABALHA POR L�!");
	}
	
	public void comentario_anos_3() {
		System.out.println("J� TEM UM TEMPO QUE EST� L�!");
	}
	
	public void comentario_profissao() {
		System.out.println("ESSA PROFISS�O EST� COM TEND�NCIA NO MERCADO!");
	}
	
	public void comentario_profissao_2() {
		System.out.println("N�O ACHA QUE ESSA PROFISS�O EST� DEFASADA NO MERCADO?!");
	}
	
	
	

	
}


