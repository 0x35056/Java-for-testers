package task_4_2;

class Marshmallow extends Gift {
    private String color;

    public Marshmallow(String name, float weight, float price, String size) {
        super(name, weight, price);
        this.color = size;
    }

    public String getColor() {

        return color;
    }

    public void setSize(String color) {

        this.color = color;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + ", " +
                "вес: " + getWeight() + ", " +
                "цена: " + getPrice() + ", " +
                "цвет: " + getColor();
    }
}
