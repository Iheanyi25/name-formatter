package NameFormatter;
import java.util.Scanner;
public class NameCollector {

	public static void main(String[] args) {
		GetName();
	}
	private static void GetName() {
		Scanner collect = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = collect.nextLine();
		NameOperation(name);
		collect.close();
	}
	private static void NameOperation(String name) {
		String[]hold = name.split(" ");
//		String hold1 = hold[0];
//		String hold2 = hold[1];
//		String hold3 = hold[2];
		String firstName = hold[0].substring(0, 1).toUpperCase()+hold[0].substring(1);
//		String initials = hold2.substring(0, 1).toUpperCase()+". "+hold3.substring(0, 1).toUpperCase()+".";
		String initials = "";
		for(int i=1; i<hold.length; i++){
				initials += hold[i].substring(0,1).toUpperCase()+".";
		}
		DisplayName(firstName, initials);
	}
	private static void DisplayName(String firstName,String initials){
		System.out.println("Your name is "+firstName+" "+ initials);
	}
}