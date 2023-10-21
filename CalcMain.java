import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // testing the functions
        //System.out.println(calc.add(12, 34));
        //System.out.println(calc.subtract(34, 12));

        // Choose calculator function
        Scanner scanner = new Scanner (System.in);
        System.out.println("Which operation? (a)ddition, (s)ubtraction or e(x)it:");
        String choice = scanner.next();

        while (!choice.equals("x")) {

            // User entry num1 & num2
            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();

            if (choice.equals("a")) { // not == because that is comparing 2 objects and choice vs "a" are different objects
                System.out.println(calc.add(num1, num2));
            } else if (choice.equals("s")) {
                System.out.println(calc.subtract(num1, num2));
            } else {
                System.out.println("not valid");
            }
            System.out.println("Which operation? (a)ddition, (s)ubtraction or e(x)it:");
            choice = scanner.next();
        }
    }
}
