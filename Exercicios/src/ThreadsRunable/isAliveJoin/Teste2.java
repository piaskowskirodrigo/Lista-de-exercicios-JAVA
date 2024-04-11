package ThreadsRunable.isAliveJoin;

public class Teste2 {

	public static void main(String[] args) {

		MinhaThreadRunabble thread1 = new MinhaThreadRunabble("#1", 500);
		MinhaThreadRunabble thread2 = new MinhaThreadRunabble("#2", 500);
		MinhaThreadRunabble thread3 = new MinhaThreadRunabble("#3", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		t2.start();
		t3.start();

		while(t1.isAlive() || t2.isAlive() || t3.isAlive()){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Programa finalizado");
	}
}