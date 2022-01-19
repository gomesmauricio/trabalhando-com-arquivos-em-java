import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa p1 = new Pessoa();
		p1.setEmail("pessoa1@gmail.com");
		p1.setNome("Bob Brow");
		p1.setIdade(35);
		
		Pessoa p2 = new Pessoa();
		p2.setEmail("pessoa2@gmail.com");
		p2.setNome("Maria Pia");
		p2.setIdade(27);
		
		Pessoa p3 = new Pessoa();
		p3.setEmail("joao@gmail.com");
		p3.setNome("Joao Gomes");
		p3.setIdade(42);
		
		List<Pessoa> pessoaList = new ArrayList<Pessoa>();
		
		pessoaList.add(p1);
		pessoaList.add(p2);
		pessoaList.add(p3);
		
		File arquivo = new File("C:\\Systemas\\WorkSpace Eclipse\\Arquivos\\src\\\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();			
		}
		
		FileWriter escreveNoArquivo = new FileWriter(arquivo);
		
//		escreveNoArquivo.write("Meu primeiro arquivo escrito no Java");
//		escreveNoArquivo.flush();
//		escreveNoArquivo.close();
		
		
		for (Pessoa p : pessoaList) {
				escreveNoArquivo.write(p.getNome() +"; "+ p.getEmail() +"; "+  p.getIdade() + "\n");
		}
		escreveNoArquivo.flush();
		escreveNoArquivo.close();
		
		
		if(arquivo.exists()) {
			System.out.println("Arquivo gerado com sucesso!");			
		}

	}

}
