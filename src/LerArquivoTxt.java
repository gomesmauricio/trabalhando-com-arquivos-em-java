import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream introArquivo = 
				new FileInputStream(new File("C:\\Systemas\\WorkSpace Eclipse\\Arquivos\\src\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(introArquivo, "UTF-8");
		
		List<Pessoa> pessoasList = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				
				String[] dados = linha.split("\\;");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoasList.add(pessoa);		
			}
			
		}
		for (Pessoa pessoa : pessoasList) { /* Poderia gravar no banco ou enviar email ou fazer qulquer outra coisa */
			System.out.println(pessoa);			
		}
			
	}

}
