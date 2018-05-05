package classes;

import java.util.ArrayList;
import java.util.Date;



public class Pedido {
	private long numero;
	private Date data;
	private ArrayList<Itens> itens = new ArrayList<Itens>();
	private CadastroCliente  Cliente;
	
	public double totalPedido() {
		
		
		return 0;
	}
	public double totalImposto() {
		
		double soma = 0;
		
		for(Itens i: itens)
		{
			soma += i.getQuantidade() * (i.getProduto().getPreco() * i.getProduto().getImposto());
			
		}
		
		return soma;
	}
	public long getNumero() {
		
		return numero;
	}
	public void setNumero(long numero) {
		
		this.numero = numero;
	}
	public Date getData() {
		
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ArrayList<Itens> getItens() {
		
		return itens;
	}
	public void setItens(ArrayList<Itens> itens) {
		
		this.itens = itens;
	}
	public CadastroCliente getCliente() {
		
		return Cliente;
	}
	public void setCliente(CadastroCliente cliente) {
		
		Cliente = cliente;
	}
		

}
