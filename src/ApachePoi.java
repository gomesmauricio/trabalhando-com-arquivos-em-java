import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {
		
		File  file = new File("C:\\Systemas\\WorkSpace Eclipse\\Arquivos\\src\\arquivo_xls.xls");
		
		if (!file.exists()) {
			file.createNewFile();			
		}
		 
		List<Pessoa> listPessoa = PessoaMother.getPessoaList();
		
		
		HSSFWorkbook workBook = new HSSFWorkbook(); /* Vai ser usado para escrever a planiha*/
		HSSFSheet linhaPessoa = workBook.createSheet("Planilha de Pessoas"); /*Criar a planilha*/
		
		int numeroLinha = 0;
		
		for (Pessoa p : listPessoa) {
			Row linha = linhaPessoa.createRow(numeroLinha ++); /*Criando a linha na planilha */
			
			int coluna = 0;
				
			Cell cellNome = linha.createCell(coluna ++);
			cellNome.setCellValue(p.getNome());
			
			Cell cellEmail = linha.createCell(coluna ++);
			cellEmail.setCellValue(p.getEmail());
			
			Cell cellIdade = linha.createCell(coluna ++);
			cellIdade.setCellValue(p.getIdade());
						
		}/*Termonou de montar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		workBook.write(saida);/*Escreve a planilha em arquivo */
		saida.flush();
		saida.close();
		
		System.out.println("Planilha gerada com suceso");
	}

}
