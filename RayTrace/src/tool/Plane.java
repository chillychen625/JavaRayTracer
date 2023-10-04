package tool;

public class Plane {
    
    public ThreeDimPoint locator;
    public Vector orthog;

    public Plane() {
        this.locator = new ThreeDimPoint();
        this.orthog = new Vector();
    }
    
    public Plane(ThreeDimPoint loc, Vector ortho) {
        this.locator = loc;
        this.orthog = ortho;
    }

    public Plane(Vector vec1, Vector vec2, ThreeDimPoint point) {
        this.locator = point;
        this.orthog = vec1.crossProduct(vec2);
    }

}
