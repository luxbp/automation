import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Helper {

    private static Random random = new SecureRandom();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = scanner.nextLine();
    }

}
