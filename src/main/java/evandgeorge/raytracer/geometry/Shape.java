package evandgeorge.raytracer.geometry;

import evandgeorge.raytracer.lighting.Luminance;

public abstract class Shape {

    double r;               //red component of color (0 - 1)
    double g;               //green component of color (0 - 1)
    double b;               //blue component of color (0 - 1)

    double specularFactor;  //decimal value between 0 & 1. Color of ray is part
                            //reflected color and part diffuse color. Proportion
                            //is according to reflectiveness factor. 0 is a
                            //completely matte object, 1 is a perfect mirror.

    Shape(int r, int g, int b, double ref) {
        if(r > 255 || g > 255 || b > 255 || ref > 1 || r < 0 || g < 0 || b < 0 || ref < 0)
            throw new IllegalArgumentException("R: " + r + "G: " + g + "B: " + b
            + "Reflectiveness: " + ref);

        this.r = r;
        this.g = g;
        this.b = b;

        specularFactor = ref;
    }

    //method for finding the first intersection between the shape and a ray
    //implementation is shape specific
    public abstract Luminance getIlluminationByScene(Ray ray, Vector3f intersection);

}