
public class Main {

	public static void main(String[] args) {
		/*THREADS
		 * 
		 * A thread of execution in a program (kind of like a virtual CPU)
		 * The JVM allows an application to have multiple threaeds concurrently
		 * Each thread can execute parts of your code in parallel with the main thread
		 * Each thread has a priority.
		 * Thread with higher priority are executed in preference compared to 
		 * threads with lower priority
		 * 
		 * The Java Virtual Machine continues to execute threads until either of the following
		 * 1. The exit method of class Runtime has been called
		 * 2. All user threads have died
		 *  
		 */
		// A daemon thread is a low priority thread that runs in the background to perform tasks
		//JVM terminates itself when all user threads (non-daemons) finish their execution
		
		
		Thread.currentThread().setName("Primary Thread");
		Thread.currentThread().setPriority(10);
		
		System.out.println(Thread.activeCount());
		
		System.out.println(Thread.currentThread().getName());
		
		//all threads have a priority
		System.out.println(Thread.currentThread().getPriority());
		//the higher priority the higher the number for the thread
		//priority is between 1 and 10 
		
		//check to see if the thread is alive
		System.out.println(Thread.currentThread().isAlive());
		
		//can make a thread sleep or pause the program
		for(int i=5; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Loop Finished");
		
		//a way to create a second thread
		MyThread thread2 = new MyThread();
		//some threads are DAEMONS
		thread2.setDaemon(true);
		
		
		thread2.start(); //must be start, not run
		System.out.println(thread2.isAlive());
		thread2.setName("Secondary Thread");
		System.out.println(thread2.getName());
		thread2.setPriority(8);
		System.out.println(thread2.getPriority());
		System.out.println("There are " +Thread.activeCount() + " threads active");
		
		
	}

}
