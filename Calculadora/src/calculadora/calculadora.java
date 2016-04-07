package calculadora;

public class calculadora {

	
	// ATRIBUTOS
	
	private int num1;
	private int num2;
	
	
	// CONSTRUCTORES
	
	public calculadora(){
		
		num1=0;
		num2=0;
	}
	
	public calculadora(int num1, int num2){
		
		this.num1=num1;
		this.num2=num2;
		
	}
	
	// METODOS
	
	
	public int suma(){
		
		return num1+num2;
	}
	
	public int resta(){
		
		return num1 - num2;
	}
	
	public int multiplicacion(){
		
		return num1 * num2;
	}
	
	public double division(){
		
		return (double)num1 / num2;
	}
	
	void imprimir(){
		System.out.println("La suma de "+num1+" y "+num2+" es "+suma());
		System.out.println("La resta de "+num1+" y "+num2+" es "+resta());
		System.out.println("La multiplicación de "+num1+" y "+num2+" es "+multiplicacion());
		System.out.println("La división de "+num1+" y "+num2+" es "+division());
	}
}
