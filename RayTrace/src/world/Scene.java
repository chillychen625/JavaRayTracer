package world;

import tool.ThreeDimPoint;
import java.lang.Math;

public class Scene {
    
    public double volume;
    public double xRange;
    public double yRange;
    public double zRange;

    public Scene() {
        this.xRange = 500;
        this.yRange = 500;
        this.zRange = 500;
        this.volume = 1000000000;
    }

    public Scene(double x, double y, double z) {
        this.xRange = x;
        this.yRange = y;
        this.zRange = z;
        this.volume = (2 * x) * (2 * y) * (2 * z);
    }
    
    public boolean inRange(ThreeDimPoint point) {
        if ((Math.abs(point.x) <= 500) && (Math.abs(point.y) <= 500) && (Math.abs(point.z) <= 500)) {
            return true;
        }
        else {
            return false;
        }
    }
}
