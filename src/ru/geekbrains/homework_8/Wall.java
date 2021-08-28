package ru.geekbrains.homework_8;

public class Wall { // Создание класса стены
    public int high;
    private String name;
    private int maxJump;

    public Wall(int high) { // Конструктор класса с принимаемой высотой
        this.high = high;
    }

    public void isActionH(Human h) { // Метод прыжков для людей
        this.name = h.name;
        this.maxJump = h.maxJump;

        if (maxJump >= high && h.getAction()) { // Проверка на возможность прыжка
            System.out.printf("%s jump %s meters%n", name, high);
            h.setAction(true);
        } else if (maxJump < high && h.getAction()) {
            System.out.printf("%s cant jump %s meters%n", name, high);
            h.setAction(false); // Изменение значения переменной действий человека
        }
    }

    public void isActionC(Cat c) { // Метод прыжков для котов
        this.name = c.name;
        this.maxJump = c.maxJump;

        if (maxJump >= high && c.getAction()) { // Проверка на возможность прыжка
            System.out.printf("%s jump %s meters%n", name, high);
            c.setAction(true);
        } else if (maxJump < high && c.getAction()) {
            System.out.printf("%s cant jump %s meters%n", name, high);
            c.setAction(false); // Изменение значения переменной действий кота
        }
    }

    public void isActionR(Robot r) { // Метод прыжков для роботов
        this.name = r.name;
        this.maxJump = r.maxJump;

        if (maxJump >= high && r.getAction()) { // Проверка на возможность прыжка
            System.out.printf("%s jump %s meters%n", name, high);
            r.setAction(true);
        } else if (maxJump < high && r.getAction()) {
            System.out.printf("%s cant jump %s meters%n", name, high);
            r.setAction(false); // Изменение значения переменной действий робота
        }
    }
}
