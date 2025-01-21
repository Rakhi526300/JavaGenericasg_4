package Java_4th_Assignment;

public class MainClass {
    public static void main(String[] args) {
        // Non-Generic Usage
        GenericandNongeneric nonGeneric = new GenericandNongeneric();
        nonGeneric.setValue(42);
        System.out.println("Non-Generic Value: " + nonGeneric.getValue());

        // Generic Usage
        Generic<String> genericString = new Generic<>();
        genericString.setValue("Hello, Generics!");
        System.out.println("Generic Value: " + genericString.getValue());
    }
}
