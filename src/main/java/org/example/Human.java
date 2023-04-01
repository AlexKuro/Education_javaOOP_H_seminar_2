package org.example;

public class Human implements SportsAffairs {

    private String name;
    private Double limitTrack;
    private Double limitWall;
    static Boolean flag = true;

    public String getName() {
        return name;
    }

    public Human(String name, Double limitTrack, Double limitWall) {
        this.name = name;
        this.limitTrack = limitTrack;
        this.limitWall = limitWall;

    }

    @Override
    public void run(Track track) {
        if (flag) {
            if (track.lineTrack <= limitTrack) {
                System.out.println(name + " бежит ");
            } else {
                System.out.println(name + " не смог пробежать ");
                flag = false;
            }
        } else {
            System.out.println(name + " с дистанции снят ");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (flag) {
            if (wall.heightWall <= limitWall) {
                System.out.println(name + " прыгает ");
            } else {
                System.out.println(name + " не смог прыгнуть ");
                flag = false;
            }
        } else {
            System.out.println(name + " с дистанции снят ");
        }
    }

    @Override
    public void result() {
        if (flag) {
            System.out.println(name + " успешно прошел дистанцию");
        }
        else {
            System.out.println(name + " не пробежать дистанцию");
        }
    }
}
