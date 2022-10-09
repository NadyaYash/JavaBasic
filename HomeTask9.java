/**
 * Java Basic HomeTask9
 *
 * @author Nadzeya Yashchuk
 * @todo 05.10.2022
 * @date 09.10.2022
 */

public class HomeTask9 {
    public static void main(String[] args) {
        catDog();
        childCatDog();


    }

    public static void catDog() {
        Cat cat = new Cat("Barsik", "red", 2);
        System.out.println(cat);
        System.out.println(cat.voice());

        Dog dog = new Dog("Sharik", "red", 6);
        System.out.println(dog);
        System.out.println(dog.voice());
    }

    public static void childCatDog() {
        Cat cat = new Cat("Barsik", "red", 2);
        Dog dog = new Dog("Sharik", "red", 6);
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
    }
}
