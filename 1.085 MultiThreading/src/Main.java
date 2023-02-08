
public class Main {
	//multi-threading
	/*
	 *  process of executing multiple threads simultaneously
	 *  helps maximum utilization of cpu
	 *  Threads are independent, they don't affect the execution of other threads
	 *  -An exception is one thread will not interrupt other threads
	 *  useful for serving multiple clients, multiplayer gamers, or other mutual exclusive componenets
	 */
	public static void main(String[] args) {
	//1st way
	MyThread thread1 = new MyThread();
	
	//2nd way to create a thread -- The better way?
	//create the MyRunnable class implementing runnable interface
	MyRunnable runnable2 = new MyRunnable();
	Thread thread2 = new Thread(runnable2);
	
	
	//must start the thread to run the program inside it
	thread1.start();
	//join()
	try {
		thread1.join(1000); //can also take a value of milliseconds to dealy
		//before other thread starts
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //this will pause the program til thread1 is completely finished
	
	
	thread2.start();
	
	//if one thread throws an exception the other will keep going
	//even if the main class thorws the exception the other threads keep going
	
	//if you set a thread to a Daemon thread the program can close before execution of all threads
	// thread1.setDaemon(true);  only do this for background threads or trash collection
	
	
	}
	
	
	
}
