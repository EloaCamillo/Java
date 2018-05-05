package beans;

import java.util.ArrayList;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import classes.CadastroCliente;
import classes.Itens;
import classes.Pedido;
import classes.ProdutoExportacao;
import classes.ProdutoMercadoInterno;

@ManagedBean
@SessionScoped
public class PedidoBean {
	private Date data;
	private Pedido pedidoselecionado = new Pedido();
	private ArrayList<Pedido> listap = new ArrayList<Pedido>();
	
	private Itens itemselecionado = new Itens();
	private ArrayList<Itens> listai = new ArrayList<Itens>();
	
	
	public void definircli(CadastroCliente auxc)
	{
		pedidoselecionado.setCliente(auxc);
	}
	
	public void removeit(Itens ite) {
		listai.remove(ite);
	}
	
	public void removerpedi(Pedido pedi) 
	{
		listap.remove(pedi);
		
		pedi.getCliente().getPedidos().remove(pedi);
		
	}
	
	public void salvarpedido() {
		try 
		{
			pedidoselecionado.setItens(listai);
			
			data = new Date ();
			pedidoselecionado.setData(data);
			
			pedidoselecionado.getCliente().getPedidos().add(pedidoselecionado);
			
			listap.add(pedidoselecionado);
			pedidoselecionado = new Pedido();
		}catch(Exception e)
		{
			System.out.println("ERRO");
		}
	}
	
	public void defpro(ProdutoExportacao proex)
	{		
		itemselecionado.setProduto(proex);
	}
	
	public void defpro(ProdutoMercadoInterno proex)
	{		
		itemselecionado.setProduto(proex);
	}
	
	public void salvaritem()
	{
		listai.add(itemselecionado);
		itemselecionado = new Itens();
	}
	
	
	public Pedido getPedidoselecionado() {
		return pedidoselecionado;
	}
	public void setPedidoselecionado(Pedido pedidoselecionado) {
		this.pedidoselecionado = pedidoselecionado;
	}
	public ArrayList<Pedido> getListap() {
		return listap;
	}
	public void setListap(ArrayList<Pedido> listap) {
		this.listap = listap;
	}
	public Itens getItemselecionado() {
		return itemselecionado;
	}
	public void setItemselecionado(Itens itemselecionado) {
		this.itemselecionado = itemselecionado;
	}
	public ArrayList<Itens> getListai() {
		return listai;
	}
	public void setListai(ArrayList<Itens> listai) {
		this.listai = listai;
	}

}
