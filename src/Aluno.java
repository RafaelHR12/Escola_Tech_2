
public class Aluno {

	//Atributos:
		String nome;
		String senha;
		String email; //@
		String serie;

		//Métodos (funções):
		
		public boolean VerificaEmail (String email) {
			if(email.contains("@estudante.escolatech.br"))
				this.email = email;
			else
				return false;
			return true;
		}
		
		public boolean VerificaSenha(String senha) {
			
			if ( senha.length() >= 6 ) {
				if ( senha.matches("[a-zA-Z0-9]+") ) { // No MÍNIMO uma
					this.senha = senha;
				} else {
					return false;
				}
			} else {
				return false;
			}
			return true;
			
		}
}
