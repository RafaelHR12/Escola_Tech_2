
public class Professor {

	String nome;
	String senha;
	String email;
	
	public boolean VerificaEmail (String email) {
		if(email.contains("@prof.escolatech.br"))
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