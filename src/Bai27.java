class Product {

    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Inventory {

    private Product[] items;

    public Inventory(Product[] arr) {

        items = new Product[arr.length];

        for (int i = 0; i < arr.length; i++) {
            items[i] = new Product("x", arr[i].getName(), arr[i].getPrice());
        }
    }

    public void print() {
        for (Product p : items) {
            System.out.println(p.getName() + " " + p.getPrice());
        }
    }
}

class Bai27 {

    public static void main(String[] args) {

        Product[] arr = {
                new Product("1", "Laptop", 1000),
                new Product("2", "Mouse", 20)
        };

        Inventory kho = new Inventory(arr);

        arr[0].setPrice(5000);

        kho.print();
    }
}