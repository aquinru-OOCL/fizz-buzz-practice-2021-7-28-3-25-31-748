package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {
        String result = "";

        if (orderNumber % 3 == 0) {
            result += "Fizz";
        }
        if (orderNumber % 5 == 0) {
            result += "Buzz";
        }
        if (orderNumber % 7 == 0) {
            result += "Whizz";
        }
        if (result.length() == 0) {
            result = String.valueOf(orderNumber);
        }

        return result;
    }
}
