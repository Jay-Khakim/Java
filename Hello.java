import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();
        float idealWeight = 22 * (height*height);

        System.out.println("The ideal weight of person with height: " + height + " m is " + idealWeight+ " kg! ");
        scanner.close();
    }
}