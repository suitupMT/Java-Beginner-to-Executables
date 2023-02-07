
public class Main {

	public static void main(String[] args) {
		// classes inside classes
		
		//inner class - nested classes. usefule if a class should be limited in scope
		// usually set to private, helps group classes that belong together
		//useful for listeners or specific events
		
		
		Outside out = new Outside();
		
		Outside.Inside in = out.new Inside();
		
		//System.out.println(out.x+in.y);
		in.Greeting();
		

	}

}
