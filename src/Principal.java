import java.util.Scanner;

public class Principal {

public static void main (String[] args ) {
		
		Scanner teclado = new Scanner (System.in);
		
		//Criar um objeto da classe Aluno:
		Aluno aluno = new Aluno();
		
		System.out.println( "\n Informe o nome do aluno: " );
		aluno.nome = teclado.nextLine();
		
		System.out.println( " Informe a senha: " );
		// aluno1.senha = teclado.nextLine();
		
		while (!aluno.VerificaSenha(teclado.nextLine())) {
			System.out.println( " Informe a Senha novamnete: " );
		}
		
		System.out.println( " Informe o E-mail: " );
		// aluno1.email = teclado.nextLine();

		while (!aluno.VerificaEmail(teclado.nextLine())) {
			System.out.println( " Informe o E-mail novamente: " );
		}
		
		
		
		//Criar um objeto da classe Professor:
		Professor professor = new Professor();
		
		System.out.println( "\n Informe o nome do professor: " );
		professor.nome = teclado.nextLine();
		
		System.out.println( " Informe a senha: " );
		// professor.senha = teclado.nextLine();
		
		while (!professor.VerificaSenha(teclado.nextLine())) {
			System.out.println( " Informe a Senha novamnete: " );
		}
		
		System.out.println( " Informe o E-mail: " );
		// professor.email = teclado.nextLine();

		while (!professor.VerificaEmail(teclado.nextLine())) {
			System.out.println( " Informe o E-mail novamente: " );
		}
		
		
		
		
		
		//Criar um objeto da classe Curso:
		Curso curso = new Curso();
		
		System.out.println( "Informe o nome do curso: ");
		curso.nomeCurso = teclado.nextLine();
		
		System.out.println( "Informe o código do curso: ");
		curso.codigoCurso = teclado.nextLine();
		
		System.out.println( "Informe a descrição do curso: ");
		curso.descricaoCurso = teclado.nextLine();
		
		System.out.println( "Informe a carga horária mínima do curso (horas): ");
		curso.cargaHorariaCurso = teclado.nextInt();
		
		
		String[][] listaCursos = new String[2][5];
		
		for (int l = 0; l < listaCursos.length; l++) {
			for (int c = 0; c < listaCursos.length; c++) {
				System.out.println( "Informe o nome da disciplina: ");
				curso.nomeDisciplina[l][c] = teclado.nextLine();
				
				System.out.println( "Informe o código da disciplina: ");
				curso.codigoDisc[l][c] = teclado.nextLine();
				
				System.out.println( "Informe a descrição da disciplina: ");
				curso.descricaoDisc[l][c] = teclado.nextLine();
				
				System.out.println( "Informe a carga horária da disciplina (horas): ");
				curso.cargaHorariaDisc[l][c] = teclado.nextInt();
				
				System.out.println( "Informe o valor da disciplina: ");
				curso.valorDisc[l][c] = teclado.nextDouble();
				
				
				curso.valorCurso += curso.valorDisc[l][c];
			}
		}
		
		for (int l = 0; l < listaCursos.length; l++) {
			System.out.println(curso.Retornar());
		}
		
	}

}
