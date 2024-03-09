import java.util.Random;
public class Player {
    String name;
    Random random = new Random();
    int guess(){

        return random.nextInt(10);
    }
}
