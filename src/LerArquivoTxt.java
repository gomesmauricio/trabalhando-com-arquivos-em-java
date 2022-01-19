import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream introArquivo = 
				new FileInputStream(new File("C:\\Systemas\\WorkSpace Eclipse\\Arquivos\\src\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(introArquivo, "UTF-8");
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
			
		}
	}

}
