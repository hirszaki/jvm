import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        try {
            //Aspect Oriented Programming

            System.out.println("Methods:");
            Class<? extends Object> aClass = Class.forName("Car");
            Method[] methods = aClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            System.out.println("Fields:");
            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            System.out.println("Constructor:");
            Constructor<?>[] constructors = aClass.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println(aClass.getClassLoader());

            Car car  = (Car) aClass.newInstance();


            System.out.println(car.color);
            System.out.println(car.brand);
            car.drive();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
