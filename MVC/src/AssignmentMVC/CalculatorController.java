package AssignmentMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        // Добавление слушателей для каждой кнопки
        this.view.addAdditionListener(new AddListener());
        this.view.addSubtractionListener(new SubtractListener());
        this.view.addMultiplicationListener(new MultiplyListener());
        this.view.addDivisionListener(new DivideListener());
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber, result;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                result = model.add(firstNumber, secondNumber);
                view.setResult(Double.toString(result));
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter a valid number.");
            }
        }
    }

    class SubtractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber, result;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                result = model.subtract(firstNumber, secondNumber);
                view.setResult(Double.toString(result));
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter a valid number.");
            }
        }
    }

    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber, result;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                result = model.multiply(firstNumber, secondNumber);
                view.setResult(Double.toString(result));
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter a valid number.");
            }
        }
    }

    class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber, result;
            try {
                firstNumber = view.getFirstNumber();
                secondNumber = view.getSecondNumber();
                result = model.divide(firstNumber, secondNumber);
                view.setResult(Double.toString(result));
            } catch (ArithmeticException ex) {
                view.displayErrorMessage(ex.getMessage());
            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Please enter a valid number.");
            }
        }
    }
}
