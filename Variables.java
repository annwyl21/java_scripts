public class Variables {
    public static void main(String[] args) {
        // primitive types int, double boolean
        // classes everything else Strings, Integers(extra capabilities), Arrays, Lists, Maps

        String firstName = "whatever"; // string is a class that is why is has a capital letter
        String lastName = "Houghton";
        int test; // can't use boolean, digits (at start), * or dashes in variable names
        test = 3;
        System.out.println(test);
        int age = 25; // declaration and initialisation
        double salary = 50000.50;
        char firstInitial = 'J'; // single quotes for single letter
        boolean isEmployed = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("First Initial: " + firstInitial);
        System.out.println("Is Employed: " + isEmployed);
        firstName = "Ellen";
        System.out.println(firstName);
        System.out.println(firstName + " " + lastName + " " + age);
        System.out.println(firstName + "'s last name is \"" + lastName + "\"");
    }
}