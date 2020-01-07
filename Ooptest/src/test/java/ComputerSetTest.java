import com.sdacademy.oop.ComputerSet;
import com.sdacademy.oop.Monitor;
import com.sdacademy.oop.Mouse;
import org.junit.Test;

public class ComputerSetTest {
    @Test
    public void testComputerTest(){
        Monitor monitor = new Monitor();
        monitor.setDisplaySise(55);

        Mouse mouse = new Mouse();
        mouse.setButtonCount(2);
        mouse.setOptical(true);

        ComputerSet computerSet = new ComputerSet(); // obiectele se instantiaza cu new
        computerSet.setMouse(mouse);
        computerSet.setMonitor(monitor);

      //  Monitor monitor2= new Monitor();
       // monitor2.setDisplaySise(11);
      //  ComputerSet computerSet2 = new ComputerSet();




        // assert computer set
        System.out.println(""+ computerSet);
       // computerSet.getMouse().getButtonCount();

       // Mouse mouse1 = computerSet.getMouse();
      //  int nrbutoane = mouse1.getButtonCount();


    }
}
