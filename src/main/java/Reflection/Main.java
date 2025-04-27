package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String fruit = "Apple";
        String fruit2 = "Banana";
        Class<?> myClass1 = Class.forName("Reflection.Apple.Helpers");
        Class<?> myClass2 = Class.forName("Reflection." + fruit2 + ".Helpers");

        Method myMethod1 = myClass1.getMethod("fruit", String.class);
        myMethod1.invoke(null, "peeling");

        Method myMethod2 = myClass2.getMethod("fruit", String.class);
        myMethod2.invoke(null, "peeling");
    }
}
