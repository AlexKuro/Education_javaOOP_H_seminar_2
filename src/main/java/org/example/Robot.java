package org.example;

public class Robot implements SportsAffairs {

    private String name;
    private Double limitTrack;
    private Double limitWall;
    static Boolean flag = true;

    public String getName() {
        return name;
    }

    public Robot(String name, Double limitTrack, Double limitWall) {
        this.name = name;
        this.limitTrack = limitTrack;
        this.limitWall = limitWall;
    }

    @Override
    public void run(Track track) {
        if (flag) {
            if (track.lineTrack <= limitTrack) {
                System.out.println("Робот " + name + " бежит ");
            } else {
                System.out.println("Робот " + name + " не смог пробежать ");
                flag = false;
            }
        } else {
            System.out.println("Робот " + name + " с дистанции снят ");
        }
    }

    @Override
    public void jump(Wall wall) {

        if (flag) {
            if (wall.heightWall <= limitWall) {
                System.out.println("Робот " + name + " прыгает");
            } else {
                System.out.println("Робот " + name + " не смог прыгнуть ");
                flag = false;
            }
        } else {
            System.out.println("Робот " + name + " с дистанции снят ");
        }
    }

    @Override
    public void result() {
        if (flag) {
            System.out.println("Робот " + name + " успешно прошел дистанцию");
        }
        else {
            System.out.println("Робот " + name + " не пробежать дистанцию");
        }
    }
}
