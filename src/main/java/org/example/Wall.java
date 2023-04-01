package org.example;

public class Wall {

    Double heightWall;

    public Wall(Double heightWall) {
        this.heightWall = heightWall;
    }
    @Override
    public String toString() {
        return "Высота стены " + heightWall;
    }

}
