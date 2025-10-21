package br.edu.figsplana;

import java.util.Scanner;

public class Quadrado {

	private double lado;
	private double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void recebeRaio(double r) {
		lado = r;
	}
	
	public void recebeRaio() {
		System.out.println("Insira um valor: ");
		lado = sc.nextDouble();
	}
	
	public void calcArea() {
		area = Math.pow(lado, 2);
	}
	
	public void listaArea() {
		System.out.println("Área do Quadrado: " + area);
	}
	
	public void listaRaio() {
		System.out.println("Raio do Lado: " + lado);
	}
}
