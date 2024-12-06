package Assessment1;

public class class3 {
        String name;
        int age;

        // Constructor
        public class3(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("My name is: " + name);
            System.out.println("My Age is: " + age);
        }

        public static void main(String[] args) {
            class3 person = new class3("Tahia Sharmin Rakhi", 25);
            person.show();
        }
    }

