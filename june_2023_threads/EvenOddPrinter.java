package june_2023_threads;

public class EvenOddPrinter {

	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
		Thread oddThread = new Thread(new OddRunnable(), "oddThread");

		evenThread.start();
		oddThread.start();

		try {
			evenThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		try {
			oddThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	static class EvenRunnable implements Runnable {

		@Override
		public  void run() {
			synchronized (lock) {
				while (nextNum <= MAX_NUM) {
					while (nextNum % 2 != 0) {
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + nextNum);
					nextNum++;
				}
			}

		}

	}

	static class OddRunnable implements Runnable {

		@Override
		public void run() {
			synchronized (lock) {
				while (nextNum <= MAX_NUM) {
					while (nextNum % 2 == 0) {
						try {
							lock.notify();
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + " " + nextNum);
					nextNum++;
				}
			}

		}

	}
}
