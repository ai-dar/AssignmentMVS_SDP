# MVC Calculator Application

## Project Overview

This application is a simple calculator built using the Model-View-Controller (MVC) design pattern. The calculator performs basic arithmetic operations such as addition, subtraction, multiplication, and division, with error handling for division by zero. The project is written in Java using the Swing library for the user interface.

## Features

- Support for basic arithmetic operations: addition, subtraction, multiplication, division.
- Error handling for division by zero.
- Simple and intuitive user interface.
- Clear separation of logic into Model, View, and Controller components.

## Project Structure

The project is divided into three main parts:

1. **Model**: Contains the logic for performing calculations. Includes methods for:
   - `add(double a, double b)`
   - `subtract(double a, double b)`
   - `multiply(double a, double b)`
   - `divide(double a, double b)` with error handling for division by zero.
   
2. **View**: Responsible for the user interface. Includes:
   - Input fields for numbers.
   - Buttons for arithmetic operations.
   - A field to display the result or error messages.

3. **Controller**: Manages the interaction between the Model and the View. It handles button click events, invokes the Model methods, and updates the result in the View.

## How to Run

### Prerequisites

- Java Development Kit (JDK) version 8 or higher.

### Steps to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/your-repo/mvc-calculator.git
    ```

2. Navigate to the project directory:
    ```bash
    cd mvc-calculator
    ```

3. Compile the Java files:
    ```bash
    javac src/*.java
    ```

4. Run the application:
    ```bash
    java src/CalculatorApp
    ```

## Example Usage

1. Enter two numbers in the input fields.
2. Click one of the operation buttons (`+`, `-`, `*`, `/`).
3. The result will appear in the result field.
4. If division by zero is attempted, an error message will be displayed.

## Error Handling

- **Invalid Input**: If the user enters something other than numbers, an error message will be shown: "Please enter a valid number".
- **Division by Zero**: Attempting to divide by zero will trigger the message: "Error: Division by zero".

## Future Improvements

- Add support for additional mathematical operations (e.g., square root, exponentiation).
- Improve the user interface design for better usability.
- Implement keyboard input for entering numbers and selecting operations.
