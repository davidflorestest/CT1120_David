package metodos;

public class MetodosEjemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = suma(3,6);
		System.out.println(resultado);
		
		String marca = carro(2);
		System.out.println(marca);

	}
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String[] cars = {"Volvo", "Sedan", "VW"};
		return cars[a];
	}

}
