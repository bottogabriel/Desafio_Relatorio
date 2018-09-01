package Class;

import java.util.ArrayList;

public class Relatorio {

	private ArrayList<Venda> vendas;

	private ArrayList<Cliente> clientes;

	private ArrayList<Vendedor> vendedores;

	private String maiorVenda;

	private String piorVendedor;

	public String getMaiorVenda() {
		return maiorVenda;
	}

	public void setMaiorVenda(String maiorVenda) {
		this.maiorVenda = maiorVenda;
	}

	public String getPiorVendedor() {
		return piorVendedor;
	}

	public void setPiorVendedor(String piorVendedor) {
		this.piorVendedor = piorVendedor;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	public void setVenda(ArrayList<Venda> venda) {
		this.vendas = venda;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedor(ArrayList<Vendedor> vendedores) {

		this.vendedores = vendedores;
	}

}
