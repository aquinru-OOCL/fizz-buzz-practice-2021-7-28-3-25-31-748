package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int orderNumber;
    String result;

    @Test
    void should_return_order_number_when_count_off_given_normal_case() {
        //Given
        orderNumber = 1;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_3() {
        //Given
        orderNumber = 3;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_5() {
        //Given
        orderNumber = 5;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("Buzz");
    }
}
