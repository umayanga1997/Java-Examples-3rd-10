package random_number_generator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random  random_variable = new Random();
        int number;
        
        for(int counter =1; counter<=10;counter++){
            number = 1 + random_variable.nextInt(4);
            System.out.println(number + "");
        }
      
    }
    
}
