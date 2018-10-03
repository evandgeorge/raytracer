package evandgeorge.raytracer;

public class Vector3f {

    
    public double x, y, z;
    
    public Vector3f(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3f negate() {
        return new Vector3f(-x, -y, -z);
    }

    public Vector3f normalize() {
        double magnitude = magnitude();

        return new Vector3f(x / magnitude, y / magnitude, z / magnitude);
    }
}