package lugar;
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Lugar Praia=new Lugar(38.5,"Sem pontos turísticos",213.255);
		Litoral Litorais=new Litoral(JOptionPane.showInputDialog("Digite seu litoral preferido:"));
		
		Praia.getHabitantes();
		Praia.getTemperatura();
		Praia.getTuristico();
		Praia.praia();
		
		System.out.println("\n" + "Litoral preferido: " + Litorais.getLitoral());
		System.out.println("Habitantes: " + Praia.getHabitantes());
		System.out.println("Temperatura local: " + Praia.getTemperatura());
		System.out.println("Pontos Turísticos: " + Praia.getTuristico());
		
		
		
		Lugar[] novosLugar = new Lugar[5];
		novosLugar [0] = new Lugar(15.3,"Há pontos turísticos.", 52.360);
		novosLugar [1] = new Lugar(37.3,"Há pontos turísticos.", 86.392);
		novosLugar [2] = new Lugar(-6.5,"Sem pontos turísticos.", 731.545);
		novosLugar [3] = new Lugar(20.4,"Há pontos turísticos.", 533.501);
		novosLugar [4] = new Lugar(45.7,"Há pontos turísticos.", 31);
			
			System.out.println("");
			System.out.println("");
			Praia.montanha();
			System.out.println("");
			System.out.println("");
			System.out.println("\nCampos do Jordão: " + " " + novosLugar[0].getHabitantes() + " " + "habitantes" + "  " + novosLugar[0].getTemperatura() + " " + "Celsius" + " " + "-" + "  " + novosLugar[0].getTuristico());
			System.out.println("\nAlaska: " + " " + novosLugar[2].getHabitantes() + " " + "habitantes" + "  " + novosLugar[2].getTemperatura() + " " + "Celsius" + " " + "-" + "  " + novosLugar[2].getTuristico());
			System.out.println("");
			System.out.println("");
			Praia.cidade();
			System.out.println("");
			System.out.println("");
			System.out.println("\nUbatuba: " + " " + novosLugar[1].getHabitantes() + " " + "habitantes" + "  " + novosLugar[1].getTemperatura() + " " + "Celsius" + " " + "-" + "  " + novosLugar[1].getTuristico());
			System.out.println("\nSão Paulo: " + " " + novosLugar[3].getHabitantes() + " " + "habitantes" + "  " + novosLugar[3].getTemperatura() + " " + "Celsius" + " " + "-" + "  " + novosLugar[3].getTuristico());
			System.out.println("\nVale da Morte: " + " " + novosLugar[4].getHabitantes() + " " + "habitantes" + "  " + novosLugar[4].getTemperatura() + " " + "Celsius" + " " + "-" + "  " + novosLugar[4].getTuristico());
			
		}	
	}
	

	

