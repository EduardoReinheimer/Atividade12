package contaAvancada;

public class Conta {
	protected Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	protected Pessoa correntista;

	private void setBanco(Banco banco) {
		if (banco != null)
			this.banco = banco;
	}

	private void setAgencia(int agencia) {
		if (agencia > 0)
			this.agencia = agencia;
	}

	private void setNumeroDaConta(int numeroDaConta) {
		if (numeroDaConta > 0)
			this.numeroDaConta = numeroDaConta;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private void setCorrentista(Pessoa correntista) {
		if (correntista != null)
			this.correntista = correntista;
	}

	public Conta(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa correntista) {
		super();
		this.banco = banco;
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.correntista = correntista;
	}

}
