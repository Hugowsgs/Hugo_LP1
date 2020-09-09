package lugar;

public class Lugar {


	private double temperatura;
	private String turistico;
	private double habitantes;
	
	
	
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public String getTuristico() {
		return turistico;
	}
	public void setTuristico(String turistico) {
		this.turistico = turistico;
	}
	public double getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(double habitantes) {
		this.habitantes = habitantes;
	}
	
	

	public Lugar(double temperatura, String turistico, double habitantes) {
		super();
		this.temperatura = temperatura;
		this.turistico = turistico;
		this.habitantes = habitantes;
	}
	
	
	public void praia() {
		
		System.out.println("AS SUNGAS E MAIÔS JÁ ESTÃO NAS MALAS!!!");
	}
	
	public void montanha() {
		System.out.println("AS BOTAS DE NEVE JÁ ESTÃO LIMPAS!!!");
	}
	
	public void cidade() {
		System.out.println("PREPAREM OS SHORTS E OS GUARDA-CHUVAS!!!");
	}
	
	

}









