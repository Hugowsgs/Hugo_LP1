package pessoa;

public class Pessoa {
	
	//Atributos
	
	private String cabelo;
	private double altura;
	private double peso;
	
	//Métodos Get and Seters
	
	public String getCabelo() {
		return cabelo;
	}


	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	//Construtor
	
	public Pessoa(String cabelo, double altura, double peso) {
		super();
		this.cabelo = cabelo;
		this.altura = altura;
		this.peso = peso;
	}
	
	

	public void elogio (){
		System.out.println("QUE CABELOS LINDOS VOCÊ TEM!");
	}
	
	public void conselho() {
		System.out.println("TE ACONSELHO A FAZER UMA DIETA...");
	}
	
	public void conselho_2() {
		System.out.println("VOCÊ PRECISAR ENGORDAR!");
	}
	
	public void conselho_3() {
		System.out.println("VOCÊ ESTÁ NO PESO IDEAL!");
	}
	
	public void permissao() {
		System.out.println("LAMENTO VOCÊ NÃO TEM ALTURA PARA ESTE BRINQUEDO!");
	}
	
	public void permissao_2() {
		System.out.println("VOCÊ ESTÁ PERMITIDO A USAR ESTE BRINQUEDO!");
	}
	
	
	
	
}

