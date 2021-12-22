package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        for (short i = 0; i < 100; ++i) {
            System.out.println("i: " + i);
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FooBar");
            } else if (i % 3 == 0) {
                System.out.println("Foo");
            } else if (i % 5 == 0) {
                System.out.println("Bar");
            }
            System.out.println("-------------------------");
        }
    }
}
