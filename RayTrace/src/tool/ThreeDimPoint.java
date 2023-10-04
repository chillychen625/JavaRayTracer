package tool;

public class ThreeDimPoint {
   
    public double x;
    public double y;
    public double z;

    public ThreeDimPoint(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public ThreeDimPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public ThreeDimPoint(ThreeDimPoint point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public ThreeDimPoint add(ThreeDimPoint point) {
        double xPrime = this.x + point.x;
        double yPrime = this.y + point.y;
        double zPrime = this.z + point.z;
        ThreeDimPoint pointPrime = new ThreeDimPoint(xPrime, yPrime, zPrime);
        return pointPrime;
    }

    public ThreeDimPoint subtract(ThreeDimPoint point) {
        double xPrime = this.x - point.x;
        double yPrime = this.y - point.y;
        double zPrime = this.z - point.z;
        ThreeDimPoint pointPrime = new ThreeDimPoint(xPrime, yPrime, zPrime);
        return pointPrime;
    }

    public double dotProduct(ThreeDimPoint point) {
        double xPrime = this.x * point.x;
        double yPrime = this.y * point.y;
        double zPrime = this.z * point.z;
        return xPrime + yPrime + zPrime;
    }

    public double dotProduct(Vector vec) {
        double xPrime = this.x * vec.x;
        double yPrime = this.y * vec.y;
        double zPrime = this.z * vec.z;
        return xPrime + yPrime + zPrime;
    }

}
