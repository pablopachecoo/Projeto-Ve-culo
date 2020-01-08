package br.com.gft.model;


public class Ve�culo {
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombust�vel;
	private int Velocidade;
	private double preco;
	
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return true;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombust�vel() {
		return litrosCombust�vel;
	}

	public void setLitrosCombust�vel(int litrosCombust�vel) {
		this.litrosCombust�vel = litrosCombust�vel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public void acelerar () {
		if (isLigado == true) {
			this.Velocidade = this.Velocidade +20;
			System.out.println(this.Velocidade);
			this.litrosCombust�vel = this.litrosCombust�vel -1;
			System.out.println("Kmp/h\nCarro acelerou");
		}
		else {
			System.out.println("O Carro est� Desligado");
		}
	}
		
	public void abastecer (int qtdLitros) {
		if (this.litrosCombust�vel <=10  ) {
			this.litrosCombust�vel = this.litrosCombust�vel +20;
		}
		else {
			System.out.println("Tanque Cheio");
		}
		
	}
	
	public void frear () {
		if (isLigado == true && this.Velocidade > 0) {
			this.Velocidade = this.Velocidade -20;
			System.out.println(this.Velocidade + " \nKmp/h O carro freou");
		}
		else {
			System.out.println("voc� est� parado");
		}
	}
	
	public void pintar (String Cor)	{
		
	}
	
	public void ligar () {
		if (isLigado == false) {
			isLigado = true;
			System.out.println("vrum vrum");
		}
		
		else {
			System.out.println("erro");
		}
	}
	
	public void desligar () {
		if (isLigado == true) {
			isLigado = false;
		}
		else {
			System.out.println("O Ve�culo j� Est� Desligado ");
		}
	}
}
