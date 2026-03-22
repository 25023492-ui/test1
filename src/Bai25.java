class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;

        return title.equals(other.title)
                && author.equals(other.author)
                && price == other.price;
    }
}

class Bai25 {

    public static void main(String[] args) {

        Book b1 = new Book("Java", "James", 10.5);
        Book b2 = new Book("Java", "James", 10.5);

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1.equals(b2): " + b1.equals(b2));
    }
}
