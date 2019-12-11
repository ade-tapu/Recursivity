import com.sdacademy.oop.temaAbstract.Patrat;
import com.sdacademy.oop.temaAbstract.Persoana;
import org.junit.Assert;
import org.junit.Test;

public class testComparable {
    @Test
    public void testComparabletest() {
        Patrat patrat1 = new Patrat(2);
        Patrat patrat2 = new Patrat(3);
        Assert.assertEquals(patrat2.compareTo(patrat1),1);

        Persoana pers1 = new Persoana(21);
        Persoana pers2 = new Persoana(25);
        Assert.assertEquals(pers1.compareTo(pers2),-1);
    }

}
