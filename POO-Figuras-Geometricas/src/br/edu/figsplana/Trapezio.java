package br.edu.figsplana;

import java.util.Scanner;

public class Trapezio {

	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void recebeBaseMaior(double B) {
		baseMaior = B;
	}
	
	public void recebeBaseMaior() {
		System.out.println("Insira um valor: ");
		baseMaior = sc.nextDouble();
	}
	
	public void recebeBaseMenor(double b) {
		baseMenor = b;
	}
	
	public void recebeBaseMenor() {
		System.out.println("Insira um valor: ");
		baseMenor = sc.nextDouble();
	}
	
	public void calcArea() {
		area = ((baseMaior + baseMenor) * altura) / 2;
	}
	
	public void listaArea() {
		System.out.println("�rea do Trap�zio: " + area);
	}
	
	public void listaBaseMaior() {
		System.out.println("Base Maior do Trap�zio: " + baseMaior);
	}
	
	public void listaBaseMenor() {
		System.out.println("Base Menor do Trap�zio: " + baseMenor);
	}
}
