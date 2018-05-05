package classes;

public class Itens 
{
	private int numero;
	private int quantidade;
	private Produto produto;
	
	public double totalItem()
	{
		return quantidade*produto.getPreco(); 
		
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Produto getProduto() {
		return produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
