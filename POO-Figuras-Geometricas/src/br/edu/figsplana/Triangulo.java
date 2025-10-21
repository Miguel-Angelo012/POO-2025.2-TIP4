package br.edu.figsplana;

import java.util.Scanner;

public class Triangulo {
	
	private double base;
	private double altura;
	private double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void recebeBase(double b) {
		base = b;
	}
	
	public void recebeBase() {
		System.out.println("Insira um valor: ");
		base = sc.nextDouble();
	}

	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeAltura() {
		System.out.println("Insira um valor: ");
		altura = sc.nextDouble();
	}
	public void calcArea () {
		area = (base + altura) / 2;
	}
	
	public void listaArea() {
		System.out.println("Área do Quadrado: " + area);
	}
	
	public void listaAltura() {
		System.out.println("Altura do Triângulo: " + altura);
	}
	
	public void listaBase() {
		System.out.println("Base do Triângulo: " + base);
	}
}
