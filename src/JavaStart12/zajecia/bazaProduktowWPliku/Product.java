package JavaStart12.zajecia.bazaProduktowWPliku;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 35467645443234567L;

    String name;
    String producer;
    double price;

    public Product(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
