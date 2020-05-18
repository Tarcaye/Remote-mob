package io.tarcaye.remote.mob.potter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PotterTest {

    private static final int UNIT_BOOK_PRICE = 8;

    @Test
    public void one_book_should_cost_8() {
        // Given
        int bookQuantity = 1;

        // When
        int bookPrice = calculateTotal(bookQuantity);

        // Test
        assertThat(bookPrice).isEqualTo(8);
    }

    // TODO TCA: 18/05/2020 rename me
    @Test
    public void toto() {
        // Given
        int bookQuantity = 2;

        // When
        int bookPrice = calculateTotal(bookQuantity);

        // Test
        assertThat(bookPrice).isEqualTo(16);
    }

    private int calculateTotal(int i) {
        return i*UNIT_BOOK_PRICE;
    }

}
