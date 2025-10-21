package br.edu.figsplana;

import java.util.Scanner;

public class Paralelogramo {
	
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
		area = base * altura;
	}
	
	public void listaArea() {
		System.out.println("Área do Paralelogramo: " + area);
	}
	
	public void listaAltura() {
		System.out.println("Altura do Paralelogramo: " + altura);
	}
	
	public void listaBase() {
		System.out.println("Base do Paralelogramo: " + base);
	}
}
