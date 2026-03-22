import java.util.Scanner;

class StoreProduct {

    private String name;
    private double price;
    private int quantity;
    private double discount;

    private static double taxRate = 0.1;
    private static double totalRevenue = 0;

    public StoreProduct(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public static void updateTaxRate(double newRate) {
        taxRate = newRate;
    }

    public double calculateFinalPrice() {
        return (price - discount) * (1 + taxRate);
    }

    public void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void sell(int amount) {

        if (amount <= quantity) {

            quantity -= amount;

            double money = amount * calculateFinalPrice();

            totalRevenue += money;

            System.out.println("Ban thanh cong");

        } else {

            System.err.println("Khong du hang trong kho");
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}

class Bai29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        double price1 = sc.nextDouble();
        int quantity1 = sc.nextInt();
        double discount1 = sc.nextDouble();
        sc.nextLine();

        String name2 = sc.nextLine();
        double price2 = sc.nextDouble();
        int quantity2 = sc.nextInt();
        double discount2 = sc.nextDouble();

        StoreProduct p1 = new StoreProduct(name1, price1, quantity1, discount1);
        StoreProduct p2 = new StoreProduct(name2, price2, quantity2, discount2);

        int buy1 = sc.nextInt();
        int buy2 = sc.nextInt();

        p1.sell(buy1);
        p2.sell(buy2);

        System.out.println(p1.calculateFinalPrice());
        System.out.println(p2.calculateFinalPrice());

        StoreProduct.updateTaxRate(0.08);

        System.out.println(p1.calculateFinalPrice());
        System.out.println(p2.calculateFinalPrice());

        p1.updateDiscount(10);

        System.out.println(p1.calculateFinalPrice());
        System.out.println(p2.calculateFinalPrice());

        System.out.println(StoreProduct.getTotalRevenue());
    }
}