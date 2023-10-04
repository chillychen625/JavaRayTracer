package world;

import tool.ThreeDimPoint;
import tool.Plane;
import tool.Ray;
import tool.Vector;

public class Window {
    
    public Camera cam;
    public Plane viewBox;
    public Ray perspectiveY;
    public Ray perspectiveX;

    // creates a default window that the rays will shoot through this will serve as our field of view.
    // window by defualt is 100 units from the origin of our cube facing z.
    public Window() {
        this.cam = new Camera();
        this.viewBox = new Plane(new ThreeDimPoint(100,100,0), new Vector(1,1,0));
        this.perspectiveY = new Ray(new ThreeDimPoint(-50, -50, 100), new Vector(0,1,0));
        this.perspectiveX = new Ray(new ThreeDimPoint(-50, -50, 100), new Vector(1, 0, 0));
    }
    
    //this an attrotious method i gotta make this a little bit more optimized holy shit the memory
    // absurd amounts of constructing do better cam. 
    // creates a window based on the camera, ALWAYS 100 UNITS AWAY
    public Window(Camera cam) {
        this.cam = cam;
        Vector dir = cam.angle.normalize();
        ThreeDimPoint oneHundredVecs = new ThreeDimPoint(100 * dir.x, 100 * dir.y, 100 * dir.z);
        ThreeDimPoint planeHome = cam.camHome.add(oneHundredVecs);
        this.viewBox = new Plane(planeHome, cam.angle);
        Vector origUp = new Vector(0,1,0);
        Vector newY = origUp.crossProduct(dir).normalize();
        Vector newX = dir.crossProduct(newY).normalize();
        ThreeDimPoint leftShift = new ThreeDimPoint(planeHome.x - 50 * newX.x, planeHome.y - 50 * newX.y, planeHome.z - 50 * newX.z);
        ThreeDimPoint pizza = new ThreeDimPoint(leftShift.x - 50 * newY.x, leftShift.y - 50 * newY.y, leftShift.z - 50 * leftShift.z);
        this.perspectiveY = new Ray(pizza, newY);
        this.perspectiveX = new Ray(pizza, newX);
        
    }

}
