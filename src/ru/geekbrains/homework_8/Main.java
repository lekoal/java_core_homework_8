package ru.geekbrains.homework_8;

public class Main {

    public static void main(String[] args) {
        Treadmill treadmill1 = new Treadmill(13); // Создание объектов беговой дорожки с указанием длины
        Treadmill treadmill2 = new Treadmill(15);
        Treadmill treadmill3 = new Treadmill(32);
        Treadmill treadmill4 = new Treadmill(21);
        Wall wall1 = new Wall(10); // Создание объектов стены с указанием высоты
        Wall wall2 = new Wall(13);
        Wall wall3 = new Wall(9);
        Wall wall4 = new Wall(14);

        Human human1 = new Human("human1", 40, 12); // Создание объектов человек с пределами по расстоянию и высоте
        Human human2 = new Human("human2", 32, 7);
        Cat cat1 = new Cat("cat1", 13, 15); // Создание объектов кот с пределами по расстоянию и высоте
        Cat cat2 = new Cat("cat2", 15, 13);
        Robot robot1 = new Robot("robot1", 60, 2); // Создание объектов робот с пределами по расстоянию и высоте
        Robot robot2 = new Robot("robot2", 50, 3);

        Object[] obstacle = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3, treadmill4, wall4}; // Создание массива препятствий
        Object[] participants = {human1, human2, cat1, cat2, robot1, robot2}; // Создание массива участников

        for (int i = 0; i < obstacle.length; i++) {
            for (int j = 0; j < participants.length; j++) {
                if (participants[j].getClass() == Human.class) { // Проверка на принадлежность классу Human
                    if (obstacle[i].getClass() == Treadmill.class) { // Проверка на принадлежность классу Treadmill
                        ((Treadmill) obstacle[i]).isActionH((Human) participants[j]); // Вызов метода isAction
                    } else if (obstacle[i].getClass() == Wall.class) { // Проверка на принадлежность классу Wall
                        ((Wall) obstacle[i]).isActionH((Human) participants[j]); // Вызов метода isAction
                    }
                } else if (participants[j].getClass() == Cat.class) { // Проверка на принадлежность классу Cat
                    if (obstacle[i].getClass() == Treadmill.class) {
                        ((Treadmill) obstacle[i]).isActionC((Cat) participants[j]);
                    } else if (obstacle[i].getClass() == Wall.class) {
                        ((Wall) obstacle[i]).isActionC((Cat) participants[j]);
                    }
                } else if (participants[j].getClass() == Robot.class) { // Проверка на принадлежность классу Robot
                    if (obstacle[i].getClass() == Treadmill.class) {
                        ((Treadmill) obstacle[i]).isActionR((Robot) participants[j]);
                    } else if (obstacle[i].getClass() == Wall.class) {
                        ((Wall) obstacle[i]).isActionR((Robot) participants[j]);
                    }
                } else System.out.println("Didn't found this class");
            }
        }
    }
}
