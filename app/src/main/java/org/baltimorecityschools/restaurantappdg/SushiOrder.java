package org.baltimorecityschools.restaurantappdg;

public class SushiOrder {

    private String sideText;
    private boolean isCooked;
    private int quantity;
    private static final double BASE_PRICE  = 9.00;
    private double price;


    public SushiOrder(boolean isCooked, String sideText, int quantity) {
        this.isCooked = isCooked;
        this.sideText = sideText;
        this.quantity = quantity;
    }

    public SushiOrder(){
        isCooked = true;
        sideText = "None";
        quantity = 0;
    }

    public String getSideText() {
        return sideText;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSideText(String sideText) {
        this.sideText = sideText;
        setPrice();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setPrice();
    }

    public void setCooked(boolean cooked) {
        isCooked = cooked;
        setPrice();
    }

    public void setPrice() {
        price = BASE_PRICE;
        if (sideText.contains("Yakitori")) price += 4.00;
        if (sideText.contains("Rice")) price += 5.29;
        if (sideText.contains("Wasabi")) price += 0.50;
        if (isCooked) price += 2.00;

        price *= quantity;
    }

    @Override
    public String toString() {
        return "SushiOrder{" +
                "sideText='" + sideText + '\'' +
                ", isCooked=" + isCooked +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
