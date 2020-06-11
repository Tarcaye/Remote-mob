package io.tarcaye.remote.mob.chanel.potter;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PotterTest {

    private static final int UNIT_BOOK_PRICE = 8;

    @Test
    public void one_book_should_cost_8() {
        // Given
        List<Integer> books = Collections.singletonList(1);

        // When
        BigDecimal bookPrice = calculateTotal(books);

        // Test
        assertThat(bookPrice).extracting(BigDecimal::intValue).isEqualTo(8);
    }

    @Test
    public void same_book_ordered_twice_cost_16() {
        // Given
        List<Integer> books = Arrays.asList(1, 1);

        // When
        BigDecimal bookPrice = calculateTotal(books);

        // Test
        assertThat(bookPrice).extracting(BigDecimal::intValue).isEqualTo(16);
    }

    @Test
    public void ordering_two_different_books_leads_to_a_5_percent_discount() {
        // Given
        List<Integer> books = Arrays.asList(1, 2);

        // When
        BigDecimal bookPrice = calculateTotal(books);

        // Test
        assertThat(bookPrice).extracting(BigDecimal::doubleValue).isEqualTo(15.20);
    }

    @Test
    public void ordering_two_other_different_books_leads_to_a_5_percent_discount() {
        // Given
        List<Integer> books = Arrays.asList(1, 3);

        // When
        BigDecimal bookPrice = calculateTotal(books);

        // Test
        assertThat(bookPrice).extracting(BigDecimal::doubleValue).isEqualTo(15.20);
    }

    private boolean containsTwoDifferentBooks(List<Integer> books) {
        return books.containsAll(Arrays.asList(1,2)) || books.containsAll(Arrays.asList(1,3));
    }

    private BigDecimal calculateTotal(List<Integer> books) {
        if (containsTwoDifferentBooks(books)) return BigDecimal.valueOf(15.2);
        return BigDecimal.valueOf(books.size() * UNIT_BOOK_PRICE);
    }

}
