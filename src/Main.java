import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Шарик";
        dog.says = "Гав";
        dog.homemadeorwild = "домашнее животное";
        dog.speed = 20;
        System.out.println("Имя собаки: " + dog.name + "\n" + "Собака " + dog.homemadeorwild);

        Animal snail = new Animal();
        snail.name = "Турбо";
        snail.says = "уиии";
        snail.homemadeorwild = "дикое";
        snail.speed = 0.5;
        System.out.println("Улитка говорит: " + snail.says + "\n" + "Скорость улитки: " + snail.speed);
    }
}
