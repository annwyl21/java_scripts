public class Maps {
    public static void main(String[] args) {
        // hash maps
        // create an empty hashMap
        java.util.HashMap<String, String> myMap = new java.util.HashMap<String, String>();
        // add elements
        myMap.put("Jim", "01234 56 789");
        myMap.put("Frank", "987654 320");
        System.out.println(myMap.get("Jim"));

        myMap.put("Frank", "test"); // changing the value
        for (String element: myMap.values()) {
            System.out.println(element);
        }

        for (String element: myMap.keySet()) {
            System.out.println(element);
        }

        for (java.util.Map.Entry<String, String> element: myMap.entrySet()) {
            System.out.println(element); // key and values
            System.out.println(element.getKey()); // just a key
            System.out.println(element.getValue()); // just a value
        }



    }
}

/*
In Java, `java.util` is a package, and it's one of the many packages in the Java Standard Library.
A package in Java is a namespace that organizes a set of related classes and interfaces.

the reference `java.util.HashMap`:
- `java`:
This is the top-level domain,
typically representing the organization that created the package
(in this case, the Java platform itself).

- `util`:
This stands for "utilities".
The `java.util` package contains a collection
of framework classes and utility methods that are generally useful.
This package includes classes for data structures
(like `ArrayList`, `LinkedList`, `HashSet`, and `HashMap`),
date and time (`Date`, `Calendar`),
event model classes,
and other miscellaneous utility classes.

- `HashMap`:
This is a class inside the `java.util` package.
The `HashMap` class provides an implementation of the `Map` interface,
which allows you to store key-value pairs.

When you type `java.util.HashMap`,
you are specifying the fully qualified name of the `HashMap` class,
which tells the Java compiler exactly where to find the definition of that class.
 */
