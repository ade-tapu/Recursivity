import com.sdacademy.oop.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUser(){
     //   User user = new User("Tapu","Ade");
        User user1 = new User("Tapu","Ade",33);
        user1.setVarsta(34);

     /*   user.setNume("Tapu");
        user.setPrenume("Ade");
        user.setVarsta(33);

      */
        Assert.assertEquals(user1.getNume(),"Tapu");
        Assert.assertEquals("Tapu",user1.getNume());
        Assert.assertEquals(user1.getPrenume(),"Ade");
        Assert.assertEquals(user1.getVarsta(),33);


      /*  User user2 = new User();
        user2.setNume("Popescu");
        user2.setPrenume("Gabriel");
        user2.setVarsta(26);
        Assert.assertEquals(user2.getNume(),"Popescu");
        Assert.assertEquals("Gabriel",user.getNume());
        Assert.assertEquals(user2.getPrenume(),"Gabriel");
        Assert.assertEquals(user2.getVarsta(),26);

       */


    }

}
