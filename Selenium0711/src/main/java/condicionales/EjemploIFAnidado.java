package condicionales;

public class EjemploIFAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura = 20;
		
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("A la playa");
			} else {
				System.out.println("A la monta�a");
			}
		} else {
			System.out.println("A descansar...");
		}
	}

}
