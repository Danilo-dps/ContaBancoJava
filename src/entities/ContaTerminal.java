package entities;

public class ContaTerminal {
	public int numero;
	public String agencia;
	public String nomeCliente;
	public double saldo;

	public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return nomeCliente
			+ ", obrigado por criar uma conta em nosso banco."
			+ "\n"
			+ "Agência: "			
			+ agencia
			+ "\n"
			+ "Conta: "			
			+ numero
			+ "\n"
			+ "Saldo: "			
			+ saldo;
	}
}