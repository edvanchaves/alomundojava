import java.util.Scanner;

public class TesteScanner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua Idade: ");
		int idade = sc.nextInt();

		System.out.println("Sua idade é :" + idade + " anos.");
	}
}
