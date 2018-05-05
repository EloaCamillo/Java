package projetopessoa;

public class ProjetoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Pessoa p1= new Pessoa();
     Funcionario f1 = new Funcionario();
     Aluno a1= new Aluno();
     Professor p = new Professor();
     
     p1.setNome("Pedro");
     f1.setNome("Clara");
     a1.setNome("Ester");
     p.setNome("Coraline");
     
     p1.setSexo("Feminino");
     a1.setSexo("M");
     p.setIdade(50);
    a1.setCurso("Enfermagem");
    p.setSalario(1000);
    f1.setSetor("Estoque");
    
    p.receberaumento(400);
     
     System.out.println(p1.toString());
     System.out.println(f1.toString());
     System.out.println(a1.toString());
     System.out.println(p.toString());
     
	}

}
