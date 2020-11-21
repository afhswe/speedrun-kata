package org.training.speedrun.stage4;

/**
 * Make this code clean.
 */
public class Stage4 {

    double compute(double[] cart, boolean isVipClient, boolean isBlackFriday) {
        double overallPrice = 0;
        int numberOfItems = cart.length;
        for (int i = 0; i < numberOfItems; ++i) {
            overallPrice += cart[i];
        }
        int discountPercent = calculateDiscountPercent(numberOfItems, isBlackFriday, isVipClient);
        double discountMoney = calculateDiscountMoney(overallPrice, discountPercent);
        return overallPrice - discountMoney;
    }

    private double calculateDiscountMoney(double overallPrice, int discountPercent) {
        double discountMoney = discountPercent * overallPrice / 100;
        return discountMoney;
    }

    int calculateDiscountPercent(int numberOfItems, boolean isBlackFriday, boolean isVipClient) {
        int discountPercent = calculateBaseDiscount(numberOfItems);

        if (isBlackFriday) {
            discountPercent += 20;
        }

        if (isVipClient) {
            discountPercent += 5;
        }
        return discountPercent;
    }

    private int calculateBaseDiscount(int numberOfItems) {
        int discountPercent = 0;
        if (numberOfItems >= 5 && numberOfItems < 10) {
            discountPercent += 4;
        } else if (numberOfItems >= 10) {
            discountPercent += 10;
        }
        return discountPercent;
    }
}
