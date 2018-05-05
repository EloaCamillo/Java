package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import classes.Categoria;
import classes.ProdutoExportacao;
import classes.ProdutoMercadoInterno;

@ManagedBean
@SessionScoped

public class ProdBean {
	private ArrayList<ProdutoExportacao> produtos1 = new ArrayList<ProdutoExportacao>();
	private ArrayList<ProdutoMercadoInterno> produtos = new ArrayList<ProdutoMercadoInterno>();
	private ProdutoExportacao produtoSelecionado = new ProdutoExportacao();
	private ProdutoMercadoInterno produtoSelecionadoi = new ProdutoMercadoInterno();
	
	public void salvar(int e)
	{
		
		if(e==0) {
			//Exportado
			
			produtoSelecionado.setImposto(0.1);
			produtoSelecionado.setMoeda(0);
			
			produtos1.add(produtoSelecionado);
			produtoSelecionado = new ProdutoExportacao();
		}
		else 
		{
			produtoSelecionadoi.setImposto(0.3);
			produtoSelecionadoi.setMoeda(1);
			
			produtoSelecionadoi.setCodigo(produtoSelecionado.getCodigo());
			produtoSelecionadoi.setNome(produtoSelecionado.getNome());
			produtoSelecionadoi.setCategoria(produtoSelecionado.getCategoria());
			produtoSelecionadoi.setPreco(produtoSelecionado.getPreco());
			
			produtos.add(produtoSelecionadoi);
			produtoSelecionadoi = new ProdutoMercadoInterno();
			
		}
		
	}
	
	public void remover(ProdutoMercadoInterno pro)
	{
		produtos.remove(pro);
	}
	public void remover(ProdutoExportacao pro)
	{
		produtos1.remove(pro);
	}
	
	
	public void salvarCategoria(Categoria c)
	{
		produtoSelecionado.setCategoria(c);
		
	}
	
	public ArrayList<ProdutoExportacao> getProdutos1() {
		return produtos1;
	}




	public void setProdutos1(ArrayList<ProdutoExportacao> produtos1) {
		this.produtos1 = produtos1;
	}




	public ArrayList<ProdutoMercadoInterno> getProdutos() {
		return produtos;
	}




	public void setProdutos(ArrayList<ProdutoMercadoInterno> produtos) {
		this.produtos = produtos;
	}




	public ProdutoExportacao getProdutoSelecionado() {
		return produtoSelecionado;
	}




	public void setProdutoSelecionado(ProdutoExportacao produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}




	public ProdutoMercadoInterno getProdutoSelecionadoi() {
		return produtoSelecionadoi;
	}




	public void setProdutoSelecionadoi(ProdutoMercadoInterno produtoSelecionadoi) {
		this.produtoSelecionadoi = produtoSelecionadoi;
	}

}

