package SOLID_principles.Open_close_principle.GOOD;

// There is no modification in this class if we need to add other operation
public class Calculator {
    public int calculate(int num1, int num2, Operation operation) {
        return operation.perform(num1, num2);
    }
}
