package beans;

import java.util.ArrayList;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import classes.CadastroCliente;
import classes.Pedido;



@ManagedBean
@SessionScoped

public class CadastroPessoa {
	
	private CadastroCliente pessoaSelecionada = new CadastroCliente();
	private ArrayList<CadastroCliente> lista = new ArrayList<CadastroCliente>();
	
	
	public void salvar()
	{
		lista.add(pessoaSelecionada);
		pessoaSelecionada = new CadastroCliente() ;
		}
	
     public void removerCliente(CadastroCliente cliente) {
    	 lista.remove(cliente);
    	 
     }
	
	
	public CadastroCliente getPessoaSelecionada() {
		return pessoaSelecionada;
	}

	public void setPessoaSelecionada(CadastroCliente pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
	}

	public ArrayList<CadastroCliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<CadastroCliente> lista) {
		this.lista = lista;
	}

}
