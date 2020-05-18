package io.tarcaye.remote.mob.potter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
    public void same_book_ordered_twice_cost_16() {
        // Given
        int bookQuantity = 2;

        // When
        int bookPrice = calculateTotal(bookQuantity);

        // Test
        assertThat(bookPrice).isEqualTo(16);
    }

    @Test
    public void ordering_two_different_books_leads_to_a_5_percent_discount() {
        // Given
        int bookQuantity = 2;

        // When
        int bookPrice = calculateTotal(Arrays.asList(1, 2));

        // Test
        assertThat(bookPrice).isEqualTo(15.20);
    }
    private int calculateTotal(List<Integer> books) {
        return 0;
    }
    private int calculateTotal(int quantity) {
        return quantity*UNIT_BOOK_PRICE;
    }

}
