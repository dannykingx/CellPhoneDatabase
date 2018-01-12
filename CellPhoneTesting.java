import java.util.Scanner;
import javax.swing.JOptionPane;


public class CellPhoneTesting
{
	
	public static void main(String[] args)
	{
		
		String testMan;
		String testMod;
		double testPrice;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cell phone manufacturer: ");
		testMan = keyboard.nextLine();
		
		System.out.print("Enter the cell phone model: ");
		testMod = keyboard.nextLine();
		
		System.out.print("Enter the cell phone retail price: ");
		testPrice = keyboard.nextDouble();
		
		CellPhone phone = new CellPhone(testMan, testMod, testPrice);


		JOptionPane.showMessageDialog(null, "Please wait while we retrieve your information.");
		JOptionPane.showMessageDialog(null, "Loading...");
		
		System.out.println();
		System.out.println("Here is the data you provided: ");
		System.out.println("Manufacturer: " + phone.getManufacturer());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Retail Price: $" + phone.getPrice());
		
		
		
	}

}
