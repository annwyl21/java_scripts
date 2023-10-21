public class whileLoops {
    public static void main(String[] args) {
//        boolean loopControl = true;
//        while (loopControl) {
//            System.out.println("infinite loop");
//        }

        int counter = 0;
        while (counter < 10) {
            if (counter % 2 == 0)
                System.out.println("Counter: " + counter);
            else
                System.out.println("Odd Number");
            //counter = counter +1;
            //counter +=1;
            counter++;
        }

        // do while
        int counter2 = 0;
        do {
            if (counter2 % 2 == 0)
                System.out.println("do while counter: " + counter2);
            else
                System.out.println("do while");
            counter2++;
        } while (counter2 < 10);

    }
}
