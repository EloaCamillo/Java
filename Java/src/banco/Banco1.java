package banco;

import javax.swing.JOptionPane;

public class Banco1 {

	public static void main(String[] args) {
		Banco c1= new Banco();
		
		c1.setNumconta(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta")));
		c1.setTipo(JOptionPane.showInputDialog("Digite o tipo da conta"));
		c1.abrirconta(c1.getTipo());
	
		c1.setDono(JOptionPane.showInputDialog("Digite o nome do Dono"));
		c1.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite quanto vai depositar")));
		c1.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite quanto vai sacar")));
		c1.estadoAtual();
		c1.fecharconta();
		
		
		
			
			
			
			
		}
		

	}


