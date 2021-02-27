import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String input = args[0];
    Scanner in = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command:");
    while (true) {
      if (input.equals("add")) {
        System.out.println(calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
      } else if (input.equals("subtract")) {
        System.out.println(calculator.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
      } else if (input.equals("binary")) {
        System.out.println(calculator.intToBinaryNumber(Integer.parseInt(args[1])));
      } else if (input.equals("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));
      } else if (input.equals("multiply")) {
        System.out.println(calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
      } else if (input.equals("divide")) {
        System.out.println(calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
      } else if (input.equals("quit")) {
        return;
      }
    }
    

  }
}
