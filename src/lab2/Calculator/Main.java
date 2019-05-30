package lab2.Calculator;

public class Main {
    static int memberVariable=10;

    public static void main(String[]args)
    {
        printName();
        int bucket = sum(2,3);
        System.out.println(bucket);
        int galeata = sum(4,2);
        System.out.println(galeata);

    }

        public static void printName()
    {
        System.out.println("hello");
        System.out.println("Cosmin");
        System.out.println("Sakura");

    }

        public static int sum(int firstNumber, int secondNumber)
    {

    int result = firstNumber + secondNumber;
    return result;
    }
        /* public static void printName() */
    {
       // System.out.println("Sakura");

    }
}
