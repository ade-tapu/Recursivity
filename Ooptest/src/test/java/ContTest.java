import com.sdacademy.oop.tema.Cont;
import org.junit.Test;

public class ContTest {

    @Test
    public void testContTest(){
        Cont idcont = new Cont();
        idcont.setSold(200);
        idcont.setId(1);
        idcont.setAnualInterestrate(0.2);
        System.out.println(idcont.Depunere(100));
        System.out.println(idcont.getMonthhlyInterestRate());
        System.out.println(idcont.Retragere(100));


    }
}
