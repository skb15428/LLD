package SOLID_principles.Dependency_inversion_principle.GOOD;

// Here the higher level module is not devpendent on lower level module, both are dependent on abstraction i.e CalculateOperation
public class Calculator {
    public int calculate(int a, int b, CalculateOperation calculateOperation) {
        return calculateOperation.calculate(a, b);
    }
}
