package evandgeorge.raytracer.geometry;

public class Vector3f {

    
    public double x, y, z;
    
    public Vector3f(double x, double y, double z) { //creates a vector with x, y, and z values
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double magnitude() {                     //returns magnitude of vector
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3f negate() {                      //returns vector going in opposite direction
        return new Vector3f(-x, -y, -z);
    }

    public Vector3f normalize() {                   //returns a vector with the same direction and magnitude of 1
        double magnitude = magnitude();

        return new Vector3f(x / magnitude, y / magnitude, z / magnitude);
    }
}