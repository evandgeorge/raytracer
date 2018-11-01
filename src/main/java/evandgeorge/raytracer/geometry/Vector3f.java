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

        return this.divide(magnitude);
    }

    public Vector3f add(Vector3f v3f) {             //returns sum of vectors
        double sx = this.x + v3f.x;
        double sy = this.y + v3f.y;
        double sz = this.z + v3f.z;

        return new Vector3f(sx, sy, sz);
    }

    public Vector3f subtract(Vector3f v3f) {        //returns difference between vectors
        double dx = this.x - v3f.x;
        double dy = this.y - v3f.y;
        double dz = this.z - v3f.z;

        return new Vector3f(dx, dy, dz);
    }

    public Vector3f multiply(double f) {            //returns vector after its multiplied by f
        double px = this.x * f;
        double py = this.y * f;
        double pz = this.z * f;

        return new Vector3f(px, py, pz);
    }

    public Vector3f divide(double d) {              //returns vector after its divided by d
        double qx = this.x / d;
        double qy = this.y / d;
        double qz = this.z / d;

        return new Vector3f(qx, qy, qz);
    }

    public double dotProduct(Vector3f v3f) {        //returns dot product of vector
        double xProd = this.x * v3f.x;
        double yProd = this.y * v3f.y;
        double zProd = this.z * v3f.z;

        return xProd + yProd + zProd;
    }
}