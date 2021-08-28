package ru.geekbrains.homework_8;

public class Treadmill { // Создание класса беговой дорожки
    public int length;
    private String name;
    private int maxRun;

    public Treadmill(int length) { // Конструктор класса с принимаемой длиной
        this.length = length;
    }

    public void isActionH(Human h) { // Метод бега для людей
        this.name = h.name;
        this.maxRun = h.maxRun;

        if (maxRun >= length && h.getAction()) { // Проверка на возможность бега
            System.out.printf("%s ran %s meters%n", name, length);
            h.setAction(true);
        } else if (maxRun < length && h.getAction()) {
            System.out.printf("%s cant ran %s meters%n", name, length);
            h.setAction(false); // Изменение значения переменной действий человека
        }
    }

    public void isActionC(Cat c) { // Метод бега для котов
        this.name = c.name;
        this.maxRun = c.maxRun;

        if (maxRun >= length && c.getAction()) { // Проверка на возможность бега
            System.out.printf("%s ran %s meters%n", name, length);
            c.setAction(true);
        } else if (maxRun < length && c.getAction()) {
            System.out.printf("%s cant ran %s meters%n", name, length);
            c.setAction(false); // Изменение значения переменной действий кота
        }
    }

    public void isActionR(Robot r) { // Метод бега для роботов
        this.name = r.name;
        this.maxRun = r.maxRun;

        if (maxRun >= length && r.getAction()) { // Проверка на возможность бега
            System.out.printf("%s ran %s meters%n", name, length);
            r.setAction(true);
        } else if (maxRun < length && r.getAction()) {
            System.out.printf("%s cant ran %s meters%n", name, length);
            r.setAction(false); // Изменение значения переменной действий робота
        }
    }
}
