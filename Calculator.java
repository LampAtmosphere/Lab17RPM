import java.util.Scanner;

public class Calculator<T extends Number> {
    
    public T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a + (Double) b);
        }
        return null;
    }
    
    public T subtract(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a - (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a - (Double) b);
        }
        return null;
    }
    
    public T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a * (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a * (Double) b);
        }
        return null;
    }
    
    public T divide(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Object) ((Integer) a / (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Object) ((Double) a / (Double) b);
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите математическую операцию (+, -, *, /): ");
        String operation = scanner.next();

        Calculator calculator = new Calculator();

        switch (operation) {
            case "+":
                System.out.println(calculator.add(number1, number2));
                break;
            case "-":
                System.out.println(calculator.subtract(number1, number2));
                break;
            case "*":
                System.out.println(calculator.multiply(number1, number2));
                break;
            case "/":
                System.out.println(calculator.divide(number1, number2));
                break;
            default:
                System.out.println("Некорректная операция");
                break;
        }
    }
}
