import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String input;
    Scanner in = new Scanner(System.in);
    Calculator calculator = new Calculator();

    System.out.println("Welcome to the calculator");
    System.out.println("Enter a command:");
    while (true) {
      input = in.next();
      if (input.equals("add")) {
        System.out.println(calculator.add(in.nextInt(), in.nextInt()));
      } else if (input.equals("subtract")) {
        System.out.println(calculator.subtract(in.nextInt(), in.nextInt()));
      } else if (input.equals("binary")) {
        System.out.println(calculator.intToBinaryNumber(in.nextInt()));
      } else if (input.equals("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(in.nextInt()));
      } else if (input.equals("multiply")) {
        System.out.println(calculator.multiply(in.nextInt(), in.nextInt()));
      } else if (input.equals("divide")) {
        System.out.println(calculator.divide(in.nextInt(), in.nextInt()));
      } else if (input.equals("quit")) {
        return;
      }
    }
    

  }
}
