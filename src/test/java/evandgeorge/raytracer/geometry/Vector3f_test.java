package evandgeorge.raytracer.geometry;

import org.junit.*;
import static org.junit.Assert.*;

public class Vector3f_test {

    private final double DELTA = 1e-10;

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
        
        assertEquals(Math.sqrt(50), v3f.magnitude(), DELTA);
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

        assertEquals(1, v3f.normalize().magnitude(), DELTA);
    }

    @Test
    public void test_add() {
        Vector3f v1 = new Vector3f(5.2, 4.2, 6);
        Vector3f v2 = new Vector3f(7, 2.2, -3);

        Vector3f vSum = v1.add(v2);
        assertEquals(12.2, vSum.x, DELTA);
        assertEquals(6.4, vSum.y, DELTA);
        assertEquals(3, vSum.z, DELTA);
    }

    @Test
    public void test_subtract() {
        Vector3f v1 = new Vector3f(5.2, 4.2, 6);
        Vector3f v2 = new Vector3f(7, 2.2, -3);

        Vector3f vDif = v1.subtract(v2);
        assertEquals(-1.8, vDif.x, DELTA);
        assertEquals(2, vDif.y, DELTA);
        assertEquals(9, vDif.z, DELTA);
    }

    @Test
    public void test_multiply() {
        Vector3f v1 = new Vector3f(-5, 6.6, 6);

        Vector3f vProduct = v1.multiply(1.5);

        assertEquals(-7.5, vProduct.x, DELTA);
        assertEquals(9.9, vProduct.y, DELTA);
        assertEquals(9, vProduct.z, DELTA);
    }

    @Test
    public void test_divide() {
        Vector3f v1 = new Vector3f(-7, 3.2, .25);

        Vector3f vQuotient = v1.divide(2.5);

        assertEquals(-2.8, vQuotient.x, DELTA);
        assertEquals(1.28, vQuotient.y, DELTA);
        assertEquals(.1, vQuotient.z, DELTA);
    }

    @Test
    public void test_dotProduct() {
        Vector3f v1 = new Vector3f(-5, 6, 6);
        Vector3f v2 = new Vector3f(7, 2.5, -3);

        assertEquals(-38, v1.dotProduct(v2), DELTA);
        assertEquals(-38, v2.dotProduct(v1), DELTA);
    }

}