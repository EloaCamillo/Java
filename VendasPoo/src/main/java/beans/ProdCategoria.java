package beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import classes.Categoria;


@ManagedBean
@SessionScoped
public class ProdCategoria {
	private Categoria produtoSelecionado = new Categoria();
	private ArrayList<Categoria> lista = new ArrayList<Categoria>();
	
	public void salvar()
	{
		
		lista.add(produtoSelecionado);
		produtoSelecionado = new Categoria() ;
	}
	
	
	 public void removerCategoria(Categoria categoria) {
    	 lista.remove(categoria);
    	 
     }


	public Categoria getProdutoSelecionado() {
		return produtoSelecionado;
	}


	public void setProdutoSelecionado(Categoria produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}


	public ArrayList<Categoria> getLista() {
		return lista;
	}


	public void setLista(ArrayList<Categoria> lista) {
		this.lista = lista;
	}
	
	

}
