import java.util.InputMismatchException;
import java.util.Scanner;

public class RunAnimal { //Create a public class named RunAnimal. This class shall contain the main method.
    public static void main(String[] args) throws Exception {

        
        Scanner s = new Scanner(System.in);

        try{

        while (true) {

            System.out.print("\u001B[0mChoose An Animal. Press B for Bird, C for cat, or D for Dog : ");
            String input = s.nextLine();

                

                if (input.equalsIgnoreCase("D")) {
                            /*For the RunAnimal class, use nextLine() and equalsIgnoreCase() to produce an output similar
                            to the provided sample output */
                            
                            Dog dog = new Dog();
                            dog.eat();
                            dog.sleep();
                            dog.makeSound();
                            break;

                }else if(input.equalsIgnoreCase("C")){

                            Cat cat = new Cat();
                            cat.eat();
                            cat.sleep();
                            cat.makeSound();
                            break;

                }else if(input.equalsIgnoreCase("B")){

                            Bird bird = new Bird();
                            bird.eat();
                            bird.sleep();
                            bird.makeSound();
                            break;

                } else {
                    System.out.println("\u001B[31mWrong input. Try again"); // Statemnet for input mismatch
                    RunAnimal.main(args); // After error statement, the program startsover again.
                }

                
                }
            

            }catch(InputMismatchException e){
            System.out.println("\u001B[31mWrong input. Try again"); // Statemnet for input mismatch
            RunAnimal.main(args); // After error statement, the program startsover again.
        }
    }   
}