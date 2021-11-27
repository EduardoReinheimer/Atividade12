package contaAvancada;

public class Main {

	public static void main(String[] args) {
		CartaoDeCredito cartao = new CartaoDeCredito(123, "Visa", 3000.00, "Crédito");
		System.out.println(cartao);
		Banco russonesco = new Banco(71, "Russonesco", 32);
		Pessoa pessoa = new Pessoa("Dimitri", "Siberia");
		ContaEspecial ce = new ContaEspecial(russonesco, 0341, 8875, pessoa, 5, 5000, cartao);
		System.out.println(ce);
		ContaSimples cs = new ContaSimples(russonesco, 0341, 8875, pessoa);
		cs.depositoPoupanca(344);
		cs.saquePoupanca(4);
		System.out.println(cs);
	}

}
