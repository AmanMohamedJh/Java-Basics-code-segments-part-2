package june_2023_threads;

public class EvenOddPrinters {

	 private   static  final   int  MAX_NUM  =  20;
	 private  static  volatile  int  nextNum  =  1;
	 private  static  final  Object  lock  =  new  Object();
	 
	public static void main(String[] args) {
		Thread  evenThread  =  new  Thread(new  EvenRunnable() ,"EvenThread") ;
		Thread  oddThread  =  new  Thread(new  OddRunnable() , "OddThread") ;
		
		evenThread.start();
		oddThread.start();
		
	}
	
	class EvenRunnable implements Runnable{

		@Override
		public void run() {
			while(nextNum <= MAX_NUM) {
				while(nextNum % 2 != 0) {
					
					try {
						lock.notify();
						lock.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
				}
			}
			System.out.println(Thread.currentThread().getName() + nextNum);
			
		}
		


class OddRunnable implements Runnable{

	@Override
	public void run() {
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

}
