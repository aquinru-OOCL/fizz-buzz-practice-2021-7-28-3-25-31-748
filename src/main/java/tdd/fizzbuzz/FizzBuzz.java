package tdd.fizzbuzz;

public class FizzBuzz {
    public String countOff(int orderNumber) {

        if (orderNumber % 3 == 0) {
            return "Fizz";
        }else if (orderNumber % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(orderNumber);
    }
}
