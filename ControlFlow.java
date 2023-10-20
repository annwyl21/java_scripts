public class ControlFlow {
    public static void main(String[] args) {
        int ageOfViewer = 21;
        if (ageOfViewer < 15) {
            System.out.println("Viewer can view U, PG and 12 films");
        } else if (ageOfViewer < 18) {
            System.out.println("Viewer can view U, PG, 12 and 15 films.");
        } else {
            System.out.println("All films are available.");
        }
    }
}
