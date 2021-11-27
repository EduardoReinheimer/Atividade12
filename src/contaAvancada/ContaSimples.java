package contaAvancada;

public class ContaSimples extends ContaBancaria {
	private double saldoPoupanca;

	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			this.saldoPoupanca += valor;
			return true;
		}
		return false;
	}

	public boolean saquePoupanca(double valor) {
		if (valor > 0 & valor <= saldoPoupanca) {
			this.saldoPoupanca -= valor;
			return true;
		}
		return false;
	}

	public ContaSimples(Banco banco, int agencia, int numeroDaConta, Pessoa correntista) {
		super(banco, agencia, numeroDaConta, correntista);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	

}
