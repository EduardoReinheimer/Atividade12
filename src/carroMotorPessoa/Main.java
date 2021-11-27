package carroMotorPessoa;

public class Main {

	public static void main(String[] args) {
		Motor motor = new Motor("Toyota", 138, 4, "Gasolina");
		Pessoa pessoa = new Pessoa("Eduardo", "Araçoiaba da Serra");
		Carro carro = new Carro("Toyota", "Corolla", "Prata", 2005, pessoa, motor);
		System.out.println(motor);
		System.out.println(pessoa);
		System.out.println(carro);

	}

}
