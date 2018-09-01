package Process;


import java.util.ArrayList;


import Class.*;

public class ProcessLine {

	// Example 003�08�[1-34-10,2-33-1.50,3-40-0.10]�Renato
	public Venda returnVenda(String strLine) {
		String[] strList = strLine.split("�", 4);

		Venda venda = new Venda();
		try {
			venda.setId(strList[1]);
			venda.setItens(returnItemList(strList[2]));
			venda.setVendedorId(strList[3]);

		} catch (Exception ee) {
			System.out.println("Erro processando Item " + strLine);
		}
		return venda;
	}

	// Example 001�1234567891234�Diego�50000
	public Vendedor returnVendedor(String strLine) {

		String[] strList = strLine.split("�", 3);

		Vendedor vendedor = new Vendedor();

		try {
			vendedor.setCpf(strList[1]);
			vendedor.setName(strList[2].substring(0,
					strList[2].lastIndexOf("�")));
			vendedor.setSalary(Double.parseDouble(strList[2]
					.substring(strList[2].lastIndexOf("�") + 1)));

		} catch (Exception ee) {

			System.out.println("Erro processando Vendedor " + strLine);

		}
		return vendedor;
	}

	// Example 002�2345675434544345�Jose da Silva�Rural
	public Cliente returnCliente(String strLine) {
		String[] strList = strLine.split("�", 3);

		Cliente cliente = new Cliente();
		try {

			cliente.setCnpj(strList[1]);
			cliente.setName(strList[2].substring(0, strList[2].lastIndexOf("�")));
			cliente.setBussinessArea(strList[2].substring(strList[2]
					.lastIndexOf("�") + 1));

		} catch (Exception ee) {

			System.out.println("Erro processando Cliente " + strLine);

		}
		return cliente;
	}

	public ArrayList<Item> returnItemList(String strSubLine) {

		ArrayList<Item> itemList = new ArrayList<Item>() ;

		try {
			String strTemp = strSubLine.replace("[", "");
			strSubLine = strTemp.replace("]", "");
			String[] strItens = strSubLine.split(",");
			for (int i = 0; i < strItens.length; i++) {
				itemList.add(returnItem(strItens[i]));
			}
		} catch (Exception ee) {

			System.out.println("Erro processando Vendedor " + strSubLine);

		}
		return itemList;

	}

	public Item returnItem(String strSubItem) {
		Item item = new Item();
		try {
			String[] strList = strSubItem.split("-");
			item.setId(strList[0]);
			item.setQuantidade(Integer.parseInt(strList[1]));
			item.setPreco(Double.parseDouble(strList[2]));
		} catch (Exception ee) {

			System.out.println("Erro processanto Item " + strSubItem);
		}

		return item;

	}
}
