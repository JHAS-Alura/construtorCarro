package construtorCarro;

public class TestaConstrutor {
	public static void main(String[] args) {
		
		Carro carro = new Carro(2015, "Gol", 42000.0);
		Carro outroCarro = new Carro("Civic", 95000.0);
		
		System.out.println(carro.getModelo());
		System.out.println(outroCarro.getAno());
		
	}

}
