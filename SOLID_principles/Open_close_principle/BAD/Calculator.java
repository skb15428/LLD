package SOLID_principles.Open_close_principle.BAD;

// If we need to add multiple or divide then we need to modify our code
public class Calculator {

    public int calculate(int num1, int num2, String type) {
        int result = 0;
        switch (type) {
            case "add":
                result = num1 + num2;
            case "sub":
                result = num1 - num2;
        }
        return result;
    }
}
