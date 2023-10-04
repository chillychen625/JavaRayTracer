package tool;

public class Ray {
    
    public ThreeDimPoint point;
    public Vector vec;

    public Ray() {
        this.point = new ThreeDimPoint();
        this.vec = new Vector();
    }

    public Ray(ThreeDimPoint point, Vector vec) {
        this.point = point;
        this.vec = vec;
    }

    public ThreeDimPoint getOrigin() {
        return this.point;
    }

    public Vector getVector() {
        return this.vec;
    }

    public ThreeDimPoint pointAfterTime(double time) {
        ThreeDimPoint distance = new ThreeDimPoint(time * this.vec.x, time * this.vec.y, time * this.vec.z);
        return this.point.add(distance);
    }

}
