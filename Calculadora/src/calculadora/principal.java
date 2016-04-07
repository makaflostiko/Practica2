package calculadora;
import java.util.Scanner;
public class principal {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		System.out.println("Introduzca el primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2=sc.nextInt();
		calculadora c1=new calculadora(num1,num2);
		c1.imprimir();

	}

}
