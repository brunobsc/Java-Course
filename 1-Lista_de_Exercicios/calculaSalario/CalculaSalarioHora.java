package calculaSalario;

import java.util.Scanner;

//Objetivo:
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

public class CalculaSalarioHora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Declarando variaveis
		int funcionarioID, horasTrabalhadas;
		double valorHora, salario;
		
		//Perguntando e lendo valores
		System.out.print("Insira o ID do Funcionário: ");
		funcionarioID = scan.nextInt();
		System.out.print("Insira a quantidade de horas trabalhadas (int): ");
		horasTrabalhadas = scan.nextInt();
		System.out.print("Insira o valor por hora: ");
		valorHora = scan.nextDouble();
		
		//Calculando o salario
		salario = valorHora * horasTrabalhadas;
		
		//Mostrando o resultado
		System.out.printf("Funcionário ID: %d\n",funcionarioID);
		System.out.printf("Salário: R$ %.2f",salario);
		
		scan.close();
	}

}
