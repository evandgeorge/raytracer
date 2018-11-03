package evandgeorge.raytracer.geometry;

import org.junit.*;
import static org.junit.Assert.*;

public class Ray_test {

    @Test
    public void test_storesPosition() {
        Vector3f pos = new Vector3f(2, -89, .345);
        Ray r = new Ray(pos, null);
        assertEquals(pos, r.posV);
    }

    @Test
    public void test_storesDirection() {
        Vector3f dir = new Vector3f(3, 5, -345);
        Ray r = new Ray(null, dir);
        assertEquals(dir, r.dirV);
    }
}