package musical;

public class Musical {

		private String nome;
		private String instrumento;
		private String id;
	
		
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome= nome;
		}
		public String getInstrumento() {
			return instrumento;
		}
		public void setInstrumento(String instrumento) {
			this.instrumento = instrumento;
		}
		public String getId() {
			return id;
		}
		public void setId (String id) {
			this.id = id;
		}
		
		
		public Musical(String nome, String instrumento, String ritmo, String id) {
			this.nome = nome;
			this.instrumento = instrumento;
			this.id=id;
		}
		
		

	
	
		public Musical() {
			// TODO Auto-generated constructor stub
		}
		public Musical(String text, String text2) {
			// TODO Auto-generated constructor stub
		}
		public void missa_comentario() {
			System.out.println("O PADRE ADORA OS SONS DESTES INSTRUMENTOS!");
		}
		
		public void missa_comentario_2() {
			System.out.println("TALVEZ A BANDA JÁ TENHA ESTE TIPO DE INSTRUMENTO!");
		}
		
		public void missa_comentario_3() {
			System.out.println("PARA ESSA MISSA, ESTES INSTRUMENTOS ESTÃO CANCELADOS!");
		}
		
		
		public void missa_comentario_4() {
			System.out.println("VOCÊ SABE TOCAR MUITO BEM ESTE INSTRUMENTO!");
		}
		
		public void missa_comentario_5() {
			System.out.println("ESTE RITMO FICARÁ LINDO NA MÚSICA DE ENCERRAMENTO!");
		}
		
		public void missa_comentario_6() {
			System.out.println("EM HIPÓTESE ALGUMA DEVEMOS TOCAR NESTE RITMO !");
		}
		
		public void missa_comentario_7() {
			System.out.println("TALVEZ É INTERESSANTE CONVERSAR COM O PADRE SOBRE ESTE RITMO!");
		}
		
		
}
