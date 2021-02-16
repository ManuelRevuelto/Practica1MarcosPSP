package Ejercicio4_7_8_13;

public class Client extends Thread {
	private Cartera cartera;

	public Client(Cartera cartera) {
		super();
		this.cartera = cartera;
	}

	@Override
	public void run() {

		super.run();
		cartera.incrementarDinero();

	}
}
