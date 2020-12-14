package Ejercicio4;

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
