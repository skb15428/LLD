package SOLID_principles.Dependency_inversion_principle.GOOD;

public class AddOperation implements CalculateOperation {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

}
