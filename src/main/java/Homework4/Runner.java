package main.java.Homework4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        UserMeta human = new UserMeta();

        //3.3 При нахождении @GetMetaData над методом, печатаем сколько времени выполнялся метод.
        for (Method declaredMethod : UserMeta.class.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(GetMetaData.class)) {
                long start = System.currentTimeMillis();
                declaredMethod.invoke(human);
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            }
        }
        //3.2 При нахождении @GetMetaData над атрибутом, чтобы печаталось значение атрибута этого поля
        for (Field declaredField : human.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(GetMetaData.class)) {
                declaredField.setAccessible(true);
                System.out.println(declaredField);
            }
        }
        //3.1 При нахождении @GetMetaData над классом, то печатаем все атрибуты класса
        for (Method declaredMethod : UserMeta.class.getDeclaredMethods()) {
            if (declaredMethod.isAnnotationPresent(GetMetaData.class)) {
                System.out.println(declaredMethod);
            }
        }
    }
}
