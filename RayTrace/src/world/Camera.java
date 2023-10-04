package world;

import tool.ThreeDimPoint;
import tool.Vector;

public class Camera {
    
    public ThreeDimPoint camHome;
    public Vector angle;

    //for the sake of simplicity my camera is always going to be at 0,0,0 for now. maybe ill change that later
    //it will alwyas look 45 degrees in the positive xy direction for now. 

    public Camera() {
        ThreeDimPoint point = new ThreeDimPoint(0,0,0);
        this.camHome = point;
        Vector viewAng = new Vector(1, 1, 0);
        this.angle = viewAng;
    }
    
    public Camera(ThreeDimPoint point, Vector ang) {
        this.camHome = point;
        this.angle = ang;
    }
}
