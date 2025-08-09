package Day3;

class Person {
    void display() {
        System.out.println("Hello from Person");
    }
}

public class anonymousInnerClassExample {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            void display() {
                System.out.println("Hello from Anonymous Inner Class!");
               secret();
            }

            void secret() {
                System.out.println("This is a secret method inside the anonymous class.");
            }
        };

        p.display(); // ✅ Works and prints both messages
    }
}
