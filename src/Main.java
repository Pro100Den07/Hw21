import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


}


class Order {
    private ArrayList<Product> products;
    private String client;
    private String deliveryAddress;
    private boolean paymentStatus;

    public Order(ArrayList<Product> products, String client, String deliveryAddress) {
        this.products = products;
        this.client = client;
        this.deliveryAddress = deliveryAddress;
        this.paymentStatus = false; // По замовчуванню оплата не здійснена
    }

    // Методи для додавання, видалення, зміни замовлень
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void changeDeliveryAddress(String newAddress) {
        this.deliveryAddress = newAddress;
    }

    // Метод для відстеження статусу оплати
    public boolean isPaid() {
        return paymentStatus;
    }
}


class Electronics extends Product {
    private String type;

    public Electronics(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }


}

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Футболка", 25.0, 2));
        products.add(new Electronics("Смартфон", 500.0, 1, "Смартфон"));

        Order order = new Order(products, "Іванов Іван", "вул. Поштова, 1");


        order.addProduct(new Product("Штани", 35.0, 1));


        order.removeProduct(products.get(0));


        order.changeDeliveryAddress("вул. Нова, 10");


        if (order.isPaid()) {
            System.out.println("Замовлення оплачено");
        } else {
            System.out.println("Замовлення ще не оплачено");
        }
    }
}