package io.tarcaye.remote.mob.potter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PotterTest {

    @Test
    public void one_book_should_cost_8() {
        // Given
        int quantity = 1;
        // When
        int bookPrice = calculateTotal(quantity);
        // Test
        assertThat(bookPrice).isEqualTo(8);
    }

    private static final int UNIT_BOOK_PRICE = 8;

    private int calculateTotal(int quantity) {
        return 0;
    }

}
