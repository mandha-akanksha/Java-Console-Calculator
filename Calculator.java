package Day1_task;
 import java.util.Scanner;
 public class Calculator{

    //Method for Addition
    public static double add(double a, double b){
        return a + b;
    }
    //Method for Substraction
    public static double subtract(double a, double b){
        return a - b;
    }
    //Method for Multiplication
    public static double multiply(double a, double b){
        return a * b;
    }
    //Method for Division
    public static double divide(double a, double b){
        if(b!=0)
        return a / b;
        else {
        System.out.println("Cannot divide by zero");
        return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Choose Operation: (+, -, *, /)");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch(operator){
                case '+': {
                          result = add(num1, num2);
                         }
                         break;
                case '-' : {
                          result = subtract(num1, num2);
                         }
                         break;
                 case '*' : {
                          result = multiply(num1, num2);
                         }
                         break;
                 case '/' : {
                          result = divide(num1, num2);
                         }
                         break;
                    default:
                       System.out.println("Invalid operator");
                       validOperation = false;
            }

            if(validOperation){
                System.out.println("Result: "+result);
            }

            System.out.println("Do you want to perform another calculation? (y/n): ");
            char choice = scanner.next().charAt(0);

            if(choice != 'y' && choice != 'Y'){
                break; //for exit the loop
            }
        }
        System.out.println("Calculator exited. Thank you!");
    } 
 }