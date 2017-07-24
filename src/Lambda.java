public class Lambda {
    public static void main(String[] args) {

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation substraction = (a, b) -> a - b;

        //with return statment along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return stament and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, substraction));
        System.out.println("10 * 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));

        GreetingService greetingService = message -> System.out.println(message);
        greetingService.sayMessage("eiei");
        greetingService.sayMessage("555");

    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}


