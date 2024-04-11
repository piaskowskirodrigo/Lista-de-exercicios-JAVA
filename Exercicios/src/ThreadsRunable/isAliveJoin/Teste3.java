package ThreadsRunable.isAliveJoin;

public class Teste3 {

	public static void main(String[] args) {

		MinhaThreadRunabble thread1 = new MinhaThreadRunabble("#1", 500);
		MinhaThreadRunabble thread2 = new MinhaThreadRunabble("#2", 700);
		MinhaThreadRunabble thread3 = new MinhaThreadRunabble("#3", 800);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		
		/*try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		
		t2.start();
		
		/*try {
			t2.join();
		*/
		
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Programa finalizado");
	}
}