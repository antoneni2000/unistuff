package lab2;

public class FibonacciSeries {
    public double Fibonacci(double n) {
        double firstNumber = 0, secondNumber = 1, thirdNumber ;
        System.out.print(firstNumber + "; "  + secondNumber+"; ");
        do
        {
            thirdNumber = firstNumber + secondNumber;
            System.out.print(thirdNumber + "; ");
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }while(thirdNumber <= (n-firstNumber));

        return 0;
    }
}
