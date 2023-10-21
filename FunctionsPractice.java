public class FunctionsPractice {
    public static void printSomething(String name, String anotherName) {// define the expected input types
        System.out.println("This is a message " + name + " and " + anotherName);
    }

    public static String makeName(String firstName, String lastName) { // define what the function will return
        //String fullName = firstName + " " + lastName;
        //return fullName;
        return firstName + " " + lastName;
    }
    public static void main(String[] args) {
        printSomething("test", "another test");
        System.out.println(makeName("Ellen", "Houghton"));
    }
}
