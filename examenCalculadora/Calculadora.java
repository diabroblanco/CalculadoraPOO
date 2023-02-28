package examenCalculadora;

import java.util.Scanner;

public class Calculadora {
	static	Scanner sc=new Scanner(System.in);

	
	static double Suma(double primero, double segundo) {
		double total=primero+segundo;
		return total;
	

	}
	static double Resta(double primero, double segundo) {
		double total=primero-segundo;
		return total;

	}
	static double Multiplicar(double primero, double segundo) {
		double total=primero*segundo;
		return total;}
	
	static double Dividir(double primero, double segundo) {
		double total=primero/segundo;
		return total;
	}
	static double Resto(double primero, double segundo) {
		double total=primero%segundo;
		return total;
	}
	static double Exponencial(double numero, double elevado) {
		double total=Math.pow(numero, elevado);
		return total;
	}
	
}
