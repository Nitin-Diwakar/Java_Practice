package ExceptionHandling;

class DivisionException extends Exception {
    public DivisionException(String message) {
        super(message);
    }
}


class IndeterminateException extends Exception {
    public IndeterminateException(String message) {
        super(message);
    }
}


interface MathOperation {
    int sum(int n1, int n2);
    int subtract(int n1, int n2);
    int division(int n1, int n2) throws DivisionException, IndeterminateException;
}

class Calculator implements MathOperation {
    @Override
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int division(int n1, int n2) throws DivisionException, IndeterminateException {
        if (n2 == 0) {
            throw new DivisionException("Division by zero");
        } else if (n1 == 0 && n2 == 0) {
            throw new IndeterminateException("Indeterminate form (0/0)");
        } else {
            return n1 / n2;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int test1 = calculator.sum(5, 3);
            System.out.println("Sum: " + test1);

            int test2 = calculator.subtract(5, 3);
            System.out.println("Difference: " + test2);


            int test3= calculator.division(5, 0);
            System.out.println("Division: " + test3);


            int test4 = calculator.division(0, 0);
            System.out.println("Division: " + test4);
        } catch (DivisionException | IndeterminateException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}

