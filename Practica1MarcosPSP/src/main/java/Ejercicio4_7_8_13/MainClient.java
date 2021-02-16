package Ejercicio4_7_8_13;

import java.util.ArrayList;
import java.util.List;

public class MainClient {
	public static void main(String[] args) {
		List<Client> clientes = new ArrayList<Client>();
		List<Worker> workers = new ArrayList<Worker>();
		Cartera cartera = new Cartera();

		crearClientes(cartera, clientes);
		crearWorkers(cartera, workers);
		
		cartera.verDinero();
	}

	/**
	 * Metodo para crear los 10 clientes
	 * 
	 * @param misClientes
	 * @param cartera
	 */
	private static void crearClientes(Cartera cartera, List<Client> clientes) {
		for (int i = 0; i < 10; i++) {
			clientes.add(new Client(cartera));
		}
		for (Client c : clientes) {
			c.start();
		}
	}

	/**
	 * Metodo para crear los 10 workers
	 * 
	 * @param misWorkers
	 * @param cartera
	 */
	private static void crearWorkers(Cartera cartera, List<Worker> workers) {
		for (int i = 0; i < 10; i++) {
			workers.add(new Worker(cartera));
		}
		for (Worker w : workers) {
			w.start();
		}
	}

	private static void verDinero(Cartera cartera) {
		System.out.println(cartera.getDinero());
	}
}
