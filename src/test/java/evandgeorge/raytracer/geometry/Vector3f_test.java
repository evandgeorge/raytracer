package evandgeorge.raytracer.geometry;

import org.junit.*;
import static org.junit.Assert.*;

public class Vector3f_test {

    @Test
    public void test_storesXYZ() {
        double x = .234;
        double y = .654;
        double z = 1.564;
        
        Vector3f v3f = new Vector3f(x, y, z);

        assertEquals(x, v3f.x, 0);
        assertEquals(y, v3f.y, 0);
        assertEquals(z, v3f.z, 0);
    }

    @Test
    public void test_magnitude() {
        double x = 3;
        double y = 4;
        double z = 5;
        
        Vector3f v3f = new Vector3f(x, y, z);
        
        assertEquals(Math.sqrt(50), v3f.magnitude(), .001);
    }

    @Test
    public void test_negate() {
        double x = .234;
        double y = .654;
        double z = 1.564;
        
        Vector3f v3f = new Vector3f(x, y, z);

        assertEquals(-x, v3f.negate().x, 0);
        assertEquals(-y, v3f.negate().y, 0);
        assertEquals(-z, v3f.negate().z, 0);
    }

    @Test
    public void test_normalize() {
        double x = 3;
        double y = 4;
        double z = 5;
        
        Vector3f v3f = new Vector3f(x, y, z);

        assertEquals(1, v3f.normalize().magnitude(), .001);
    }
}