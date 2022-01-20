import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		/*Pode vir do banco de dados ou de qualquer fonte de dados*/
		List<Pessoa> pessoaList = PessoaMother.getPessoaList();
		
		File arquivo = new File("C:\\Systemas\\WorkSpace Eclipse\\Arquivos\\src\\\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();			
		}
		
		FileWriter escreveNoArquivo = new FileWriter(arquivo);
		
//		escreveNoArquivo.write("Meu primeiro arquivo escrito no Java");
//		escreveNoArquivo.flush();
//		escreveNoArquivo.close();
		
		
		for (Pessoa p : pessoaList) {
				escreveNoArquivo.write(p.getNome() +";"+ p.getEmail() +";"+  p.getIdade() + "\n");
		}
		escreveNoArquivo.flush();
		escreveNoArquivo.close();
		
		
		if(arquivo.exists()) {
			System.out.println("Arquivo gerado com sucesso!");			
		}

	}

}
