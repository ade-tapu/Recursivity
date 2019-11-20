import com.sdacademy.oop.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testDog(){

        Dog dog1 = new Dog("Athos",7,true,"cocker",-10);
      //  Assert.assertEquals(7,dog1.getAge());
        Dog dog2 = new Dog(true,"pitbull");
        Assert.assertEquals(true,dog2.isMale());

        dog2.setWeight(-30);
        System.out.println(dog2.getWight());


    }
}
