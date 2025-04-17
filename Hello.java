public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a simple Java program.");

        System.out.println("Addition of 10 & 20 is " + addNumbers(10, 20));
        System.out.println("Addition of 10 & 20 is " + subtractNumbers(10, 20));
        System.out.println("Addition of 10 & 20 is " + MULTIPLICATION(10, 20));
        
    }

    public static int addNumbers(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    public static int subtractNumbers(int a, int b)
    {
        int sum = a-b;
        return sum;
    }

    public static int MULTIPLICATION(int a, int b)
    {
        int sum = a*b;
        return sum;
    }

    
    
}