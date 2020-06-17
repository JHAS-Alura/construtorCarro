package construtorCarro;

public class Carro {
	private int ano;
	private String modelo;
	private double preco;
	
	public Carro(int ano, String modelo, double preco) {
		if(ano >= 1891) { //1891 primeiro carro a chegar no BR, trazido por Santos Dumont, Peugeot
			this.ano = ano;
		}else {
			System.out.println("O ano informado est� invalido. Por isso usaremos 2017!");
			this.ano = 2017;
		}
		
		if(modelo != null) {
			this.modelo = modelo;
		}else {
			System.out.println("O modelo n�o foi informado. Por isso usaremos Gol!");
			this.modelo = "Gol";
			
		}
		
		if(preco > 0) {
			this.preco = preco;
		}else {
			System.out.println("O pre�o n�o � valido. Por isso usaremos 40000.0");
			this.preco = 40000.0;
		}

	}
	
	//outro construtor aqui
	public Carro(String modelo, double preco) {
	//chamando o construtor que recebe int, String e double. O nosso primeiro
		this(2017, modelo, preco);

	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
