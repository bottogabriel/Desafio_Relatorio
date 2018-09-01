package Process;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


import Class.Cliente;

import Class.Venda;
import Class.Vendedor;

public class ProcessFile {

	public String processaArquivo(String strFileIn, String strFileNameIn,
			String strPathOut) throws IOException {
		{
			Cliente cliente = new Cliente();
			Venda venda = new Venda();
			Vendedor vendedor = new Vendedor();
			ProcessRelatorio processRelatorio = new ProcessRelatorio();
			ProcessLine processLine = new ProcessLine();
			ArrayList<Vendedor> listVendedor = new ArrayList<Vendedor>();
			ArrayList<Cliente> listCliente = new ArrayList<Cliente>();
			ArrayList<Venda>   listVenda = new ArrayList<Venda>();
			
			
			String strLinhaID = "";
			String strLine;
			String strFileNameOut = strFileNameIn.replace(" ", "_");
			strFileNameOut =strPathOut + strFileNameOut.replace(".dat", ".done.dat");

			FileInputStream fstream = new FileInputStream(strFileIn + "/"
					+ strFileNameIn);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					fstream));

		
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// temp.add(strLine);
				strLinhaID = strLine.substring(0, 3);
				if (strLinhaID.equals(cliente.getLinha())) {
					listCliente.add( processLine.returnCliente(strLine));
				} else if (strLinhaID.equals(venda.getLinha())) {
					listVenda.add( processLine.returnVenda(strLine));
				} else if (strLinhaID.equals(vendedor.getLinha())) {
					listVendedor.add(processLine.returnVendedor(strLine));
					
					
				} else {

				}
			}
			
			processRelatorio.calculaRelatio(listVendedor, listCliente, listVenda, strFileNameOut);
			
			return strFileNameOut;
		}

	}

	public String routingLine(String strLine) {
		return "stringFileNameOut";
	}

}
