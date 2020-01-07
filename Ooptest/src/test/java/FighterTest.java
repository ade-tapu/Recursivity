import com.sdacademy.oop.temaAbstract.Fighter;
import com.sdacademy.oop.temaAbstract.Hero;
import com.sdacademy.oop.temaAbstract.NonPlayerCharacter;
import org.junit.Assert;
import org.junit.Test;

public class FighterTest {
    @Test
    public void testGamer(){
        Fighter hero = new Hero(100,"10");
        NonPlayerCharacter enemy = new NonPlayerCharacter(50,"2");

        enemy.attack(hero , 2);
        Assert.assertEquals(98,hero.getLife());

        hero.attack(enemy,10);
        Assert.assertEquals(40,enemy.getLife());
    }
}
