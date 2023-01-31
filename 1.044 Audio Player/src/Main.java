import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
//only compatible with .wav; 
//you can convert mp3s into .wav with other tools

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("Emotional Mess.wav");
		
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		//will terminate unless program stays open like in a GUI
		//response is waiting for input
		while(!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter your choice");
			response = scanner.next();
			response = response.toUpperCase();
			
			switch(response) {
				case ("P"): clip.start();
					break;
				case ("S"): clip.stop();
					break;
				case("R"): clip.setMicrosecondPosition(0);
					break;
				case ("Q"): clip.close();
					break;
				default: System.out.println("Not a valid option");
			}
			
		}
		System.out.println("Program terminated");
		
		
		
		
		
	}
	
	

}
