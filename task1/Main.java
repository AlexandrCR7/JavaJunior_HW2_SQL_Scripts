package task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        /*
        Задача 1:
Создайте абстрактный класс "task1.Animal" с полями "name" и "age".
Реализуйте два класса-наследника от "task1.Animal" (например, "task1.Dog" и "task1.Cat") с уникальными полями и методами.
Создайте массив объектов типа "task1.Animal" и с использованием Reflection API выполните следующие действия:
Выведите на экран информацию о каждом объекте.
Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

Дополнительная задача:

Доработайте метод генерации запроса на удаление объекта из таблицы БД (DELETE FROM <Table> WHERE ID = '<id>')
В классе QueryBuilder который мы разработали на семинаре.
         */

        Animal[] animal = {new Cat(), new Dog()};

        for (Animal an : animal) {
            Class<?> animalClass = an.getClass();
            Field[] fields = animalClass.getDeclaredFields();
            for (Field fld : fields) {
                System.out.println("Поле: " + fld.getName());
                System.out.println(" ");
            }

            Constructor[] constructors = animalClass.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                Object personInstance = constructors[i].newInstance(null);
                Method methodMakeVoice = animalClass.getDeclaredMethod("makeSound");
                methodMakeVoice.invoke(personInstance);
                System.out.println(personInstance);
                System.out.println(" ");
            }
        }
    }
}
