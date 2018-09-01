package Process;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Class.Cliente;
import Class.Relatorio;
import Class.Venda;
import Class.Vendedor;

public class ProcessRelatorio {

	public String calculaRelatio(ArrayList<Vendedor> listVendedor,
			ArrayList<Cliente> listCliente, ArrayList<Venda> listVenda,
			String strFileNameOut) {
		Relatorio relatorio = new Relatorio();
		relatorio.setClientes(listCliente);
		relatorio.setVenda(listVenda);
		relatorio.setVendedor(listVendedor);
		String strLine = "";

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(strFileNameOut));
			strLine = relatorio.getClientes().size() + "ç"
					+ relatorio.getVendedores().size() + "ç"
					+ calculaValMaiorVendaReturnID(listVenda)+ "ç"
					+ getPiorVendendor(listVenda,listVendedor);

			pw.println(strLine);
			
			strLine = "Tamanho do Relatório: "+relatorio.getClientes().size() + " Numero de vendedores: "
					+ relatorio.getVendedores().size() + " Valor Maior venda: "
					+ calculaValMaiorVendaReturnID(listVenda)+ " Pior Vendedor: "
					+ getPiorVendendor(listVenda,listVendedor);
			
			pw.println(strLine);
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao gerar o relatorio");
		}

		return "";
	}

	public String getPiorVendendor(ArrayList<Venda> listVenda,
			ArrayList<Vendedor> listVendedor) {
		
	
		String strNamePiorVendedor = "";
		double doublePiorVendedorValor = 0;

		for (Vendedor v : listVendedor) {
			if (doublePiorVendedorValor == 0) {
				doublePiorVendedorValor = v.getTotalVendaByVendedor(listVenda,v.getName());
				strNamePiorVendedor = v.getName();
			} else if (v.getTotalVendaByVendedor(listVenda,v.getName()) <  doublePiorVendedorValor ) {
				doublePiorVendedorValor = v.getTotalVendaByVendedor(listVenda,v.getName());
				strNamePiorVendedor = v.getName();
			}

		}

		return strNamePiorVendedor;
	}

	public String calculaValMaiorVendaReturnID(ArrayList<Venda> listVenda) {
		String strIdVenda = "";
		double doubleTotalVenda = 0;

		for (Venda v : listVenda) {
			if (doubleTotalVenda < v.totalVendaById(v.getItens())) {
				doubleTotalVenda = v.totalVendaById(v.getItens());
				strIdVenda = v.getId();
			}

		}

		return strIdVenda;
	}

}
