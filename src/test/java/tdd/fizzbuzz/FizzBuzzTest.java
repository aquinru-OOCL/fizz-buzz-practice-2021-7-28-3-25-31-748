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

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_7() {
        //Given
        orderNumber = 7;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("Whizz");
    }

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_3_and_5() {
        //Given
        orderNumber = 15;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_3_and_7() {
        //Given
        orderNumber = 21;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("FizzWhizz");
    }

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_5_7() {
        //Given
        orderNumber = 35;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_return_order_number_when_count_off_given_multiple_of_3_5_and_7() {
        //Given
        orderNumber = 105;

        //When
        result = fizzBuzz.countOff(orderNumber);

        //Then
        assertThat(result).isEqualTo("FizzBuzzWhizz");
    }
}
