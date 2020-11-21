package herencia;

public class Lados3 {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		t1.base = 4.0;
		t1.altura = 4.0;
		
		t1.estilo = "Equilatero";
		
		System.out.println("informacion para T1:" );
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es" + t1.area());
		
		t2.base = 8.0;
		t2.altura = 12.0;
		t2.estilo = "Isocele";
				
		System.out.println("informacion para T2:" );
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es" + t2.area());
	}

}
