package evandgeorge.raytracer.lighting;

import org.junit.*;
import static org.junit.Assert.*;

public class Luminance_test {

    @Test
    public void test_storesRed() {
        double  r = 234;
        Luminance l = new Luminance(r, 0, 0, 0);
        assertEquals(r, l.r, 0);
    }

    @Test
    public void test_storesGreen() {
        double  g = 76;
        Luminance l = new Luminance(0, g, 0, 0);
        assertEquals(g, l.g, 0);
    }

    @Test
    public void test_storesBlue() {
        double b = 45;
        Luminance l = new Luminance(0, 0, b, 0);
        assertEquals(b, l.b, 0);
    }

    @Test
    public void test_storesIntensity() {
        double i = .456;
        Luminance l = new Luminance(0, 0, 0, i);
        assertEquals(i, l.i, 0);
    }
}