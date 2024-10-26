package AssignmentMVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {  // Extend JFrame to make it a window
    private JTextField firstNumberField = new JTextField(10);
    private JTextField secondNumberField = new JTextField(10);
    private JTextField resultField = new JTextField(10);
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("/");

    public CalculatorView() {
        // Настройка окна
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        // Добавление компонентов на панель
        panel.add(new JLabel("First Number:"));
        panel.add(firstNumberField);
        panel.add(new JLabel("Second Number:"));
        panel.add(secondNumberField);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);


        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        this.add(panel);
    }

    // Получить первое число
    public double getFirstNumber() {
        return Double.parseDouble(firstNumberField.getText());
    }

    // Получить второе число
    public double getSecondNumber() {
        return Double.parseDouble(secondNumberField.getText());
    }

    // Отобразить результат
    public void setResult(String result) {
        resultField.setText(result);
    }

    // Добавление слушателей для кнопок операций
    public void addAdditionListener(ActionListener listenForAddButton) {
        addButton.addActionListener(listenForAddButton);
    }

    public void addSubtractionListener(ActionListener listenForSubtractButton) {
        subtractButton.addActionListener(listenForSubtractButton);
    }

    public void addMultiplicationListener(ActionListener listenForMultiplyButton) {
        multiplyButton.addActionListener(listenForMultiplyButton);
    }

    public void addDivisionListener(ActionListener listenForDivideButton) {
        divideButton.addActionListener(listenForDivideButton);
    }

    // Показать сообщение об ошибке
    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
