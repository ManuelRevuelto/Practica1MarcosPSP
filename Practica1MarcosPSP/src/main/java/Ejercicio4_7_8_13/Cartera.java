package Ejercicio4_7_8_13;

import java.text.DecimalFormat;

public class Cartera {
	private float dinero;
	DecimalFormat decimalFormat = new DecimalFormat("###.00");

	/*
	 * Esta funcion sirve para incrementar el dinero de los clientes
	 * 
	 */
	public synchronized void incrementarDinero() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error al esperar un segundo");
		}
		dinero += Math.random() * 101;
		System.out.println("El dinero actual del client " + Thread.currentThread().getId() + " es de: "+ decimalFormat.format(dinero));
	}

	/*
	 * Esta funcion sirve para decrementar el dinero de los workers
	 * 
	 */
	public synchronized void decrementarDinero() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error al esperar un segundo");
		}
		dinero -= Math.random() * 101;
		System.out.println("El dinero actual del worker " + Thread.currentThread().getId() + " es de: "+ decimalFormat.format(getDinero()));
	}
	
	public synchronized void verDinero() {
		System.out.println(decimalFormat.format(getDinero()));
	}

	// GETTERS AND SETTERS
	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

}
