package circleArea;

import java.util.Scanner;
import java.lang.Math;

//Objetivo:
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais.

public class AreaDoCirculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Definindo valor de pi
		Double pi = 3.14159;
		
		//Perguntando e lendo o raio
		System.out.print("Insira o raio do círculo: ");
		Double raio = scan.nextDouble();
		
		//Realizado o calculo (area = π . raio²)
		Double area = pi * (Math.pow(raio, 2));
		
		//Mostrando o resultado
		System.out.printf("A area do circulo é: %.4f", area);
	}

}
