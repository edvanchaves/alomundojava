package br.edu.fgf.alomundojava;
import java.util.Scanner;

public class TesteScanner2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();

		System.out.println("Sua idade é :" + idade + " anos.");
		
		sc.close();
	}
}