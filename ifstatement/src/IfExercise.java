import java.util.Scanner;

public class IfExercise {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();

        if (x < 0) {
            System.out.println("X er et minus tal");
        } else if (x < 10) {
            System.out.println("X er et lille tal");
        } else if (x > 100) {
            System.out.println("X er et stort tal");
        }


        /*
        int age = scanner.nextInt();
        if (age > 100) {
            System.out.println("Du burde være død!");
        } else if (age > 60) {
            System.out.println("Tid til pension!");
        } else if (age >= 18) {
            System.out.println("Nu er du voksen!");
        } else {
            System.out.println("Du er stadigvæk et barn..");
        }




        double z = 25;
        int input = scanner.nextInt();
        double output = z / input;
        if (output > 0) {
            System.out.println("Du kan ikke dividere med 0!");
        } else {
            System.out.println(output);
        }

         */


    }
}
