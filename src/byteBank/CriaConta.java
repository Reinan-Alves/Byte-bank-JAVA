package byteBank;

public class CriaConta {

	public static void main(String[] args) {
			
	// cliente e conta do reinan	
	  Cliente reinan = new Cliente();
	  reinan.setNome("Reinan Alves");
	  reinan.setCpf("123456789");
	  reinan.setProfissao("Programador");
	  
	  Conta conta1 = new Conta(01,0101);
	  conta1.setTitular(reinan);
	
		
	  // cliente e conta da Maricreusa
	  
	  Cliente maricreusa = new Cliente();
	  maricreusa.setNome("Maricreusa Silva");
	  maricreusa.setCpf("987654321");
	  maricreusa.setProfissao("Dona de casa");
	  
	  Conta conta2 = new Conta(02,0202);
	  conta2.setTitular(maricreusa);
	  
	  
	  conta1.deposita(500);
	  conta2.deposita(1000);
	  
	  System.out.println("Saldo da conta 1: " + conta1.getSaldo());
	  System.out.println("Nome do titular da conta 2: " + conta2.getTitular().getNome());
	  System.out.println("Total de contas: " + Conta.getTotal());
	  
	  
	  
	  
	}
}
