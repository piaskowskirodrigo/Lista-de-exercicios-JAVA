package ThreadsRunable.isAliveJoin;

public class TestePrioridade {

	public static void main(String[] args) {

		MinhaThreadRunabble thred1 = new MinhaThreadRunabble("#1", 500);
		MinhaThreadRunabble thred2 = new MinhaThreadRunabble("#2", 500);
		MinhaThreadRunabble thred3 = new MinhaThreadRunabble("#3", 500);

		Thread t1 = new Thread(thred1);
		Thread t2 = new Thread(thred2);
		Thread t3 = new Thread(thred3);

		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);

		//t1.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}

}