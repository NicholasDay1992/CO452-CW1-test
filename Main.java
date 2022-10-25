public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        int num = InputReader.getInt("Enter a number > ");
        if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else if (num == 0)
        {
            System.out.println("Number is 0");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
