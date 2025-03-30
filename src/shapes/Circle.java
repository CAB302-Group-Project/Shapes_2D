/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

import java.awt.Point;

/**
 * Class to represent a circle shape - as this is a circle it does not
 * contain any vertices
 */

public class Circle extends Shape2D {
    //Private set
    private double radius;
    private Point centre;

    //Public get
    public double getRadius()
    {
        return radius;
    }

    /**
     * Constructor for Circle shape object
     * @param centre The centre of the circle represented as a Point object
     * @param radius The radius of the circle created
     */

    //Constructor for new circle object
    public Circle(Point centre, double radius)
    {
        super(centre);
        this.centre = (centre);
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2); // Area = Pi * r^2
    }

    @Override
    public double getPerimeter()
    {
        return Math.PI * radius * 2; // Perimeter = 2 * Pi * r
    }

    public Point[] getVertices()
    {
        return new Point[]{}; // Returns an empty array of vertices because a circle has none
    }

    @Override
    public boolean containsPoint(Point point)
    {
        // Using pythagoras to find the distance between the centre of the circle and a provided point
        double delta_x = point.getX() - centre.getX(); // Change in horizontal
        double delta_y = point.getY() - centre.getY(); // Change in vertical
        double distance_squared = Math.pow(delta_x, 2) + Math.pow(delta_y, 2); // a^2 + b^2 = c^2
        return radius >= Math.pow(distance_squared, 0.5); // Testing if the distance falls within the radius of the circle
    }

}
