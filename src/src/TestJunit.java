import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
   public void testTipo() {
      Triangle triangle = new Triangle();
      assertEquals("Isoceles",triangle.triangleProblem(5,5,3));
      assertEquals("Equilateral",triangle.triangleProblem(5,5,5));
      assertEquals("Escalene",triangle.triangleProblem(1,2,3));
   
   }
}