import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
   @Test
   public void testTipo() {
      Triangle triangle = new Triangle();
       System.out.println("**Test 1**");
      assertEquals("Isoceles",triangle.triangleProblem(5,5,3));
       System.out.println("**Test 2**");
      assertEquals("Equilateral",triangle.triangleProblem(5,5,5));
       System.out.println("**Test 3**");
      assertEquals("Escalene",triangle.triangleProblem(1,2,3));
   
   }
}