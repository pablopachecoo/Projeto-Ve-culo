package br.com.gft.main;

import java.util.Scanner;

import br.com.gft.model.Veículo;

public class Main {
	public static void main(String[] args) {

		Veículo veiculo = new Veículo();
		
		Scanner sc = new Scanner(System.in);
		String escolha;
		
		while(true) {
			escolha = sc.next();
			switch(escolha) {
			case "acelerar":
				veiculo.acelerar();
				break;
			case "frear":
				veiculo.frear();
				break;
			case "ligar":
				veiculo.ligar();
			}
		}
		

		
		
		
	}

}
