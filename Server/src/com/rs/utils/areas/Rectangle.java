package com.rs.utils.areas;

/**
 * Created by Peng on 3.8.2016.
 */
public class Rectangle extends Area {

    private final int x;
    private final int y;
    private final int x2;
    private final int y2;

    /**
     * Rectangle (x, y, x2, y2) doesn't matter which corners
     */
    public Rectangle(int x, int y, int x2, int y2) {
        this.x = x;
        this.x2 = x2;
        this.y = y;
        this.y2 = y2;
    }

    public int getSmallX() {
        return Math.min(x, x2);
    }

    public int getSmallY() {
        return Math.min(y, y2);
    }

    public int getBigX() {
        return Math.max(x, x2);
    }

    public int getBigY() {
        return Math.max(y, y2);
    }

    public boolean check(int tileX, int tileY, int firstX, int firstY, int scndX, int scndY) {
        return (tileX >= firstX && tileY >= firstY && tileX <= scndX && tileY <= scndY);
    }

    @Override
    public boolean contains(int x, int y, int z) {
        return check(x, y, getSmallX(), getSmallY(), getBigX(), getBigY());
    }

    @Override
    public String toString() {
        return "Rectangle{" + "x=" + x + ", y=" + y + ", x2=" + x2 + ", y2=" + y2 + "} " + super.toString();
    }
}
