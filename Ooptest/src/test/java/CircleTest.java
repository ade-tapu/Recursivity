import com.sdacademy.oop.tema.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testCircleTest(){
        Circle cerc = new Circle();
        cerc.setRaza(2.2);
        System.out.println(cerc.GetAria());

    }
}
