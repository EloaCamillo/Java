package banco;

public class Banco {
 public int numconta;
 private String Dono;
 protected String tipo;
 private double saldo;
 private boolean status;
 
 public Banco(){
	 status=false;
	 saldo=0;
	 
 }
 public void estadoAtual() {
	 System.out.println("Conta " + this.getNumconta());
	 System.out.println("Tipo "+this.getTipo());
	 System.out.println("Dono "+this.getDono());
	 System.out.println("Saldo "+this.getSaldo());
	 System.out.println("Status "+this.isStatus());
 }
public int getNumconta() {
	return numconta;
}
public void setNumconta(int numconta) {
	this.numconta = numconta;
}
public String getDono() {
	return Dono;
}
public void setDono(String dono) {
	Dono = dono;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	
	this.tipo = tipo;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}

public void abrirconta(String tipo) {
	
	this.setStatus(true);
	
	
	if("cc".equals(getTipo())) {
		this.setSaldo(50);
		
	}
	
	else if("cp".equals(getTipo())) {
		this.setSaldo(150);
	}
	
}
public void fecharconta() {
	if(getSaldo()==0) {
		System.out.println("Conta fechada com exito");
	}else {
		System.out.println("Erro");
	}
}

public void sacar(double saque) {
	if(this.isStatus()) {
		if(getSaldo()>=saque) {
		this.setSaldo(getSaldo()-saque);
		System.out.println("Saque realizado na conta "+this.getDono());
			
		}else {
			System.out.println("Saldo Insuficiente");
		}
		
	}
	
}
public void depositar(double valor) {
	if(this.isStatus()) 
		this.setSaldo(getSaldo()+valor);
	else {
		System.out.println("Erro no depósito-conta closer");
		
	}
}
public void pagarmensal() {
	if(getTipo()=="cc") {
		this.setSaldo(getSaldo()-12);
		
	}
	if(getTipo()=="cp")
	{
		this.setSaldo(getSaldo()-20);
	}
}

	
}
