public class Car {
    Color color;
    String brand;
    private String owner;

    public Car() {
        color = Color.GREEN;
        brand = "unknow";
    }

    public Car(Color color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void drive() {
        System.out.println("brum brum");
    }
}
