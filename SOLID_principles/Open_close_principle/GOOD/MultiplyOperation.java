package SOLID_principles.Open_close_principle.GOOD;

public class MultiplyOperation implements Operation {

    @Override
    public int perform(int num1, int num2) {
        return num1 * num2;
    }

}