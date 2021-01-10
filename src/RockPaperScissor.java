//Sameer Ahmed Khan - 22954 - ITP Assignment 1
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        String[] outcomes = {"rock","paper","scissor"};
        int input = Integer.parseInt(args[0]);
        Random random = new Random();
        int computer = random.nextInt(3);
    
        System.out.print("The computer is " +outcomes[computer]+". You are "+outcomes[input]);
        
        if (input==computer) {
            System.out.print(" too. It's a draw!");
        }
        else if ((input==0 && computer==2) || (input==1 && computer==0) || (input==2 && computer==1)) {
            System.out.print(". You won!");
        }
        else {
            System.out.print(". Computer won!");
        }
    }
}


