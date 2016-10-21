/**
 * Created by opilane on 21.10.2016.
 */
import java.util.Scanner;

public class Katse {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
        System.out.print("Type something more: ");
        line = in.nextLine();
        System.out.println("You said more: ");
    }
}
