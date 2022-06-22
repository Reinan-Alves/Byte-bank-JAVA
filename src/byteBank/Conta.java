package byteBank;

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total =0;
	
	
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public Conta(int agencia,int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Foi criada a " + Conta.getTotal() + "º conta");
		
	}
	
	
	
	//Getter
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	
	//SETTER
	
		
		public void setTitular(Cliente titular){
			this.titular = titular;
		}
		
	
	
	
	
	public void deposita (double valor) {
		this.saldo += valor;
		
	}
	
	boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		
			
			return true;
		} else {
			System.out.println("FALHA NO PROCEDIMENTO! Saldo insuficiente");
			return false;
			
		}
	}
	
	
	public boolean transfere(double valor, Conta destino){
		if((this.saldo >= valor)) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}else {
			System.out.println("FALHA NO PROCEDIMENTO! não foi retirado nem adicionado valor na conta.");
			
		return false;
	}
   }
}
