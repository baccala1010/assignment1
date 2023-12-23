package models;

public class Point {
    private double x;
    private double y;

    // Constructor to initialize a point with given x and y coordinates.
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // distanceTo(Point dest) - distance from current point to the dest point
    public double distanceTo(Point destination) {
        double dX = destination.x - this.x;
        double dY = destination.y - this.y;
        return Math.sqrt(dX * dX + dY * dY);
    }

    // toString() :  Provide a string representation of the point in the format

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}