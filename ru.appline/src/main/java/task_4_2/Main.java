package task_4_2;

public class Main {
    public static void main(String[] args) {

        Candy candy = new Candy("Toffee", 13.5f, 10.1f, "caramel");
        Chocolate chocolate = new Chocolate("AlpenGold", 5.5f, 3.8f, 50);
        Jellybean jellybean = new Jellybean("Gummy", 9.3f, 7.2f, "lemon");
        Marshmallow marshmallow = new Marshmallow("Haribo", 5.6f, 6.6f, "pink");

        float generalWeight = candy.getWeight() + chocolate.getWeight() + jellybean.getWeight() + marshmallow.getWeight();
        float generalPrice = candy.getPrice() + chocolate.getPrice() + jellybean.getPrice() + marshmallow.getPrice();

        System.out.println("Общий вес подарка: " + generalWeight);
        System.out.println("Общая стоимость подарка: " + generalPrice);

        System.out.println(candy.toString() +
                "\n" + chocolate.toString() +
                "\n" + jellybean.toString() +
                "\n" + marshmallow.toString());

    }
}
