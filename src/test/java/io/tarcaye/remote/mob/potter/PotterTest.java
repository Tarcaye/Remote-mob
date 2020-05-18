package io.tarcaye.remote.mob.potter;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PotterTest {

    @Test
    public void one_book_should_cost_8() {
        // Given
        int bookPrice= 8;
        // When
        int quantity = 1;
        // Test
        assertThat(calculateTotal(bookPrice, quantity)).isEqualTo(8);
    }

    private int calculateTotal(int bookPrice, int quantity) {
        return bookPrice * quantity;
    }

}
