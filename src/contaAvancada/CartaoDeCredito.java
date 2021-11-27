package contaAvancada;

public class CartaoDeCredito {
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCartao;

	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero > 0)
			this.numero = numero;
	}

	private String getOperadora() {
		return operadora;
	}

	private void setOperadora(String operadora) {
		if (operadora != null)
			this.operadora = operadora;
	}

	private double getLimite() {
		return limite;
	}

	private void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}

	private String getTipoDeCartao() {
		return tipoDeCartao;
	}

	private void setTipoDeCartao(String tipoDeCartao) {
		if (tipoDeCartao != null)
			this.tipoDeCartao = tipoDeCartao;
	}

	public CartaoDeCredito(int numero, String operadora, double limite, String tipoDeCartao) {
		super();
		setNumero(numero);
		setOperadora(operadora);
		setLimite(limite);
		setTipoDeCartao(tipoDeCartao);
	}

}
