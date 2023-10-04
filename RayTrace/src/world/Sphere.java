package world;

import tool.ThreeDimPoint;
import tool.Color;
import tool.Ray;

public class Sphere {
    
    public ThreeDimPoint center;
    public double radussy;
    public Color color;

    // creates a default sphere at the origin of radius 25
    public Sphere() {
        this.center = new ThreeDimPoint();
        this.radussy = 25;
        this.color = new Color();
    }

    public Sphere(ThreeDimPoint center, double radussy, Color color) {
        this.center = center;
        this.radussy = radussy;
        this.color = color;
    }

    public ThreeDimPoint getCenter() {
        return this.center;
    }

    public double getRadussy() {
        return this.radussy;
    }

    public Color getColor() {
        return this.color;
    }

    //quadratic formula moment
    public double sphereHit(Ray ray) {
        double a = ray.vec.dotProduct(ray.vec);
        double b = 2 * ray.point.subtract(this.center).dotProduct(ray.vec);
        double c = ray.point.subtract(this.center).dotProduct(ray.point.subtract(this.center)) - (radussy * radussy);
        double disc = b*b - 4*a*c;
        if (disc >= 0) {
            double lambda = (-b + Math.sqrt(disc)) / (2 * a);
            return lambda;
        }
        else {
            return 0.0;
        }
    }
}
