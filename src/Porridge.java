import java.util.Scanner;

public class Porridge {
	
	private double temperature;
	
	public Porridge(double temp) {
		this.temperature = temp;
	}
	
	public void setTemperature() {
		System.out.println("Your porridge is currently room temperature.");
		this.temperature = 70;
	}
	
	public void heat() {
		System.out.println("For how many seconds would you like to microwave your porridge?");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		int seconds = keyboard.nextInt();
		this.temperature = this.temperature + (double)(Math.pow(seconds, 1.1));
		if (this.temperature > 175) {
			System.out.println("You charred your porridge!");
		}
	}
	
	public void cool() {
		System.out.println("For how many minutes would you like to stick the porridge in the freezer?");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		int minutes = keyboard.nextInt();
		this.temperature = this.temperature - minutes * 5;
		if (this.temperature < 32) {
			System.out.println("You froze your porridge!");
		}
	}
	
	public void checkTemperature() {
		System.out.println("Currently, your porridge is " + this.temperature + "°.");
		if (this.temperature > 120) {
			System.out.println("Yow! That's way too hot!");
		}
		else if ((109 < this.temperature) && (this.temperature < 111)) {
			System.out.println("That's just right!");
		}
		else if ((100 < this.temperature) && (this.temperature <= 120)){
			System.out.println("That's a pretty good temperature.");
		}
		else {
			System.out.println("That's way too cold!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Porridge bowl = new Porridge(0);
		bowl.setTemperature();
		System.out.println("Would you like to heat your porridge? (\"Yes\" or \"No\")");
		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter("\r?\n");
		String ans1 = keyboard.next();
		if (ans1.toUpperCase().equals("Y") || ans1.toUpperCase().equals("YES")){
			bowl.heat();
		}
		System.out.println("Would you like to cool your porridge? (\"Yes\" or \"No\")");
		String ans2 = keyboard.next();
		if (ans2.toUpperCase().equals("Y") || ans2.toUpperCase().equals("YES")){
			bowl.cool();
		}
		bowl.checkTemperature();
	}

}
