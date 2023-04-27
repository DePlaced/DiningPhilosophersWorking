package table;

public class DiningPhilosophers {

    public static void main(String[] args) throws Exception {

        Philosopher[] philosophers = new Philosopher[5];
        Chopstick[] chopsticks = new Chopstick[philosophers.length];

        for (int i = 0; i < chopsticks.length; i++) {
            chopsticks[i] = new Chopstick();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Chopstick leftChop = chopsticks[i];
            Chopstick rightChop = chopsticks[(i + 1) % chopsticks.length];

            philosophers[i] = new Philosopher(leftChop, rightChop);
            
            Thread t 
              = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}