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
}
