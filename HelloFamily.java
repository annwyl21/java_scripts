public class HelloFamily {
    public static void main(String[] args) {
        System.out.println("Hello Mum");
        helloDad();
        System.out.println(helloOther("Abi"));
    }
    public static void helloDad() {
        System.out.println("Hello Dad");
    }
    public static String helloOther(String name) {
        return ("Hello " + name);
    }
}
