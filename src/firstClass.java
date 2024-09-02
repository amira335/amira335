public class firstClass{
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        x = x - 3;
        // Example 1: Breakpoint
        int result = multiply(x, y);  // Set a breakpoint here

        System.out.println("Result: " + result);

        // Example 2: Stack Trace
        try {
            int division = divide(x, y);  // This will cause an error
            System.out.println("Division Result: ");
        } catch (ArithmeticException e) {
            e.printStackTrace();  // Print stack trace to console
        }
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;  // Division by zero will cause an ArithmeticException
    }
}
