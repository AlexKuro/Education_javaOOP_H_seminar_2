package org.example;

public class Main {
    public static void main(String[] args) {

        Track track1 = new Track(10.0);
        Track track2 = new Track(20.0);
        Track track3 = new Track(30.0);
        Track track4 = new Track(15.0);
        Track track5 = new Track(10.0);
        Track track6 = new Track(5.0);
        Wall wall1 = new Wall(0.5);
        Wall wall2 = new Wall(1.3);
        Wall wall3 = new Wall(2.0);
        Wall wall4 = new Wall(1.5);
        Wall wall5 = new Wall(2.0);
        Wall wall6 = new Wall(1.0);

        Cat cat = new Cat("Барсик", 10.0, 2.0);
        Human human = new Human("Иваныч", 100.0, 1.1);
        Robot robot = new Robot("Астробой", 200.0, 3.0);

        SportsAffairs[] sportsAffairs = {cat, human, robot};
        System.out.println("\n Участники соревнований:");
        System.out.println("1. " + "кот " + cat.getName());
        System.out.println("2. " + human.getName());
        System.out.println("3. " + "Робот " + robot.getName());

        Boolean[] flag = {Cat.flag, Human.flag, Robot.flag};

        Track[] lTrack = {track1, track2, track3, track4, track5, track6};
        Wall[] hwall = {wall1, wall2, wall3, wall4, wall5, wall6};

        System.out.println("\n Старт соревнований:");
        for (int i = 0; i < sportsAffairs.length; i++) {
            for (SportsAffairs o : sportsAffairs) {
                System.out.print(lTrack[i] + "    \t--> ");
                o.run(lTrack[i]);
                System.out.print(hwall[i] + " \t--> ");
                o.jump(hwall[i]);
            }
        }
        System.out.println("\n Финиш соревнований:");


        System.out.println("\n Результаты соревнований:");
        for (SportsAffairs o : sportsAffairs) {
            o.result();
        }

    }
}