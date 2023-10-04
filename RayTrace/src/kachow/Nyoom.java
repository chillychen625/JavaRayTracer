package kachow;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import tool.Color;
import tool.ThreeDimPoint;
import tool.Vector;
import world.Camera;
import world.Scene;
import world.Sphere;
import world.Window;
import tool.Ray;

public class Nyoom {
    public static void main(String args[]) {
        
// first we create an area for our everything to exist in using functions from world
// create a camera
// create the window
// create a sphere inside of the world prefereably in front of the camera
        
        File canvas = new File("canvas.png");
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Scene world = new Scene(1000, 1000, 1000);
        Camera cam = new Camera(new ThreeDimPoint(0,0,0), new Vector(1,1,0));
        Window screen = new Window(cam);
        double[] red = {100, 0, 0};
        Color sphereColor = new Color(red);
        Sphere sphere = new Sphere(new ThreeDimPoint(200,200,0), 20, sphereColor);
        for (int y = 0; y < 100; y++) {
            for (int x = 0; x < 100; x++) {
                ThreeDimPoint horizontalTemp = screen.perspectiveX.pointAfterTime(x);
                ThreeDimPoint veticalTemp = screen.perspectiveY.pointAfterTime(y);
                ThreeDimPoint temp = horizontalTemp.add(veticalTemp);
                Vector rayVec = new Vector(cam.camHome, temp);
                Vector normRayVec = rayVec.normalize();
                Ray ray = new Ray(cam.camHome, normRayVec);
                double lambdussy = sphere.sphereHit(ray);
                if (lambdussy > 0) {
                    img.setRGB(x, y, 10);
                }
                else {
                    img.setRGB(x, y, 0);
                }
                try {
                        ImageIO.write(img, "PNG", canvas);
                    }
                    catch (Exception e) {
                        System.out.println("fuck it didn't work");
                    }
            }
        }
        
        // File canvas = new File("canvas.png");
        // BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // for (int y = 0; y < height; y++) {
        //     for (int x = 0; x < width; x++) {
        //         img.setRGB(x, y, 0);
        //     }
        // }
        // try {
        //     ImageIO.write(img, "PNG", canvas);
        // }
        // catch (Exception e) {
        //     System.out.println("fuck it didn't work");
        // }
    }
}
