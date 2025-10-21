package br.edu.figsplana;

import java.util.Scanner;

public class Circulo {

	private double raio;
	private double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void recebeRaio(double r) {
		raio = r;
	}
	
	public void recebeRaio() {
		System.out.println("Insira um valor: ");
		raio = sc.nextDouble();
	}
	
	public void calcArea() {
		area = 3.16 * Math.pow(raio, 2);
	}
	
	public void listaArea() {
		System.out.println("Área do Círculo: " + area);
	}
	
	public void listaRaio() {
		System.out.println("Raio do Círculo: " + raio);
	}
}
