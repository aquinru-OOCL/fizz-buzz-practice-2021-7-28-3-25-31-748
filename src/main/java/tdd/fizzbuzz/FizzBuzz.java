package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {

        if (orderNumber % 3 == 0 && orderNumber % 5 == 0 && orderNumber % 7 == 0) {
            return "FizzBuzzWhizz";
        }else if (orderNumber % 3 == 0 && orderNumber % 5 == 0) {
            return "FizzBuzz";
        }else if (orderNumber % 3 == 0 && orderNumber % 7 == 0) {
            return "FizzWhizz";
        }else if (orderNumber % 5 == 0 && orderNumber % 7 == 0) {
            return "BuzzWhizz";
        }else if (orderNumber % 3 == 0) {
            return "Fizz";
        }else if (orderNumber % 5 == 0) {
            return "Buzz";
        }else if (orderNumber % 7 == 0) {
            return "Whizz";
        }

        return String.valueOf(orderNumber);
    }
}
