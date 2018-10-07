package evandgeorge.raytracer.geometry;

import org.junit.*;
import static org.junit.Assert.*;

public class Ray_test {

    @Test
    public void test_storesPositionAndDirection() {
        Vector3f pos = new Vector3f(0, 0, 0);
        Vector3f dir = new Vector3f(0, 0, 0);

        Ray r = new Ray(pos, dir);
        assertEquals(pos, r.pos);
        assertEquals(dir, r.dir);
    }
}