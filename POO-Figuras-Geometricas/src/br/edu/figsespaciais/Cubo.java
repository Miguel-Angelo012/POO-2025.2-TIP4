package br.edu.figsespaciais;

import java.util.Scanner;

public class Cubo {
	
	private double aresta;
	private double areaSuperficie;
	private double volume;
	
	Scanner sc = new Scanner(System.in);

	public void recebeAresta(double a) {
		aresta = a;
	}
	
	public void recebeAresta() {
		System.out.println("Insira um valor: ");
		aresta = sc.nextDouble();
	}
	
	public void calcAreaSuperficie() {
		areaSuperficie = 6 * Math.pow(aresta, 2);
	}
	
	public void calcVolume() {
		volume = Math.pow(aresta, 3);
	}
	
	public void listaAresta() {
		System.out.println("Aresta do Cubo: " + aresta);
	}
	
	public void listaAreaSuperficie() {
		System.out.println("Area da Superfície do Cubo: " + areaSuperficie);
	}
	
	public void listaVolume() {
		System.out.println("Volume do Cubo: " + volume);
	}
	
	public void listaAtributos() {
		System.out.println("Aresta do Cubo: " + aresta);
		System.out.println("Area da Superfície do Cubo: " + areaSuperficie);
		System.out.println("Volume do Cubo: " + volume);
	}
}
