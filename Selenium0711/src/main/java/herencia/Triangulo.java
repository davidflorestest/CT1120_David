package herencia;

public class Triangulo extends DosDimensiones {
	String estilo;
	
	double area() {
		return base*altura/2;
	}
	
	void mostrarEstilo() {
		System.out.println("Tri�ngulo es" + estilo);
	}
}
