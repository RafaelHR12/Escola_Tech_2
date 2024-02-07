
public class Curso {

	//Atributos:
		String nomeCurso;
		String codigoCurso;
		String descricaoCurso;
		int cargaHorariaCurso;
		double valorCurso;
		
		String[][] nomeDisciplina;
		String[][] codigoDisc;
		String[][] descricaoDisc;
		int[][] cargaHorariaDisc;
	    double[][] valorDisc;
		
		//Métodos (funções):
		
		public String Retornar() {
			String dados = "Nome disc: "+nomeDisciplina+
					"\ncodigo disc: "+codigoDisc+
					"\ndescricaoDisc: "+descricaoDisc;
			return dados;
		}
}
