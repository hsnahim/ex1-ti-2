import java.util.Scanner;

public class ex1 {
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva dois numero para serem somado");
		int soma1 = input.nextInt();
		int soma2 = input.nextInt();
		int resp = soma1 + soma2;
		System.out.println("O resultado da soma é: " + resp);
		input.close();
	}
}
