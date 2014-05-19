package triangle;

import junit.framework.*;

public class TriangleTest extends TestCase
{

    public TriangleTest(String name)
    {
        super(name);
    }

    // une classe de test comprenant plusieurs cas de test
    public void testEstUnTriangle()
    {

        assertEquals(Triangle.estUnTriangle(3, 4, 2), true);
        assertEquals(Triangle.estUnTriangle(8, 0, 74), false);
        assertEquals(Triangle.estUnTriangle(2, 3, 2), true);
        assertEquals(Triangle.estUnTriangle(5, 2, 1), false);

    }

    public void testEstIsocele() throws TriangleInvalide
    {
        try
        {
            Triangle t1 = new Triangle(1, 2, 3);
            Triangle t2 = new Triangle(2, 2, 2);
            Triangle t3 = new Triangle(3, 4, 5);

            assertEquals(t1.estIsocele(), false);
            assertEquals(t2.estIsocele(), true);
            assertEquals(t3.estIsocele(), false);
        } catch (TriangleInvalide e)
        {
        }

    }

    public void testEstEquilateral() throws TriangleInvalide
    {
        try
        {
            Triangle t1 = new Triangle(1, 2, 3);
            Triangle t2 = new Triangle(2, 2, 2);
            Triangle t3 = new Triangle(3, 4, 5);

            assertEquals(t1.estEquilateral(), false);
            assertEquals(t2.estEquilateral(), true);
            assertEquals(t3.estEquilateral(), false);
        } catch (TriangleInvalide e)
        {
        }
    }

    public void testEstRectangle() throws TriangleInvalide
    {
        try
        {
            Triangle t1 = new Triangle(1, 2, 3);
            Triangle t2 = new Triangle(2, 2, 2);
            Triangle t3 = new Triangle(3, 4, 5);
            assertEquals(t1.estRectangle(), false);
            assertEquals(t2.estRectangle(), false);
            assertEquals(t3.estRectangle(), true);
        } catch (TriangleInvalide e)
        {
        }
    }

}
