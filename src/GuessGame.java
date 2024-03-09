import java.util.Random;
public class GuessGame {


    static Random random = new Random();
     int guessNumber;
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    int guess1;
    int guess2;
    int guess3;
    void startGame(){
        this.guessNumber = random.nextInt(10);
        System.out.println("Number to guess is "  + this.guessNumber);
        while(true){
            guess1 = p1.guess();
            guess2 = p2.guess();
            guess3 = p3.guess();
            System.out.println("Player 1 guessed " + guess1);
            System.out.println("Player 2 guessed " + guess2);
            System.out.println("Player 3 guessed " + guess3);
            if(guess1 == guessNumber || guess2 == guessNumber || guess3 == guessNumber){
                if(guess1 == guessNumber)
                    System.out.println("Player 1 won, guessing " + guess1);
                if(guess2 == guessNumber)
                    System.out.println("Player 2 won, guessing " + guess2);
                if(guess3 == guessNumber)
                    System.out.println("Player 3 won, guessing " + guess3);
                break;
            }
            else
                System.out.println("A new round of guesses!");
        }

    }
}
