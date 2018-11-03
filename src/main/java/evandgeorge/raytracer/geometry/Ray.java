package evandgeorge.raytracer.geometry;

public class Ray {

    Vector3f posV, dirV;  //position and direction vectors of ray

    public Ray(Vector3f posV, Vector3f dirV) {
        this.posV = posV;
        this.dirV = dirV;
    }

}