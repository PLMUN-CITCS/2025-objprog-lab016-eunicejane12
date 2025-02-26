public class MethodOverloading {

    public static void main(String[] args) {
        // Calling the overloaded methods
        printValue(10);      // Calls the method with int parameter
        printValue(3.14);    // Calls the method with double parameter
        printValue("Hello!"); // Calls the method with String parameter
    }

    // First method: Accepts an integer
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second method: Accepts a double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third method: Accepts a String
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
