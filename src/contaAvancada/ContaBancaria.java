package contaAvancada;

public class ContaBancaria {
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

	private void setCorrentista(Pessoa correntista) {
		if (correntista != null)
			this.correntista = correntista;
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}

	public boolean saque(double valor) {
		if (valor > 0 & valor <= saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public ContaBancaria(Banco banco, int agencia, int numeroDaConta, Pessoa correntista) {
		super();
		setBanco(banco);
		setAgencia(agencia);
		setNumeroDaConta(numeroDaConta);
		setCorrentista(correntista);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}

}
