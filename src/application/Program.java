package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaTerminal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite os dados para a criação da sua conta");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Agência: ");
		sc.nextLine();
		String agencia = sc.nextLine();
		System.out.print("Nome cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		ContaTerminal nconta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		
		System.out.println("____________________________________________________________________");
		System.out.println();
		
		System.out.println(nconta);
		sc.close();
	}
}
