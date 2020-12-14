package Ejercicio4_7_8_13;

public class Worker extends Thread{
	private Cartera cartera;
	public Worker(Cartera cartera) {
		super();
		this.cartera = cartera;
	}
	@Override
	public void run() {
		super.run();
		cartera.decrementarDinero();
	}
}
