package classes;

public class Produto {
		private int codigo;
		private String nome;
		private Categoria categoria;
		private double preco;
		private int moeda;
		public int getMoeda() {
			return moeda;
		}
		public void setMoeda(int moeda) {
			this.moeda = moeda;
		}
		private double imposto;
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getImposto() {
			return imposto;
		}
		public void setImposto(double imposto) {
			this.imposto = imposto;
		}
		
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
	}



