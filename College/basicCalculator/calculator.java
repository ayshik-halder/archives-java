import java.util.*;

class calculator {
    public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);
    System.out.println("Enter first number");
    number1 = sc.nextDouble();
    System.out.println("Enter second number");
    number2 = sc.nextDouble();
    switch (operator) {
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}

