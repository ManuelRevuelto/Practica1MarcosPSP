package Ejercicio4_7_8_13;

public class MainClient {
	public static void main(String[] args) {
		Cartera cartera = new Cartera();

		crearClientes(cartera);
		crearWorkers(cartera);
		
		verDinero(cartera);
	}

	/**
	 * Metodo para crear los 10 clientes
	 * 
	 * @param misClientes
	 * @param cartera
	 */
	private static void crearClientes(Cartera cartera) {
		for (int i = 0; i < 10; i++) {
			new Client(cartera).start();
		}
	}

	/**
	 * Metodo para crear los 10 workers
	 * 
	 * @param misWorkers
	 * @param cartera
	 */
	private static void crearWorkers(Cartera cartera) {
		for (int i = 0; i < 10; i++) {
			new Worker(cartera).start();
		}
	}
	
	private static void verDinero(Cartera cartera) {
		System.out.println(cartera.getDinero());
	}
}
