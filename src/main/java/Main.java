public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("Car");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Car.class.getClassLoader());
    }
}
