package tool;

public class TwoDimPoint {
    
    public double x;
    public double y;

    public TwoDimPoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public TwoDimPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public TwoDimPoint(TwoDimPoint point) {
        this.x = point.x;
        this.y = point.y;
    }

    public TwoDimPoint add(TwoDimPoint point) {
        double xPrime = this.x + point.x;
        double yPrime = this.y + point.y;
        TwoDimPoint pointPrime = new TwoDimPoint(xPrime, yPrime);
        return pointPrime;
    }

    public TwoDimPoint subtract(TwoDimPoint point) {
        double xPrime = this.x - point.x;
        double yPrime = this.y - point.y;
        TwoDimPoint pointPrime = new TwoDimPoint(xPrime, yPrime);
        return pointPrime;
    }

}
