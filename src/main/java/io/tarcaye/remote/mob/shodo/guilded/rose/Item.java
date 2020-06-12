package io.tarcaye.remote.mob.shodo.guilded.rose;

import io.tarcaye.remote.mob.shodo.guilded.rose.GildedRose;

public class Item {

    public String name;

    public int sellIn;

    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = new Quality(quality);
    }

    void update() {
        switch (name) {
            case GildedRose.AGED_BRIE:
                increaseQuality();
                decreaseSellIn();
                if (sellIn < 0) {
                    increaseQuality();
                }
                break;
            case GildedRose.BACKSTAGE_PASSES:
                increaseQuality();
                if (sellIn <= 10) {
                    increaseQuality();
                }
                if (sellIn <= 5) {
                    increaseQuality();

                }
                decreaseSellIn();

                if (sellIn < 0) {
                    quality = new Quality(0);
                }
                break;
            case GildedRose.SULFURAS_HAND_OF_RAGNAROS:
                break;
            default:
                decreaseQuality();
                decreaseSellIn();

                if (sellIn < 0) {
                    decreaseQuality();
                }
                break;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality.quality;
    }

    private void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    private void decreaseQuality() {
        this.quality = quality.decrease();

    }

    private void increaseQuality() {
        quality = quality.increase();
    }

    private static class Quality {
        private final int quality;

        private Quality(int quality) {
            this.quality = quality;
        }

        public int getQuality() {
            return quality;
        }

        private Quality decrease() {
            return new Quality(Math.max(0, getQuality() - 1));
        }

        public Quality increase() {
            return new Quality(Math.min(50, getQuality() + 1));
        }
    }
}
