package tool;

import java.lang.Math;

public class Vector {
   
    public double x;
    public double y;
    public double z;

    public Vector() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(Vector vec) {
        this.x = vec.x;
        this.y = vec.y;
        this.z = vec.z;
    }

    public Vector add(Vector vec) {
        double xPrime = this.x + vec.x;
        double yPrime = this.y + vec.y;
        double zPrime = this.z + vec.z;
        Vector vecPrime = new Vector(xPrime, yPrime, zPrime);
        return vecPrime;
    }

    public Vector subtract(Vector vec) {
        double xPrime = this.x - vec.x;
        double yPrime = this.y - vec.y;
        double zPrime = this.z - vec.z;
        Vector vecPrime = new Vector(xPrime, yPrime, zPrime);
        return vecPrime;
    }

    public double dotProduct(Vector vec) {
        double scalar = (this.x * vec.x) + (this.y * vec.y) + (this.z * vec.z);
        return scalar;
    }

    public Vector crossProduct(Vector vec) {
        double xOrtho = (this.y * vec.z) - (this.z * vec.y);
        double yOrtho = (vec.x * this.z) - (this.x * vec.z);
        double zOrtho = (this.x * vec.y) - (this.y * vec.x);
        return new Vector(xOrtho, yOrtho, zOrtho);
    }

    public Vector normalize() {
        double magnitude = Math.sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
        Vector normalized = new Vector(this.x/magnitude, this.y/magnitude, this.z/magnitude);
        return normalized;
    }

    public Vector(ThreeDimPoint p1, ThreeDimPoint p2) {
        double xPrime = p2.x - p1.x;
        double yPrime = p2.y - p1.y;
        double zPrime = p2.z - p1.z;
        Vector vecPrime = new Vector(xPrime, yPrime, zPrime);
        return vecPrime;
    }
// will update later if needed so far we dont need someting that calculates magnitude. 
    // public double tude(double time) {
    //     double tude = Math.sqrt()
    // }

}
