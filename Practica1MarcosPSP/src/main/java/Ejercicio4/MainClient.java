package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainClient {
	public static void main(String[] args) {
		List<Client> misClientes = new ArrayList<Client>();
		List<Worker> misWorkers = new ArrayList<Worker>();
		Cartera cartera = new Cartera();

		crearClientes(misClientes, cartera);
		crearWorkers(misWorkers, cartera);
	}

	/**
	 * Metodo para crear los 10 clientes
	 * 
	 * @param misClientes
	 * @param cartera
	 */
	private static void crearClientes(List<Client> misClientes, Cartera cartera) {
		for (int i = 0; i < 10; i++) {
			misClientes.add(new Client(cartera));
		}
		for (Client client : misClientes) {
			client.start();
		}
	}

	/**
	 * Metodo para crear los 10 workers
	 * 
	 * @param misWorkers
	 * @param cartera
	 */
	private static void crearWorkers(List<Worker> misWorkers, Cartera cartera) {
		for (int i = 0; i < 10; i++) {
			misWorkers.add(new Worker(cartera));
		}
		for (Worker worker : misWorkers) {
			worker.start();
		}
	}

}
