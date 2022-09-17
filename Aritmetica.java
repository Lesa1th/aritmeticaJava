package pacote1;

import java.util.Locale;
import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int a;
		int b;
		
		System.out.printf("Digite o valor A: ");
		a = sc.nextInt();
		
		System.out.printf("Digite o valor B: ");
		b = sc.nextInt();
		
		int soma = a + b;
		
		int multi = a * b;
		
		int sub = a - b;
		
		int div = a / b;
		
		System.out.printf("Subtração dos valores A e B = %d \n",sub);
		System.out.printf("Soma dos valores A e B = %d \n",soma);
		System.out.printf("Divisão dos valores A e B = %d \n",div);
		System.out.printf("Multiplicação dos valores A e B = %d \n",multi);
		
		
		sc.close();
	}
}
