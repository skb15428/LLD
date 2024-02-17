package SOLID_principles.Dependency_inversion_principle.BAD;

// Here the higher level module Calculator depends on lower level module AddOperation and SubstractOperation
public class Calculator {
    public int calculate(int a, int b, String type) {
        int res = 0;
        switch (type) {
            case "add":
                AddOperation addOperation = new AddOperation();
                res = addOperation.add(a, b);
                break;
            case "sub":
                SubstractOperation substractOperation = new SubstractOperation();
                res = substractOperation.sub(a, b);
                break;
        }
        return res;
    }
}
