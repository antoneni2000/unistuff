/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alexb
 */
public class Calculator {
    
    public static void main(String[] args) throws IOException
    {
        System.out.println("Welcome to calculator. Select an option: 1. Add | 2.Substract | 3. Divide | 4. Multiply | 5. Modulo");
        
        System.out.println("Spreadsheet calculator. Select an option: 6. CellSum | 7. CellIncrement | 8.CellDecrement" );
        System.out.println("Fibonacci series caluclator: 9.Fibonacci series");

        
        String inputOption = ReadConsole();
        int option = Integer.parseInt(inputOption);
        
        NumericCalculator numericOperations = new NumericCalculator();
        SpreadSheetCalculator cellOperations = new SpreadSheetCalculator();
        FibonacciSeries fibonacciOperation = new FibonacciSeries();
        
        double result = 0;
        
        switch(option)
        {
            case 1:
                System.out.println("First number: ");
                String input1 = ReadConsole();
                
                System.out.println("Second number: ");
                String input2 = ReadConsole();
                
                double x = Double.parseDouble(input1);
                double y = Double.parseDouble(input2);
                
                result = numericOperations.Sum(x, y);
                
                System.out.println("Result:" + result);
                
                break;
            case 2: //substract
                System.out.println("First number: ");
                String input3 = ReadConsole();

                System.out.println("Second number: ");
                String input4 = ReadConsole();

                double a = Double.parseDouble(input3);
                double b = Double.parseDouble(input4);

                result = numericOperations.Difference(a,b);

                System.out.println("Result: " + result);

                break;

            case 3://divide
                System.out.println("Frist number: ");
                String input5 = ReadConsole();

                System.out.println("Second number: ");
                String input6 = ReadConsole();

                double c = Double.parseDouble(input5);
                double d = Double.parseDouble(input6);

                result = numericOperations.Division(c,d);

                System.out.println("Result: " + result);

                 break;

            case 4://multiply
                System.out.println("First number: ");
                String input7 = ReadConsole();

                System.out.println("Second number: ");
                String input8 = ReadConsole();

                double e = Double.parseDouble(input7);
                double f = Double.parseDouble(input8);

                result = numericOperations.Multiplicaton(e,f);

                System.out.println("Result: " + result);
                break;

            case 5://modulo
                System.out.println("First number: ");
                String input9 = ReadConsole();

                System.out.println("Second number: ");
                String input10 = ReadConsole();

                double g = Double.parseDouble(input9);
                double h = Double.parseDouble(input10);

                result = numericOperations.Modulo(g,h);

                System.out.println("Result: " + result);
                break;



            case 6:
                System.out.println("First cell value:");
                Cell c1 = new Cell();                
                c1.value = ReadConsole();
                
                System.out.println("Second cell value:");
                Cell c2 = new Cell();                
                c2.value = ReadConsole();
                
                Cell sumResult = cellOperations.Sum(c1, c2);                
                System.out.println("Sum of cells: " + sumResult.value);

            case 7:
                System.out.println("First cell value: ");
                Cell c3 = new Cell();
                c3.value = ReadConsole();

                System.out.println("Second cell value: ");
                Cell c4 = new Cell();
                c4.value = ReadConsole();
                cellOperations.Increment(c3);
                cellOperations.Increment(c4);

                System.out.println("Incremented cell 1: " + c3.value);
                
                System.out.println("Incremented cell 2: " + c4.value);
                
                break;

            case 8:
                System.out.println("First cell value: ");
                Cell c5 = new Cell();
                c5.value = ReadConsole();

                System.out.println("Second cell value: ");
                Cell c6 = new Cell();
                c6.value = ReadConsole();
                cellOperations.Decrement(c5);
                cellOperations.Decrement(c6);

                System.out.println("Decremented cell 1: " +c5.value);
                System.out.println("Decremented cell 2: " + c6.value);


                break;

            case 9:
                System.out.println("Enter a number to which you would like to see the Fibonacci series: ");
                String number = ReadConsole();
                double n= Double.parseDouble(number);
                System.out.println("The Fibonacci series until " + n + " is: ");
                result = fibonacciOperation.Fibonacci(n);
                break;

                // add code for computing 7 and 8 spreadsheet operations
        }  
    }

    private static String ReadConsole() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String result = reader.readLine();
        
        return result;
    }    
}
