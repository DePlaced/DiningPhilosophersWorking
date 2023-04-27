package table;

public class Philosopher implements Runnable{

	private Chopstick leftChop;
	private Chopstick rightChop;
	
	public Philosopher(Chopstick leftChop, Chopstick rightChop) {
		this.leftChop = leftChop;
		this.rightChop = rightChop;
	}
	
	public void doAction(String action) throws InterruptedException {
		System.out.println(
		          Thread.currentThread().getName() + " " + action);
		        Thread.sleep(((int) (Math.random() * 3001)));
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
