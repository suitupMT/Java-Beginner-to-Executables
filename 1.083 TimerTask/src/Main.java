import java.util.*;


public class Main {

	public static void main(String[] args) {
		/*  Timer      is a facility for threads to schedule tasks for future execution
		 * 			   for future execution in a background thread
		 * 
		 * TimerTask   is a task that can be schedule for one-time or repeated execution
		 * 			   by a timer.
		 * 
		 */
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() { 
			int counter = 10;
			 @Override
			public void run() { 
				 
				 if(counter>0) {
					System.out.println(counter+" seconds"); 
					counter--;
				 }
				 else {
				 	System.out.println("Countdown Finished");
				 	timer.cancel();
				 }
			}
			 
		};
		
	//	timer.schedule(task, 3000);   //pass in name of TimerTask, time delay amount
		
		//how to set future time for action
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2023);
		date.set(Calendar.MONTH, Calendar.FEBRUARY);
		date.set(Calendar.DAY_OF_MONTH, 7);
		date.set(Calendar.HOUR_OF_DAY, 15); //military time
		date.set(Calendar.MINUTE, 48);
		date.set(Calendar.SECOND, 59);
	
		//timer.schedule(task, date.getTime());
		//timer.scheduleAtFixedRate(task, date.getTime(), 500)// if you want to set a start time
		timer.scheduleAtFixedRate(task, 0, 500); //taskName, when it starts date, delay time
		
	
	}//end static main
	
}//end main class
