// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!".length());
        System.out.println("Hello and welcome!".charAt(1)); // zero indexed
        System.out.println("Hello and welcome!".substring(5));
        // relational operators
        System.out.println(4 == 4);
        System.out.println(3 != 4);
        System.out.println(3 > 4);
        System.out.println(3 > "4".length());
        System.out.println(3 != 4.4); // convert 3 into a double then compare both doubles
        System.out.println("\u0061"); // unicode character a
        int a = 12;
        double b = 1.6;
        System.out.println( a/b);

        System.out.println(Boolean.parseBoolean("urte")); // looking for letters t r u e regardless of case but in order

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
