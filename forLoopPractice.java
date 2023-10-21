import java.util.ArrayList;

public class forLoopPractice {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 6, 8, 234, 456, 234234, 34};

        for(int element: intArray) { // for each loop specify type expected in return, loop variable name & variable to iterate over
            System.out.println(element);
        }

        for (int i=0; i<intArray.length; i++) { //use the index
            System.out.println(intArray[i]);
        }

        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("No 1");
        nameList.add("No 2");
        nameList.add("No 3");
        nameList.add("No 4");
        nameList.add("No 5");
        nameList.add("No 6");

        for(String element: nameList) {
            System.out.println(element);
        }

        for (int i=0; i< nameList.size(); i++) { //use the index to get the item
            System.out.println(nameList.get(i));
        }
    }
}
