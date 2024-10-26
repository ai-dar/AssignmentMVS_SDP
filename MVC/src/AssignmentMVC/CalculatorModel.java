package AssignmentMVC;

public class CalculatorModel {
    // Метод сложения
    public double add(double a, double b) {
        return a + b;
    }

    // Метод вычитания
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод умножения
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод деления с проверкой на деление на ноль
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero.");
        }
        return a / b;
    }
}
