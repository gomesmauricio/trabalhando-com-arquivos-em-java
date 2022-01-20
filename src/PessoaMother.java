import java.util.ArrayList;
import java.util.List;

public class PessoaMother {
	
	public static List<Pessoa> getPessoaList() {
		List<Pessoa> pessoaLista = new ArrayList<Pessoa>();
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Alex Ejidio");
		pessoa.setEmail("alex@gmail.com");
		pessoa.setIdade(35);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Ana Julia");
		pessoa2.setEmail("ana@gmail.com");
		pessoa2.setIdade(25);
		
		Pessoa pessoa3 = new Pessoa();
		
		pessoa3.setNome("Maria Pia");
		pessoa3.setEmail("maria@gmail.com");
		pessoa3.setIdade(23);
		
		Pessoa pessoa4 = new Pessoa();
		
		pessoa4.setNome("Bob Brow");
		pessoa4.setEmail("bob@hotmail.com");
		pessoa4.setIdade(34);

		Pessoa pessoa5 = new Pessoa();
		pessoa5.setNome("Eloisa Mariana");
		pessoa5.setEmail("elo.mari@hotmail.com");
		pessoa5.setIdade(26);
		
		
		pessoaLista.add(pessoa);
		pessoaLista.add(pessoa2);
		pessoaLista.add(pessoa3);
		pessoaLista.add(pessoa4);
		pessoaLista.add(pessoa5);
		
		return pessoaLista;
	}

}
