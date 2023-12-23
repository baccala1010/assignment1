package models;

public class Shape {

    // container of Points (e.g. ArrayList<Point>)
    private Point[] points;

    // constructor that initialises a shape with an array of points
    public Shape(Point[] points) {
        this.points = points;
    }

    // perimeter() : Calculate and return the perimeter of the shape.
    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }
        // adding the last side length
        perimeter += points[points.length - 1].distanceTo(points[0]);
        // returning the calculated perimeter
        return perimeter;
    }

    // averageSide() : Calculate and return the average length of the sides in the shape.
    public double averageSide() {
        // returning the average side
        return  perimeter() / points.length;
    }

    // longestSide() : Calculate and return the average length of the sides in the shape.
    public double longestSide() {
        double longestSide = 0;
        // loop for finding the longest side except the last one
        for (int i = 0; i < points.length - 1; i++) {
            double length = points[i].distanceTo(points[i + 1]);
            if (length > longestSide) {
                longestSide = length;
            }
        }
        // choosing between the last side and the longest side obtained from the prevois loop
        longestSide = Math.max(longestSide, points[points.length - 1].distanceTo(points[0]));
        // returning the longest side
        return longestSide;
    }
}