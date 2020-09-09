package fatec;

public class Fatec {
	
	private String curso;
	private String escola;
	private double media;
	
	
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	

	public Fatec(String curso, String escola, double media) {
		super();
		this.curso = curso;
		this.escola = escola;
		this.media = media;
	}
	
	public void comentario() {
		System.out.println("IMAGINO QUE SEJA DIFÍCIL ESTE CURSO!");
	}
	
	public void comentario_2() {
		System.out.println("ME DISSERAM QUE ESSA ESCOLA É MUITO BOA!");
	}
	
	public void comentario_3() {
		System.out.println("VOCÊ ESTÁ COM EXCELENTE MEDIA!");
	}
	
	public void comentario_4() {
		System.out.println("VOCÊ ESTÁ NA MÉDIA...");
	}
	
	public void comentario_5() {
		System.out.println("VOCÊ PRECISA COMEÇAR A ESTUDAR!");
	}
	
	
	
	
}


