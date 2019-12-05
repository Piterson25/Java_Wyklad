package Punkt;

import org.junit.*;

public class PunktTest {

    @Test
    public void prototypeConstructorGetX(){
        Punkt punkt = new Punkt(1.0, 1.0);

        Punkt newPunkt = new Punkt(punkt);

        Assert.assertEquals(1.0, newPunkt.getX(), 0.001);
    }

    @Test
    public void prototypeConstructorGetY(){
        Punkt punkt = new Punkt(1.0, 1.0);

        Punkt newPunkt = new Punkt(punkt);

        Assert.assertEquals(1.0, newPunkt.getY(), 0.001);
    }

    @Test
    public void distanceFromTheSamePoint(){
        Punkt punkt = new Punkt(1.0, 1.0);

        double distance = punkt.distance(punkt);

        Assert.assertEquals(0.0, distance, 0.001);
    }

    @Test
    public void distanceFromAnotherPoint(){
        Punkt punkt1 = new Punkt(1.0, 2.0);
        Punkt punkt2 = new Punkt(1.0, 1.0);

        double distance = punkt1.distance(punkt2);

        Assert.assertEquals(1.0, distance, 0.001);
    }
}