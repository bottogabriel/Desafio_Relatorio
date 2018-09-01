package Class;

import java.util.ArrayList;


public class Venda {

	//private String linha = "003";

	private String id;

	private ArrayList<Item> itens;

	private String vendedorName;

	public String getVendedorId() {
		return vendedorName;
	}

	public void setVendedorId(String vendedorId) {
		this.vendedorName = vendedorId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public String getLinha() {
		return "003";
	}
	
	public double totalVendaById(  ArrayList<Item> listItens)
	{
		double doubleTotal = 0;
		
		for (Item i : listItens)
		{
			doubleTotal+= i.getPreco() * i.getQuantidade();
		}
		
		return doubleTotal;
	}
	
	
	
	
}
