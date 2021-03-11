package comm.example;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int divide()
    {

        return firstNumber/secondNumber;
    }
}
