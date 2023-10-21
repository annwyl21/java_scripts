public class Collections {
    public static void main(String[] args) {
        // array
        //int[] myIntArray = {23, 34, 45, 56}; int is primitive datatype, Integer is the int class with extra stuff
        Integer[] myIntArray = {23, 34, 45, 56}; // immutable in terms of length, items can be changed
        myIntArray[0] = 25; // reassign
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray.length);

        for (int element: myIntArray) {
            System.out.println("Array " + element);
        }

        // List allows elements to be added
        // java.util is a package
        java.util.List<Integer> myList = java.util.Arrays.asList(myIntArray);
        myList.set(0, 89); // reassign by calling a set function and pass in arguments

        for (int element: myList) {
            System.out.println("List " + element);
        }
        System.out.println(myList.size());

        // ArrayList
        java.util.ArrayList<Integer> myArrayList = new java.util.ArrayList<Integer>(myList);// items can be added
        myArrayList.set(2, 89); // reassign an element
        myArrayList.add(1234); // lots of methods, hit the .

        for (int element: myArrayList) {
            System.out.println("ArrayList " + element);
        }
        System.out.println(myArrayList.size()); // not available on arrays only on ArrayList, it is length of array
    }
}
