
public class Main {

    static void message(int n){
        if(n == 0)
            return;
        else {
            System.out.println("Hello World!");
            message(n - 1);
        }
    }
    public static void main(String[] args) {

        message(3);

    }

}