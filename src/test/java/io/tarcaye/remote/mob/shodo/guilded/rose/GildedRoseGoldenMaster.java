package io.tarcaye.remote.mob.shodo.guilded.rose;

import io.tarcaye.remote.mob.shodo.guilded.rose.GildedRose;
import io.tarcaye.remote.mob.shodo.guilded.rose.Item;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

public class GildedRoseGoldenMaster {

    @Test
    void goldenMaster() {
        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 100;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < days; i++) {
            result.append("-------- day " + i + " --------" + "\n");
            result.append("name, sellIn, quality" + "\n");
            for (Item item : items) {
                result.append(item + "\n");
            }
            result.append("\n");
            app.updateQuality();
        }
        Approvals.verify(result.toString());
    }

}
