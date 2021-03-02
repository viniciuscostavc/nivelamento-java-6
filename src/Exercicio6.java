import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valora, valorb, valorc, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite o valor A:");
		valora = sc.nextDouble();
		
		System.out.println("Digite o valor B:");
		valorb = sc.nextDouble();
		
		System.out.println("Digite o valor C:");
		valorc = sc.nextDouble();
		
		triangulo = valora * valorc / 2.0;
		System.out.printf("Triângulo: %.3f%n", triangulo);
		
		circulo = (valorc*2)*3.14159;
		System.out.printf("Círculo: %.3f%n", circulo);
		
		trapezio = (valora+valorb) / 2.0 * valorc;
		System.out.printf("Trapézio: %.3f%n", trapezio);
		
		quadrado = valorb * valorb;
		System.out.printf("Quadrado: %.3f%n", quadrado);
		
		retangulo = valora * valorb;
		System.out.printf("Retângulo: %.3f%n", retangulo);
		
		sc.close();
		
	}

}
