import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        if (x == 0) {
            System.out.print("0 factorial is 1");
        }
        int factorials = 1;
        while (x > 1) {
            factorials = x * factorials;
            x = x - 1;
        }
        // System.out.println("The factorial is " + factorials);

        return factorials;
    }


    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double numberE = 0;
        int x = 2;
        while (numberE < (Math.E - 2)) { // math.E - 2 because factorial 0 + factorial 1 = 2
            numberE = (1 / factorial(x)) + numberE;
            x += 1;
            // System.out.println(numberE);
        }
        System.out.println("e is " + (numberE + 2));

        return -1.0;
    }

    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double z) {
        double n = 10.0;
        double m = 0.0;
        while (true){
            m = (n + (z / n)) / 2;
            if (m == n) {
                break;
            }
            n = m;
            // System.out.println(m);
        }
        System.out.println(n);
        return -1.0;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number ");
        int x = scan.nextInt();

        factorial(x);

        calculateE();

        System.out.println("Enter a number you would like the square root of :");
        double z = scan.nextDouble();

        babylonian(z);


        

        scan.close();
    }
}
