package br.edu.figsplana;

import java.util.Scanner;

public class Losangulo {

	private double diagonalMaior;
	private double diagonalMenor;
	private double area;
	
	Scanner sc = new Scanner(System.in);
	
	public void recebeBaseMaior(double D) {
		diagonalMaior = D;
	}
	
	public void recebeBaseMaior() {
		System.out.println("Insira um valor: ");
		diagonalMaior = sc.nextDouble();
	}
	
	public void recebeBaseMenor(double d) {
		diagonalMenor = d;
	}
	
	public void recebeBaseMenor() {
		System.out.println("Insira um valor: ");
		diagonalMenor = sc.nextDouble();
	}
	
	public void calcArea() {
		area = (diagonalMaior * diagonalMenor) / 2;
	}
	
	public void listaArea() {
		System.out.println("Área do Losângulo: " + area);
	}
	
	public void listaDiagonalMaior() {
		System.out.println("Diagonal Maior do Losângulo: " + diagonalMaior);
	}
	
	public void listaDiagonalMenor() {
		System.out.println("Diagonal Menor do Losângulo: " + diagonalMenor);
	}
}
