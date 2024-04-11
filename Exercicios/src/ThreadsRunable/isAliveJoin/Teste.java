package ThreadsRunable.isAliveJoin;

public class Teste {

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
		
		for (int i=0; i<7; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Programa finalizado");
	}

}