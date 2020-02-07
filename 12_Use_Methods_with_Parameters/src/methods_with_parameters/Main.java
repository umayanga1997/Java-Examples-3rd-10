

package methods_with_parameters;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
           
        Scanner scanner_variable = new Scanner(System.in);
        Java java_object = new Java();
        
        System.out.println("Enter Name Here :");
        String name = scanner_variable.nextLine();
   
        java_object.simplemessage(name);
    
    }
    
}
