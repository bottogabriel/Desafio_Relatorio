package Class;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

	//private  String linha = "001";

	private String cpf;

	private String name;

	private double salary;
	
	private double totalVendas;

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	private List<Venda> vendas;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Venda> getVendas() {
		return this.vendas;
	}

	public void setVendas(List<Venda> venda) {
		this.vendas = venda;
	}

	public String getLinha() {
		return "001";
	}
	
	public double getTotalVenda(ArrayList<Venda> listVenda)
	{
		
		double doubleTotalVenda = 0;
		
		for (Venda v : listVenda)
		{
			if(this.name.equals(v.getVendedorId()))
			{
				doubleTotalVenda += v.totalVendaById(v.getItens());
				
			}
		}
		
		return doubleTotalVenda;
	
	}
	
	
	public double getTotalVendaByVendedor(ArrayList<Venda> listVenda, String vendedorName)
	{
		
		double doubleTotalVenda = 0;
		
		for (Venda v : listVenda)
		{
			if(vendedorName.equals(v.getVendedorId()))
			{
				doubleTotalVenda += v.totalVendaById(v.getItens());
				
			}
		}
		
		return doubleTotalVenda;
	
	}

}
