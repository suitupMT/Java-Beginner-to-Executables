
public class MyThread extends Thread{
	
	@Override
	public void run() {
	
		for(int i = 10; i>0; i--) {
			System.out.println("Thread # 1: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//end for loop
		
		System.out.println("Thread #1 is finished.");
		
		
	}//end run() brace
}//end class brace
