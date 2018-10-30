package evandgeorge.raytracer.lighting;

import java.awt.Color;

public abstract class LightSource {

    public static double net_intensity;

    Color color;
    double intensity;

    private LightSource(Color c, double i) {
        color = c;
        intensity = i;
    }

}