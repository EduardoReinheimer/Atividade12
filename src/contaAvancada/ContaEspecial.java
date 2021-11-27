package contaAvancada;

public class ContaEspecial extends ContaBancaria {
	private int diasSemJuros;
	private double limite;
	protected CartaoDeCredito cartao;

	private int getDiasSemJuros() {
		return diasSemJuros;
	}

	private void setDiasSemJuros(int diasSemJuros) {
		if (diasSemJuros > 0)
			this.diasSemJuros = diasSemJuros;
	}

	private double getLimite() {
		return limite;
	}

	private void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}

	private CartaoDeCredito getCartao() {
		return cartao;
	}

	private void setCartao(CartaoDeCredito cartao) {
		if (cartao != null)
			this.cartao = cartao;
	}

	public ContaEspecial(Banco banco, int agencia, int numeroDaConta, Pessoa correntista, int diasSemJuros,
			double limite, CartaoDeCredito cartao) {
		super(banco, agencia, numeroDaConta, correntista);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
		setCartao(cartao);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	

}
