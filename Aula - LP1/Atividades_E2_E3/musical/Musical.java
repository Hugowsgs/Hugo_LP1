package musical;

public class Musical {

		private String tipo_instrumento;
		private String instrumento;
		private String ritmo;
		
		
		
		public String getTipo_instrumento() {
			return tipo_instrumento;
		}
		public void setTipo_instrumento(String tipo_instrumento) {
			this.tipo_instrumento = tipo_instrumento;
		}
		public String getInstrumento() {
			return instrumento;
		}
		public void setInstrumento(String instrumento) {
			this.instrumento = instrumento;
		}
		public String getRitmo() {
			return ritmo;
		}
		public void setRitmo(String ritmo) {
			this.ritmo = ritmo;
		}
		
		
		public Musical(String tipo_instrumento, String instrumento, String ritmo) {
			super();
			this.tipo_instrumento = tipo_instrumento;
			this.instrumento = instrumento;
			this.ritmo = ritmo;
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
			System.out.println("EM HIPÓTESE ALGUMA DEVEMOS TOCAR ESTE RITMO !");
		}
		
		public void missa_comentario_7() {
			System.out.println("TALVEZ É INTERESSANTE CONVERSAR COM O PADRE SOBRE ESTE RITMO!");
		}
		
		
}
