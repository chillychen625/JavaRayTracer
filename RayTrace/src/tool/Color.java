package tool;

public class Color {
        
    public double[] colors;

    public Color() {
        this.colors = new double[3];
    }

    public Color(double[] colors) {
        this.colors = colors;
    }

    public double[] getColors() {
        return this.colors;
    }

    public double getRed() {
        return this.colors[0];
    }

    public double getGreen() {
        return this.colors[1];
    }

    public double getBlue() {
        return this.colors[2];
    }
}
