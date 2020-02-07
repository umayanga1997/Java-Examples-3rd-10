
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Add add_object = new Add();
		
		Scanner variable_name = new Scanner(System.in);
		System.out.println("Enter your namke here : ");
		String name0 = variable_name.nextLine();
		
		add_object.simplemessage(name0);
	}

}
